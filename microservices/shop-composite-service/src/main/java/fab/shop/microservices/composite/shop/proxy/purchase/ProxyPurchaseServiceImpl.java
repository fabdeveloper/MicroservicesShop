package fab.shop.microservices.composite.shop.proxy.purchase;

import org.springframework.stereotype.Component;

import fab.shop.api.core.purchase.msg.*;

@Component
public class ProxyPurchaseServiceImpl implements IProxyPurchaseService{

    @Override
    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {

        return null;
    }

    @Override
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {
        return null;
    }

    @Override
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {
        return null;
    }

    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        return null;
    }

    @Override
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        return null;
    }
    
}
