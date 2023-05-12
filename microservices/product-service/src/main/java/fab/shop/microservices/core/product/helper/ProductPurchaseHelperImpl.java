package fab.shop.microservices.core.product.helper;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fab.shop.api.core.product.msg.ProductBookingRQ;
import fab.shop.api.core.product.msg.ProductBookingRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.api.core.product.transfer.OfferPurchase;
import fab.shop.api.exceptions.ProductAvailabilityException;
import fab.shop.api.exceptions.ProductBookingException;
import fab.shop.api.exceptions.ProductReduceStockException;
import fab.shop.microservices.core.product.facade.IPersistenceFacade;
import fab.shop.microservices.core.product.persistence.OfferEntity;
import fab.shop.microservices.core.product.persistence.OfferPurchaseEntity;
import fab.shop.microservices.core.product.persistence.ProductBookingEntity;


@Component
public class ProductPurchaseHelperImpl implements IProductPurchaseHelper { 

    @Autowired
    private IPersistenceFacade persistenceFacade;


    public ProductPurchaseHelperImpl() {
    }


    @Override
    public Boolean checkAvailability(OfferPurchase offerPurchase) {
        Boolean bResponse = true;
        Integer offerId;
        Integer count;
        OfferEntity entity;

        offerId = offerPurchase.getOfferId();
        count = offerPurchase.getCount();

        try {
            entity = getPersistenceFacade().getPersistenceHelper().getOfferRepository().findById(offerId).get();
        } catch (Throwable e) {
            return false;
        }

        if(entity == null || entity.getAvailCount() < count){
            bResponse = false;         
        }
        return bResponse;
    }

    @Transactional
    @Override
    public Boolean decrementStock(OfferPurchase offerPurchase) {
        Boolean bResponse = true;
        Integer offerId;
        Integer count;
        Integer unitsAvail;
        OfferEntity entity;

        offerId = offerPurchase.getOfferId();
        count = offerPurchase.getCount();
        try {
            entity = getPersistenceFacade().getPersistenceHelper().getOfferRepository().findById(offerId).get();
        } catch (Throwable e) {
            return false;
        }
        if(entity == null || entity.getAvailCount() < count){
            return false;          
        }else{
            unitsAvail = entity.getAvailCount();
            entity.setAvailCount(unitsAvail-count);
            try {
                entity = getPersistenceFacade().getPersistenceHelper().getOfferRepository().save(entity);
            } catch (Throwable e) {
                return false;
            }
        }
        return bResponse;
    }

    @Transactional
    @Override
    public ProductBookingRS bookPurchaseList(ProductBookingRQ productConfirmRQ) throws ProductBookingException {
        ProductBookingRS rs = new ProductBookingRS();
        rs.setShopId(productConfirmRQ.getShopId());

        Integer offerId;
        Integer count;

        List<OfferPurchase> purchaseList = productConfirmRQ.getOfferPurchaseList();
        String sError;

        // availability
        Boolean bAvail = true;
        for(OfferPurchase offerPurchase : purchaseList){            
            if(!checkAvailability(offerPurchase)){
                bAvail = false;
                sError = "AVAILABILITY ERROR -  offerId: " + offerPurchase.getOfferId();
                rs.addError(sError);
            }
        }
        if(!bAvail){
            rs.setBConfirmed(false);
            AvailabilityException availabilityException = new AvailabilityException();
            availabilityException.setProductConfirmRS(rs);
            throw availabilityException;
        }

        // book
        ProductBookingEntity bookEntity = new ProductBookingEntity();
        try {
            bookEntity = getPersistenceFacade().getPersistenceHelper().getProductBookingRepository().save(bookEntity);
            List<OfferPurchaseEntity> entityList = getPersistenceFacade().getGeneralMapper().getOfferPurchaseMapper().apiListToEntityList(purchaseList);

            for(OfferPurchaseEntity offerPurchaseEntity : entityList){
                offerPurchaseEntity.setBook(bookEntity);
                getPersistenceFacade().getPersistenceHelper().getOfferPurchaseRepository().save(offerPurchaseEntity);
            }

        } catch (Throwable e) {
            sError = "ERROR - not saved - msg: " + e.getMessage();
            rs.addError(sError);
            rs.setBConfirmed(false);

            ProductBookingException exception = new ProductBookingException();
            exception.setProductConfirmRS(rs);

            throw exception;
        }

        // decrement stock
        boolean bDec = true;
        for(OfferPurchase offerPurchase : purchaseList){
            if(!decrementStock(offerPurchase)){
                bDec = false;
                sError = "ERROR - stock modification - offerId: " + offerPurchase.getOfferId();
                rs.addError(sError);
            }
        }
        if(!bDec){
            rs.setBConfirmed(false);
            ProductReduceStockException exception = new ProductReduceStockException();
            exception.setProductPurchaseConfirmRS(rs);
            throw exception;
        }   
        


        rs.setProductBookingNumber(bookEntity.getId());

        rs.setBConfirmed(true);
        return rs;
    }

    @Transactional
    @Override
    public ProductPurchaseConfirmRS purchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {

        ProductPurchaseConfirmRS rs = new ProductPurchaseConfirmRS(productPurchaseConfirmRQ.getProductBookingNumber(), productPurchaseConfirmRQ.getUserId(), false, productPurchaseConfirmRQ.getShopId(), productPurchaseConfirmRQ.getProductBookingTime(), null);

        Integer bookingNumber = productPurchaseConfirmRQ.getProductBookingNumber();

        // productBookingNumber exists ?
        ProductBookingEntity entity = null;
        try {
            entity = getPersistenceFacade().getPersistenceHelper().getProductBookingRepository().findById(bookingNumber).get();            
        } catch (Exception e) {
            rs.addError("Exception booking not found - msg= " + e.getMessage());
            return rs;
        }

        if(entity != null){
                    // productBookingEntity set flag bConfirmed=true
            entity.setBConfirmed(true);
                    // save
            try {                
                entity = getPersistenceFacade().getPersistenceHelper().getProductBookingRepository().save(entity);
                rs.setbConfirmed(entity.getBConfirmed());
            } catch (Exception e) {
                rs.addError("Exception - msg= " + e.getMessage());
            }
        }
        return rs;
    }


    public IPersistenceFacade getPersistenceFacade() {
        return this.persistenceFacade;
    }

    public void setPersistenceFacade(IPersistenceFacade persistenceFacade) {
        this.persistenceFacade = persistenceFacade;
    }




    
}
