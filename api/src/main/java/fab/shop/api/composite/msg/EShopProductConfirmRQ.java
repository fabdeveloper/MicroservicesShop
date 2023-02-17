package fab.shop.api.composite.msg;

import java.util.List;
import java.util.Objects;

import fab.shop.api.composite.transfer.PurchaseItem;

public class EShopProductConfirmRQ {
    private Integer shopId;
    private Integer userId;
    private List<PurchaseItem> purchaseList;


    public EShopProductConfirmRQ() {
    }

    public EShopProductConfirmRQ(Integer shopId, Integer userId, List<PurchaseItem> purchaseList) {
        this.shopId = shopId;
        this.userId = userId;
        this.purchaseList = purchaseList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<PurchaseItem> getPurchaseList() {
        return this.purchaseList;
    }

    public void setPurchaseList(List<PurchaseItem> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public EShopProductConfirmRQ shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public EShopProductConfirmRQ userId(Integer userId) {
        setUserId(userId);
        return this;
    }

    public EShopProductConfirmRQ purchaseList(List<PurchaseItem> purchaseList) {
        setPurchaseList(purchaseList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EShopProductConfirmRQ)) {
            return false;
        }
        EShopProductConfirmRQ eShopProductConfirmRQ = (EShopProductConfirmRQ) o;
        return Objects.equals(shopId, eShopProductConfirmRQ.shopId) && Objects.equals(userId, eShopProductConfirmRQ.userId) && Objects.equals(purchaseList, eShopProductConfirmRQ.purchaseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, userId, purchaseList);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", purchaseList='" + getPurchaseList() + "'" +
            "}";
    }

}
