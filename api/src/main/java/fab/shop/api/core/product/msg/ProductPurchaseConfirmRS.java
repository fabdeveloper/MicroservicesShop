package fab.shop.api.core.product.msg;

import java.util.List;
import java.util.Objects;

public class ProductPurchaseConfirmRS {


    
    private Integer shopId;    

    private List<OfferAvail> offerAvailList;
    private Boolean bConfirmed;
    private Integer productBookingNumber;
    private String status;



    public ProductPurchaseConfirmRS() {
    }

    public ProductPurchaseConfirmRS(Integer shopId, List<OfferAvail> offerAvailList, Boolean bConfirmed, Integer productBookingNumber, String status) {
        this.shopId = shopId;
        this.offerAvailList = offerAvailList;
        this.bConfirmed = bConfirmed;
        this.productBookingNumber = productBookingNumber;
        this.status = status;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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

    public Integer getProductBookingNumber() {
        return this.productBookingNumber;
    }

    public void setProductBookingNumber(Integer productBookingNumber) {
        this.productBookingNumber = productBookingNumber;
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

    public ProductPurchaseConfirmRS offerAvailList(List<OfferAvail> offerAvailList) {
        setOfferAvailList(offerAvailList);
        return this;
    }

    public ProductPurchaseConfirmRS bConfirmed(Boolean bConfirmed) {
        setBConfirmed(bConfirmed);
        return this;
    }

    public ProductPurchaseConfirmRS productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    public ProductPurchaseConfirmRS status(String status) {
        setStatus(status);
        return this;
    }

    
    
    @Override
    public String toString() {
        String offerAvailListString = "{ ";
        for(OfferAvail offerAvail : getOfferAvailList()){
            offerAvailListString += offerAvail.toString();
            offerAvailListString += ", ";
        }
        offerAvailListString += " }";

        return "{" +
            " shopId='" + getShopId() + "'" +
            ", offerAvailList='" + offerAvailListString + "'" +
            ", bConfirmed='" + isBConfirmed() + "'" +
            ", productBookingNumber='" + getProductBookingNumber() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }

    


}
