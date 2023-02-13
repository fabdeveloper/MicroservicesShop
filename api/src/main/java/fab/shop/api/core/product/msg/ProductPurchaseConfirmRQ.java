package fab.shop.api.core.product.msg;

import java.util.List;
import java.util.Objects;

public class ProductPurchaseConfirmRQ {
    
    private Integer shopId;
    private List<PurchaseItem> purchaseItemsList;


    public ProductPurchaseConfirmRQ() {
    }

    public ProductPurchaseConfirmRQ(Integer shopId, List<OfferPurchase> offerPurchaseList) {
        this.shopId = shopId;
        this.offerPurchaseList = offerPurchaseList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public List<OfferPurchase> getOfferPurchaseList() {
        return this.offerPurchaseList;
    }

    public void setOfferPurchaseList(List<OfferPurchase> offerPurchaseList) {
        this.offerPurchaseList = offerPurchaseList;
    }

    public ProductPurchaseConfirmRQ shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ProductPurchaseConfirmRQ offerPurchaseList(List<OfferPurchase> offerPurchaseList) {
        setOfferPurchaseList(offerPurchaseList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductPurchaseConfirmRQ)) {
            return false;
        }
        ProductPurchaseConfirmRQ productPurchaseConfirmRQ = (ProductPurchaseConfirmRQ) o;
        return Objects.equals(shopId, productPurchaseConfirmRQ.shopId) && Objects.equals(offerPurchaseList, productPurchaseConfirmRQ.offerPurchaseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, offerPurchaseList);
    }

    @Override
    public String toString() {
        String offerListString = "{ ";
        for(OfferPurchase offerPurchase : getOfferPurchaseList()){
            offerListString += offerPurchase.toString();
            offerListString += ", ";
        }
        offerListString += " }";

        return "{" +
            " shopId='" + getShopId() + "'" +
            ", offerPurchaseList='" + offerListString + "'" +
            "}";
    }

    
}
