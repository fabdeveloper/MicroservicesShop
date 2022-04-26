package fab.shop.microservices.core.purchase.services;

import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.composite.PurchaseConfirmRQ;
import fab.shop.api.core.purchase.Purchase;
import fab.shop.api.core.purchase.PurchaseService;

@RestController
public class PurchaseServiceImpl implements PurchaseService{

    private final ServiceUtil serviceUtil;


    public PurchaseServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }


    @Override
    public Purchase getPurchase(int purchaseId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Purchase createPurchase(Purchase purchase) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Purchase purchaseCancel(int purchaseId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Purchase purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {

        Purchase purchase = new Purchase(26, 
                                        purchaseConfirmRQ.getCart().getProductList(), 
                                        purchaseConfirmRQ.getUserId(), 
                                        purchaseConfirmRQ.getValuation(), 
                                        purchaseConfirmRQ.getShipmentAddress(), 
                                        purchaseConfirmRQ.getPaymentMethod(),
                                        "confirmed", getServiceUtil().getServiceAddress());

        return purchase;
    }


    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }


    
}
