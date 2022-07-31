package fab.shop.microservices.core.purchase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;

import fab.shop.api.core.purchase.PurchaseService;
import fab.shop.api.core.purchase.msg.GetPurchaseListRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseListRS;
import fab.shop.api.core.purchase.msg.GetPurchaseRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseRS;
import fab.shop.api.core.purchase.msg.PurchaseCancelRQ;
import fab.shop.api.core.purchase.msg.PurchaseCancelRS;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;
import fab.shop.api.core.purchase.msg.PurchaseModificationRQ;
import fab.shop.api.core.purchase.msg.PurchaseModificationRS;

@RestController
public class PurchaseServiceImpl implements PurchaseService{

    private final ServiceUtil serviceUtil;


    @Autowired
    public PurchaseServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }


    // @Override
    // public Purchase getPurchase(int purchaseId) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    // @Override
    // public Purchase createPurchase(Purchase purchase) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    // @Override
    // public Purchase purchaseCancel(int purchaseId) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    // @Override
    // public Purchase purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {

    //     Purchase purchase = new Purchase(26, 
    //                                     purchaseConfirmRQ.getCart().getProductList(), 
    //                                     purchaseConfirmRQ.getUserId(), 
    //                                     purchaseConfirmRQ.getValuation(), 
    //                                     purchaseConfirmRQ.getShipmentAddress(), 
    //                                     purchaseConfirmRQ.getPaymentMethod(),
    //                                     "confirmed", getServiceUtil().getServiceAddress());

    //     return purchase;
    // }


    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
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
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public PurchaseConfirmRS purchaseConfirm(fab.shop.api.core.purchase.msg.PurchaseConfirmRQ purchaseConfirmRQ) {
        // TODO Auto-generated method stub
        return null;
    }


    
}
