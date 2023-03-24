package fab.shop.api.core.purchase.transfer;

import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;

public class PurchaseConfirmException extends RuntimeException{

    private PurchaseConfirmRS purchaseConfirmRS;


    public PurchaseConfirmException() {
        super();
    }

    public PurchaseConfirmException(String cause) {
        super(cause);
    }

    public PurchaseConfirmException(Throwable cause) {
        super(cause);
    }


    public PurchaseConfirmException(PurchaseConfirmRS purchaseConfirmRS) {
        super();
        this.purchaseConfirmRS = purchaseConfirmRS;
    }

    public PurchaseConfirmException(String cause, PurchaseConfirmRS purchaseConfirmRS) {
        super(cause);
        this.purchaseConfirmRS = purchaseConfirmRS;
    }

    public PurchaseConfirmRS getPurchaseConfirmRS() {
        return this.purchaseConfirmRS;
    }

    public void setPurchaseConfirmRS(PurchaseConfirmRS purchaseConfirmRS) {
        this.purchaseConfirmRS = purchaseConfirmRS;
    }

    public PurchaseConfirmException purchaseConfirmRS(PurchaseConfirmRS purchaseConfirmRS) {
        setPurchaseConfirmRS(purchaseConfirmRS);
        return this;
    }
    

    
}
