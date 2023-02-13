package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductPurchaseConfirmRS {


    
    private Integer shopId;    

    private Boolean bConfirmed;
    private Integer productBookingNumber;
    private List<OfferPurchase> offerPurchaseList;
    private List<String> errorList;



    public ProductPurchaseConfirmRS() {
    }

    public ProductPurchaseConfirmRS(Integer shopId, Boolean bConfirmed, Integer productBookingNumber, List<OfferPurchase> offerPurchaseList, List<String> errorList) {
        this.shopId = shopId;
        this.bConfirmed = bConfirmed;
        this.productBookingNumber = productBookingNumber;
        this.offerPurchaseList = offerPurchaseList;
        this.errorList = errorList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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

    public List<OfferPurchase> getOfferPurchaseList() {
        return this.offerPurchaseList;
    }

    public void setOfferPurchaseList(List<OfferPurchase> offerPurchaseList) {
        this.offerPurchaseList = offerPurchaseList;
    }

    public List<String> getErrorList() {
        return this.errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    public ProductPurchaseConfirmRS shopId(Integer shopId) {
        setShopId(shopId);
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

    public ProductPurchaseConfirmRS offerPurchaseList(List<OfferPurchase> offerPurchaseList) {
        setOfferPurchaseList(offerPurchaseList);
        return this;
    }

    public ProductPurchaseConfirmRS errorList(List<String> errorList) {
        setErrorList(errorList);
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
        return Objects.equals(shopId, productPurchaseConfirmRS.shopId) && Objects.equals(bConfirmed, productPurchaseConfirmRS.bConfirmed) && Objects.equals(productBookingNumber, productPurchaseConfirmRS.productBookingNumber) && Objects.equals(offerPurchaseList, productPurchaseConfirmRS.offerPurchaseList) && Objects.equals(errorList, productPurchaseConfirmRS.errorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, bConfirmed, productBookingNumber, offerPurchaseList, errorList);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", bConfirmed='" + isBConfirmed() + "'" +
            ", productBookingNumber='" + getProductBookingNumber() + "'" +
            ", offerPurchaseList='" + getOfferPurchaseList() + "'" +
            ", errorList='" + getErrorList() + "'" +
            "}";
    }
    
}
