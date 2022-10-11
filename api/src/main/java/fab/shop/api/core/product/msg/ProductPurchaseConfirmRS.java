package fab.shop.api.core.product.msg;

import java.util.List;
import java.util.Objects;

public class ProductPurchaseConfirmRS {
    
    private Integer shopId;
    private List<OfferPurchase> offerPurchaseOKList;
    private List<OfferPurchase> offerPurchaseKOList;
    private List<OfferAvail> offerAvailList;
    private Boolean bConfirmed;
    private String status;


    public ProductPurchaseConfirmRS() {
    }

    public ProductPurchaseConfirmRS(Integer shopId, List<OfferPurchase> offerPurchaseOKList, List<OfferPurchase> offerPurchaseKOList, List<OfferAvail> offerAvailList, Boolean bConfirmed, String status) {
        this.shopId = shopId;
        this.offerPurchaseOKList = offerPurchaseOKList;
        this.offerPurchaseKOList = offerPurchaseKOList;
        this.offerAvailList = offerAvailList;
        this.bConfirmed = bConfirmed;
        this.status = status;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public List<OfferPurchase> getOfferPurchaseOKList() {
        return this.offerPurchaseOKList;
    }

    public void setOfferPurchaseOKList(List<OfferPurchase> offerPurchaseOKList) {
        this.offerPurchaseOKList = offerPurchaseOKList;
    }

    public List<OfferPurchase> getOfferPurchaseKOList() {
        return this.offerPurchaseKOList;
    }

    public void setOfferPurchaseKOList(List<OfferPurchase> offerPurchaseKOList) {
        this.offerPurchaseKOList = offerPurchaseKOList;
    }

    public List<OfferAvail> getOfferAvailList() {
        return this.offerAvailList;
    }

    public void setOfferAvailList(List<OfferAvail> offerAvailList) {
        this.offerAvailList = offerAvailList;
    }

    public Boolean isBConfirmed() {
        return this.bConfirmed;
    }

    public Boolean getBConfirmed() {
        return this.bConfirmed;
    }

    public void setBConfirmed(Boolean bConfirmed) {
        this.bConfirmed = bConfirmed;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductPurchaseConfirmRS shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ProductPurchaseConfirmRS offerPurchaseOKList(List<OfferPurchase> offerPurchaseOKList) {
        setOfferPurchaseOKList(offerPurchaseOKList);
        return this;
    }

    public ProductPurchaseConfirmRS offerPurchaseKOList(List<OfferPurchase> offerPurchaseKOList) {
        setOfferPurchaseKOList(offerPurchaseKOList);
        return this;
    }

    public ProductPurchaseConfirmRS offerAvailList(List<OfferAvail> offerAvailList) {
        setOfferAvailList(offerAvailList);
        return this;
    }

    public ProductPurchaseConfirmRS bConfirmed(Boolean bConfirmed) {
        setBConfirmed(bConfirmed);
        return this;
    }

    public ProductPurchaseConfirmRS status(String status) {
        setStatus(status);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductPurchaseConfirmRS)) {
            return false;
        }
        ProductPurchaseConfirmRS productPurchaseConfirmRS = (ProductPurchaseConfirmRS) o;
        return Objects.equals(shopId, productPurchaseConfirmRS.shopId) && Objects.equals(offerPurchaseOKList, productPurchaseConfirmRS.offerPurchaseOKList) && Objects.equals(offerPurchaseKOList, productPurchaseConfirmRS.offerPurchaseKOList) && Objects.equals(offerAvailList, productPurchaseConfirmRS.offerAvailList) && Objects.equals(bConfirmed, productPurchaseConfirmRS.bConfirmed) && Objects.equals(status, productPurchaseConfirmRS.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, offerPurchaseOKList, offerPurchaseKOList, offerAvailList, bConfirmed, status);
    }

    @Override
    public String toString() {

        String offerListOKString = "{ ";
        for(OfferPurchase offerPurchase : getOfferPurchaseOKList()){
            offerListOKString += offerPurchase.toString();
            offerListOKString += ", ";
        }
        offerListOKString += " }";

        String offerListKOString = "{ ";
        for(OfferPurchase offerPurchase : getOfferPurchaseKOList()){
            offerListKOString += offerPurchase.toString();
            offerListKOString += ", ";
        }
        offerListKOString += " }";


        String offerAvailListString = "{ ";
        for(OfferAvail offerAvail : getOfferAvailList()){
            offerAvailListString += offerAvail.toString();
            offerAvailListString += ", ";
        }
        offerAvailListString += " }";

        return "{" +
            " shopId='" + getShopId() + "'" +
            ", offerPurchaseOKList='" + offerListOKString + "'" +
            ", offerPurchaseKOList='" + offerListKOString + "'" +
            ", offerAvailList='" + offerAvailListString + "'" +
            ", bConfirmed='" + isBConfirmed() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }


}
