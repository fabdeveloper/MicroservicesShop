package fab.shop.api.core.purchase.msg;

import java.util.List;

import fab.shop.api.core.purchase.Purchase;

public class GetPurchaseListRS {
    private List<Purchase> purchaseList;



    public List<Purchase> getPurchaseList() {
        return this.purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

}
