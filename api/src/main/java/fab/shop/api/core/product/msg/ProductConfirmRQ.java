package fab.shop.api.core.product.msg;

import java.util.List;
import java.util.Objects;

import fab.shop.api.composite.transfer.PurchaseItem;

public class ProductConfirmRQ {
    
    private Integer shopId;
    private List<PurchaseItem> purchaseItemsList;



    public ProductConfirmRQ() {
    }

    public ProductConfirmRQ(Integer shopId, List<PurchaseItem> purchaseItemsList) {
        this.shopId = shopId;
        this.purchaseItemsList = purchaseItemsList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public List<PurchaseItem> getPurchaseItemsList() {
        return this.purchaseItemsList;
    }

    public void setPurchaseItemsList(List<PurchaseItem> purchaseItemsList) {
        this.purchaseItemsList = purchaseItemsList;
    }

    public ProductConfirmRQ shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ProductConfirmRQ purchaseItemsList(List<PurchaseItem> purchaseItemsList) {
        setPurchaseItemsList(purchaseItemsList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductConfirmRQ)) {
            return false;
        }
        ProductConfirmRQ productConfirmRQ = (ProductConfirmRQ) o;
        return Objects.equals(shopId, productConfirmRQ.shopId) && Objects.equals(purchaseItemsList, productConfirmRQ.purchaseItemsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, purchaseItemsList);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", purchaseItemsList='" + getPurchaseItemsList() + "'" +
            "}";
    }

    
    
}
