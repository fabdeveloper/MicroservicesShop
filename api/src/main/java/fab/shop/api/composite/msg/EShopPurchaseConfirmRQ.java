package fab.shop.api.composite.msg;

import java.util.*;

import fab.shop.api.composite.transfer.PurchaseItem;

public class EShopPurchaseConfirmRQ {

    private Integer shopId;
    private Integer userId;
    private List<PurchaseItem> purchaseList;



    public EShopPurchaseConfirmRQ() {
    }

    public EShopPurchaseConfirmRQ(Integer shopId, Integer userId, List<PurchaseItem> purchaseList) {
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

    public EShopPurchaseConfirmRQ shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public EShopPurchaseConfirmRQ userId(Integer userId) {
        setUserId(userId);
        return this;
    }

    public EShopPurchaseConfirmRQ purchaseList(List<PurchaseItem> purchaseList) {
        setPurchaseList(purchaseList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EShopPurchaseConfirmRQ)) {
            return false;
        }
        EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ = (EShopPurchaseConfirmRQ) o;
        return Objects.equals(shopId, eShopPurchaseConfirmRQ.shopId) && Objects.equals(userId, eShopPurchaseConfirmRQ.userId) && Objects.equals(purchaseList, eShopPurchaseConfirmRQ.purchaseList);
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
