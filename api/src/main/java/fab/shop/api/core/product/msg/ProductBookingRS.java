package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import fab.shop.api.core.product.transfer.OfferPurchase;

public class ProductBookingRS extends ProductServiceErrorListRS{


    private Integer shopId;
    private Boolean bConfirmed;
    private Integer productBookingNumber;
    private List<OfferPurchase> productPurchaseList;
    private Date productBookingTime;




    public ProductBookingRS() {
    }

    public ProductBookingRS(Integer shopId, Boolean bConfirmed, Integer productBookingNumber, List<OfferPurchase> productPurchaseList, List<String> errorList, Date productBookingTime) {
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


    public Date getProductBookingTime() {
        return this.productBookingTime;
    }

    public void setProductBookingTime(Date productBookingTime) {
        this.productBookingTime = productBookingTime;
    }

    public ProductBookingRS shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ProductBookingRS bConfirmed(Boolean bConfirmed) {
        setBConfirmed(bConfirmed);
        return this;
    }

    public ProductBookingRS productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    public ProductBookingRS productPurchaseList(List<OfferPurchase> productPurchaseList) {
        setProductPurchaseList(productPurchaseList);
        return this;
    }

    public ProductBookingRS errorList(List<String> errorList) {
        setErrorList(errorList);
        return this;
    }

    public ProductBookingRS productBookingTime(Date productBookingTime) {
        setProductBookingTime(productBookingTime);
        return this;
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
