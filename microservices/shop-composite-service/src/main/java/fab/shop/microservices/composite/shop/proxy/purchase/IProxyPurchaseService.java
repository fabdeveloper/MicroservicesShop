package fab.shop.microservices.composite.shop.proxy.purchase;


import fab.shop.api.core.purchase.msg.*;




public interface IProxyPurchaseService{

    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ);
    
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ);
    
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ);
    
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ);
    
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ);
    
    
}
