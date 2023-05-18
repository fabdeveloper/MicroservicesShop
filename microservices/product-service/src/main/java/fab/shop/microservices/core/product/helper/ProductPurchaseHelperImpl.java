package fab.shop.microservices.core.product.helper;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fab.shop.api.core.product.msg.ProductBookingRQ;
import fab.shop.api.core.product.msg.ProductBookingRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.api.core.product.msg.ProductServiceErrorListRS;
import fab.shop.api.core.product.transfer.OfferPurchase;
import fab.shop.api.core.product.exception.ProductAvailabilityException;
import fab.shop.api.core.product.exception.ProductBookingException;
import fab.shop.api.core.product.exception.ProductReduceStockException;
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
    public Boolean checkAvailability(OfferPurchase offerPurchase)  throws ProductAvailabilityException{
        ProductAvailabilityException availException = new ProductAvailabilityException();
        ProductServiceErrorListRS rs = new ProductServiceErrorListRS(null); 
        Boolean bResponse = false;
        Integer offerId;
        Integer count;
        OfferEntity entity = null;

        offerId = offerPurchase.getOfferId();
        count = offerPurchase.getCount();

        try {
            Optional<OfferEntity> opt =  getPersistenceFacade().getPersistenceHelper().getOfferRepository().findById(offerId);            
            if(opt.isPresent()){
                entity = opt.get();
                bResponse = true;
            }
        } catch (Exception e) {
            rs.addError("Availability Exception " + e.getMessage());  
            availException.setRs(rs);    
            throw availException;
        }

        if(entity == null || entity.getAvailCount() < count){
            rs.addError("Availability Exception ");  
            availException.setRs(rs);    
            throw availException;   
        }
        return bResponse;
    }

    @Transactional
    @Override
    public Boolean decrementStock(OfferPurchase offerPurchase) throws ProductReduceStockException {
        ProductReduceStockException exception = new ProductReduceStockException();
        ProductServiceErrorListRS rs = new ProductServiceErrorListRS(null);

        Boolean bResponse = false;
        Integer offerId = offerPurchase.getOfferId();
        Integer count = offerPurchase.getCount();
        Integer unitsAvail;
        OfferEntity entity;

        // find offer
        try {
            Optional<OfferEntity> opt = getPersistenceFacade().getPersistenceHelper().getOfferRepository().findById(offerId);
            if(opt.isPresent()){
                entity = opt.get();
            }
        } catch (Exception e) {
            rs.addError("OfferId= " +  offerId + " NOT FOUND - msg= " + e.getMessage());
            exception.setRs(rs);
            throw exception;
        }
        if(entity == null || entity.getAvailCount() < count){
            rs.addError("OfferId= " +  offerId + ", NOT ENOUGH units AVAILABLE");
            exception.setRs(rs);
            throw exception;

        }else{
            unitsAvail = entity.getAvailCount();
            entity.setAvailCount(unitsAvail-count);
            try {
                getPersistenceFacade().getPersistenceHelper().getOfferRepository().save(entity);
                bResponse = true;
            } catch (Exception e) {
                rs.addError("Error decrementing stock - msg= " + e.getMessage());
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
            ProductAvailabilityException availabilityException = new ProductAvailabilityException();
            availabilityException.setRs(rs);
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
            exception.setRs(rs);

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
            exception.setRs(rs);
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
                rs.setBConfirmed(entity.getBConfirmed());
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
