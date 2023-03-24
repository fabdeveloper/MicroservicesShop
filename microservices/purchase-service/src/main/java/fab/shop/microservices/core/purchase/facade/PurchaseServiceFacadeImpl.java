package fab.shop.microservices.core.purchase.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import fab.shop.api.core.purchase.msg.GetPurchaseListRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseListRS;
import fab.shop.api.core.purchase.msg.GetPurchaseRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseRS;
import fab.shop.api.core.purchase.msg.PurchaseCancelRQ;
import fab.shop.api.core.purchase.msg.PurchaseCancelRS;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRQ;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;
import fab.shop.api.core.purchase.msg.PurchaseModificationRQ;
import fab.shop.api.core.purchase.msg.PurchaseModificationRS;
import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.api.core.purchase.transfer.DeliveryDetail;
import fab.shop.api.core.purchase.transfer.PaymentDetail;
import fab.shop.api.core.purchase.transfer.Purchase;
import fab.shop.api.core.purchase.transfer.PurchaseConfirmException;
import fab.shop.api.core.purchase.transfer.UserDetail;
import fab.shop.microservices.core.purchase.mapper.PurchaseMapper;
import fab.shop.microservices.core.purchase.persistence.CartDetailEntity;
import fab.shop.microservices.core.purchase.persistence.DeliveryDetailEntity;
import fab.shop.microservices.core.purchase.persistence.PaymentDetailEntity;
import fab.shop.microservices.core.purchase.persistence.PurchaseEntity;
import fab.shop.microservices.core.purchase.persistence.UserDetailEntity;
import fab.shop.microservices.core.purchase.repository.PurchaseRepository;


@Component
public class PurchaseServiceFacadeImpl implements IPurchaseServiceFacade {

    @Autowired
    private IPersistenceFacade persistenceFacade;




    public IPersistenceFacade getPersistenceFacade() {
        return this.persistenceFacade;
    }

    public void setPersistenceFacade(IPersistenceFacade persistenceFacade) {
        this.persistenceFacade = persistenceFacade;
    }




    @Override
    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {
        GetPurchaseRS rs = new GetPurchaseRS();
        Purchase purchase;
        PurchaseEntity entity;
        Integer purchaseId = getPurchaseRQ.getPurchaseId();
        PurchaseRepository repo = getPersistenceFacade().getRepository().getPurchaseRepository();
        PurchaseMapper mapper = getPersistenceFacade().getMapper().getPurchaseMapper();

        try {
            entity = repo.findById(purchaseId).get();
            purchase = mapper.entityToApi(entity);

            rs.setPurchase(purchase);
            
        } catch (Throwable e) {
            rs.addError("ERROR - unable to retrieve purchase with id= " + getPurchaseRQ.getPurchaseId() + " - msg=" + e.getMessage());
        }
        return rs;
    }

    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        GetPurchaseListRS rs = new GetPurchaseListRS();

        Integer userId = getPurchaseListRQ.getUserId();
        Integer shopId = getPurchaseListRQ.getShopId();

        List<PurchaseEntity> purchaseEntityList = null;
        List<Purchase> purchaseApiList = new ArrayList<>();
        Purchase purchase;
        try {
            purchaseEntityList = getPersistenceFacade().getRepository().getPurchaseRepository().findByUserIdAndShopId(userId, shopId).get();
            for(PurchaseEntity entity : purchaseEntityList){
                purchase = getPersistenceFacade().getMapper().getPurchaseMapper().entityToApi(entity);
                purchaseApiList.add(purchase);
            }
            rs.setPurchaseList(purchaseApiList);
            
        } catch (Throwable e) {
            rs.addError("ERROR - unable to retrieve purchase list, with userId= " + userId + ", shopId= " + shopId + ", msg= " + e.getMessage());
        }





        return rs;
    }

    @Transactional
    @Override
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        PurchaseConfirmRS rs = new PurchaseConfirmRS();     
        
        PurchaseRepository repo = getPersistenceFacade().getRepository().getPurchaseRepository();
        PurchaseMapper mapper = getPersistenceFacade().getMapper().getPurchaseMapper();

        Purchase purchase = purchaseConfirmRQ.getPurchase();


        PurchaseEntity purchaseEntity;

        try {
            UserDetail userdetailapi = purchase.getUser();
            UserDetailEntity userdetailentity = getPersistenceFacade().getMapper().getUserDetailMapper().apiToEntity(userdetailapi);
            userdetailentity = getPersistenceFacade().getRepository().getUserDetailRepository().save(userdetailentity);            
            
            DeliveryDetail deliverydetailapi = purchase.getDelivery();
            DeliveryDetailEntity deliverydetailentity = getPersistenceFacade().getMapper().getDeliveryDetailMapper().apiToEntity(deliverydetailapi);
            deliverydetailentity = getPersistenceFacade().getRepository().getDeliveryDetailRepository().save(deliverydetailentity);            
            
            CartDetail cartdetailapi = purchase.getCart();
            CartDetailEntity cartdetailentity = getPersistenceFacade().getMapper().getCartDetailMapper().apiToEntity(cartdetailapi);
            cartdetailentity = getPersistenceFacade().getRepository().getCartDetailRepository().save(cartdetailentity);            
            
            PaymentDetail paymentdetailapi = purchase.getPayment();
            PaymentDetailEntity paymentdetailentity = getPersistenceFacade().getMapper().getPaymentDetailMapper().apiToEntity(paymentdetailapi);
            paymentdetailentity = getPersistenceFacade().getRepository().getPaymentDetailRepository().save(paymentdetailentity);

            purchaseEntity = mapper.apiToEntity(purchase);

            purchaseEntity.setCart(cartdetailentity);
            purchaseEntity.setDelivery(deliverydetailentity);
            purchaseEntity.setUser(userdetailentity);
            purchaseEntity.setPayment(paymentdetailentity);

            purchaseEntity = repo.save(purchaseEntity);

            Integer bookingNumber = purchaseEntity.getId();
            rs.setPurchaseId(bookingNumber);
            rs.setStatus("CONFIRMED");
            // rs.addError("purchase = " + purchaseEntity.toString());
            
        } catch (Throwable e) {
            String msg = "ERROR - unable to create - , error message=" + e.getMessage() + ", cause= " + e.getCause();
            rs.setStatus("ERROR");
            rs.addError(msg);
            PurchaseConfirmException exception = new PurchaseConfirmException(e);
            exception.setPurchaseConfirmRS(rs);
            throw exception;
        }
        return rs;
    }
    
}
