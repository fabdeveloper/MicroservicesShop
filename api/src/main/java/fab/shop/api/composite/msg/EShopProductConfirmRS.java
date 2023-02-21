package fab.shop.api.composite.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import fab.shop.api.core.product.transfer.OfferPurchase;

public class EShopProductConfirmRS {
    private Integer shopId;
    private Boolean bConfirmed;
    private Integer productBookingNumber;
    private List<OfferPurchase> productPurchaseList;
    private List<String> errorList;
    private Date productBookingTime;
    private Float valuation;



    public EShopProductConfirmRS() {
    }

    public EShopProductConfirmRS(Integer shopId, Boolean bConfirmed, Integer productBookingNumber, List<OfferPurchase> productPurchaseList, List<String> errorList, Date productBookingTime, Float valuation) {
        this.shopId = shopId;
        this.bConfirmed = bConfirmed;
        this.productBookingNumber = productBookingNumber;
        this.productPurchaseList = productPurchaseList;
        this.errorList = errorList;
        this.productBookingTime = productBookingTime;
        this.valuation = valuation;
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
        if(this.errorList == null){
            this.errorList = new ArrayList<>();
        }
        return this.errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    public void addError(String sError){
        getErrorList().add(sError);
    }

    public Date getProductBookingTime() {
        return this.productBookingTime;
    }

    public void setProductBookingTime(Date productBookingTime) {
        this.productBookingTime = productBookingTime;
    }

    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }

    public EShopProductConfirmRS shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public EShopProductConfirmRS bConfirmed(Boolean bConfirmed) {
        setBConfirmed(bConfirmed);
        return this;
    }

    public EShopProductConfirmRS productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    public EShopProductConfirmRS productPurchaseList(List<OfferPurchase> productPurchaseList) {
        setProductPurchaseList(productPurchaseList);
        return this;
    }

    public EShopProductConfirmRS errorList(List<String> errorList) {
        setErrorList(errorList);
        return this;
    }

    public EShopProductConfirmRS productBookingTime(Date productBookingTime) {
        setProductBookingTime(productBookingTime);
        return this;
    }

    public EShopProductConfirmRS valuation(Float valuation) {
        setValuation(valuation);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EShopProductConfirmRS)) {
            return false;
        }
        EShopProductConfirmRS eShopProductConfirmRS = (EShopProductConfirmRS) o;
        return Objects.equals(shopId, eShopProductConfirmRS.shopId) && Objects.equals(bConfirmed, eShopProductConfirmRS.bConfirmed) && Objects.equals(productBookingNumber, eShopProductConfirmRS.productBookingNumber) && Objects.equals(productPurchaseList, eShopProductConfirmRS.productPurchaseList) && Objects.equals(errorList, eShopProductConfirmRS.errorList) && Objects.equals(productBookingTime, eShopProductConfirmRS.productBookingTime) && Objects.equals(valuation, eShopProductConfirmRS.valuation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, bConfirmed, productBookingNumber, productPurchaseList, errorList, productBookingTime, valuation);
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
            ", valuation='" + getValuation() + "'" +
            "}";
    }

}
