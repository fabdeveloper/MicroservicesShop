package fab.shop.microservices.core.product.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import fab.shop.api.core.product.msg.OfferPurchase;
import fab.shop.api.exceptions.ProductPurchaseConfirmBookingException;
import fab.shop.microservices.core.product.facade.IPersistenceFacade;
import fab.shop.microservices.core.product.persistence.OfferEntity;

public class ProductPurchaseHelperImpl implements IProductPurchaseHelper { 

    @Autowired
    private IPersistenceFacade persistenceFacade;


    public ProductPurchaseHelperImpl() {
    }


    @Override
    public Boolean checkAvailability(List<OfferPurchase> purchaseList) {
        Boolean bResponse = true;
        Integer offerId;
        Integer count;
        OfferEntity entity;

        for(OfferPurchase offerPurchase : purchaseList){
            offerId = offerPurchase.getOfferId();
            count = offerPurchase.getCount();

            entity = getPersistenceFacade().getPersistenceHelper().getOfferRepository().findById(offerId).get();
            if(entity == null || entity.getAvailCount() < count){
                bResponse = false;         
            }
        }
        return bResponse;
    }

    @Transactional
    @Override
    public Boolean decrementStock(List<OfferPurchase> purchaseList) {
        Boolean bResponse = true;
        Integer offerId;
        Integer count;
        Integer unitsAvail;
        OfferEntity entity;

        for(OfferPurchase offerPurchase : purchaseList){
            offerId = offerPurchase.getOfferId();
            count = offerPurchase.getCount();

            entity = getPersistenceFacade().getPersistenceHelper().getOfferRepository().findById(offerId).get();
            if(entity == null || entity.getAvailCount() < count){
                bResponse = false;          
            }else{
                unitsAvail = entity.getAvailCount();
                entity.setAvailCount(unitsAvail-count);
                try {
                    entity = getPersistenceFacade().getPersistenceHelper().getOfferRepository().save(entity);
                } catch (Exception e) {
                    bResponse = false;
                }
            }
        }
        return bResponse;
    }

    @Transactional
    @Override
    public Integer bookPurchaseList(List<OfferPurchase> purchaseList) throws ProductPurchaseConfirmBookingException {
        // TODO Auto-generated method stub
        return null;
    }


    public IPersistenceFacade getPersistenceFacade() {
        return this.persistenceFacade;
    }

    public void setPersistenceFacade(IPersistenceFacade persistenceFacade) {
        this.persistenceFacade = persistenceFacade;
    }

    
}
