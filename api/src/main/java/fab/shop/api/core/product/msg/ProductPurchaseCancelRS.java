package fab.shop.api.core.product.msg;

import java.util.List;
import java.util.Objects;


public class ProductPurchaseCancelRS {

    private Integer shopId;
    private Integer productBookingNumber;
    private ProductBookingStatusTypeEnum status;
    private List<String> errorList;



    public ProductPurchaseCancelRS() {
    }

    public ProductPurchaseCancelRS(Integer shopId, Integer productBookingNumber, ProductBookingStatusTypeEnum status, List<String> errorList) {
        this.shopId = shopId;
        this.productBookingNumber = productBookingNumber;
        this.status = status;
        this.errorList = errorList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getProductBookingNumber() {
        return this.productBookingNumber;
    }

    public void setProductBookingNumber(Integer productBookingNumber) {
        this.productBookingNumber = productBookingNumber;
    }

    public ProductBookingStatusTypeEnum getStatus() {
        return this.status;
    }

    public void setStatus(ProductBookingStatusTypeEnum status) {
        this.status = status;
    }

    public List<String> getErrorList() {
        return this.errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    public ProductPurchaseCancelRS shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ProductPurchaseCancelRS productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    public ProductPurchaseCancelRS status(ProductBookingStatusTypeEnum status) {
        setStatus(status);
        return this;
    }

    public ProductPurchaseCancelRS errorList(List<String> errorList) {
        setErrorList(errorList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductPurchaseCancelRS)) {
            return false;
        }
        ProductPurchaseCancelRS productPurchaseCancelRS = (ProductPurchaseCancelRS) o;
        return Objects.equals(shopId, productPurchaseCancelRS.shopId) && Objects.equals(productBookingNumber, productPurchaseCancelRS.productBookingNumber) && Objects.equals(status, productPurchaseCancelRS.status) && Objects.equals(errorList, productPurchaseCancelRS.errorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, productBookingNumber, status, errorList);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", productBookingNumber='" + getProductBookingNumber() + "'" +
            ", status='" + getStatus() + "'" +
            ", errorList='" + getErrorList() + "'" +
            "}";
    }


    
}
