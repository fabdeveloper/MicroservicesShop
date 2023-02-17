package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ProductConfirmRS {


    private Integer shopId;
    private Boolean bConfirmed;
    private Integer productBookingNumber;
    private List<OfferPurchase> productPurchaseList;
    private List<String> errorList;
    private Date productBookingTime;




    public ProductConfirmRS() {
    }

    public ProductConfirmRS(Integer shopId, Boolean bConfirmed, Integer productBookingNumber, List<OfferPurchase> productPurchaseList, List<String> errorList, Date productBookingTime) {
        this.shopId = shopId;
        this.bConfirmed = bConfirmed;
        this.productBookingNumber = productBookingNumber;
        this.productPurchaseList = productPurchaseList;
        this.errorList = errorList;
        this.productBookingTime = productBookingTime;
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

    public List<OfferPurchase> getProductPurchaseList() {
        return this.productPurchaseList;
    }

    public void setProductPurchaseList(List<OfferPurchase> productPurchaseList) {
        this.productPurchaseList = productPurchaseList;
    }

    public List<String> getErrorList() {
        return this.errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    public Date getProductBookingTime() {
        return this.productBookingTime;
    }

    public void setProductBookingTime(Date productBookingTime) {
        this.productBookingTime = productBookingTime;
    }

    public ProductConfirmRS shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ProductConfirmRS bConfirmed(Boolean bConfirmed) {
        setBConfirmed(bConfirmed);
        return this;
    }

    public ProductConfirmRS productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    public ProductConfirmRS productPurchaseList(List<OfferPurchase> productPurchaseList) {
        setProductPurchaseList(productPurchaseList);
        return this;
    }

    public ProductConfirmRS errorList(List<String> errorList) {
        setErrorList(errorList);
        return this;
    }

    public ProductConfirmRS productBookingTime(Date productBookingTime) {
        setProductBookingTime(productBookingTime);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductConfirmRS)) {
            return false;
        }
        ProductConfirmRS productConfirmRS = (ProductConfirmRS) o;
        return Objects.equals(shopId, productConfirmRS.shopId) && Objects.equals(bConfirmed, productConfirmRS.bConfirmed) && Objects.equals(productBookingNumber, productConfirmRS.productBookingNumber) && Objects.equals(productPurchaseList, productConfirmRS.productPurchaseList) && Objects.equals(errorList, productConfirmRS.errorList) && Objects.equals(productBookingTime, productConfirmRS.productBookingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, bConfirmed, productBookingNumber, productPurchaseList, errorList, productBookingTime);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", bConfirmed='" + isBConfirmed() + "'" +
            ", productBookingNumber='" + getProductBookingNumber() + "'" +
            ", productPurchaseList='" + getProductPurchaseList() + "'" +
            ", errorList='" + getErrorList() + "'" +
            ", productBookingTime='" + getProductBookingTime() + "'" +
            "}";
    }
    
    
}
