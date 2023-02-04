package fab.shop.api.composite.msg;

public class EShopPurchaseConfirmException extends RuntimeException {

    private EShopPurchaseConfirmRS eShopPurchaseConfirmRS;



    
    public EShopPurchaseConfirmRS getEShopPurchaseConfirmRS(){
        return this.eShopPurchaseConfirmRS;
    }

    public void setEShopPurchaseConfirmRS(EShopPurchaseConfirmRS eShopPurchaseConfirmRS){
        this.eShopPurchaseConfirmRS = eShopPurchaseConfirmRS;
    }
    
}
