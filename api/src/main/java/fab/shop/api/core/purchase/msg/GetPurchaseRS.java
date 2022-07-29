package fab.shop.api.core.purchase.msg;

import fab.shop.api.core.purchase.Purchase;

public class GetPurchaseRS {
 
    private Purchase purchase;

    public Purchase getPurchase() {
        return this.purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

}
