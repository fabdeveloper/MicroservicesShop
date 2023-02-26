package fab.shop.api.composite.exception;

import fab.shop.api.composite.msg.EShopPurchaseConfirmRS;

public class EShopPurchaseConfirmException extends RuntimeException {

    private EShopPurchaseConfirmRS eShopPurchaseConfirmRS;



    
    public EShopPurchaseConfirmRS getEShopPurchaseConfirmRS(){
        return this.eShopPurchaseConfirmRS;
    }

    public void setEShopPurchaseConfirmRS(EShopPurchaseConfirmRS eShopPurchaseConfirmRS){
        this.eShopPurchaseConfirmRS = eShopPurchaseConfirmRS;
    }
    
}
