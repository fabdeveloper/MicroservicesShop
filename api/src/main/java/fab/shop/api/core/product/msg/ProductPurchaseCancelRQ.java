package fab.shop.api.core.product.msg;

import java.util.Objects;


public class ProductPurchaseCancelRQ {

    private Integer shopId;
    private Integer productBookingNumber;



    public ProductPurchaseCancelRQ() {
    }

    public ProductPurchaseCancelRQ(Integer shopId, Integer productBookingNumber) {
        this.shopId = shopId;
        this.productBookingNumber = productBookingNumber;
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

    public ProductPurchaseCancelRQ shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ProductPurchaseCancelRQ productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductPurchaseCancelRQ)) {
            return false;
        }
        ProductPurchaseCancelRQ productPurchaseCancelRQ = (ProductPurchaseCancelRQ) o;
        return Objects.equals(shopId, productPurchaseCancelRQ.shopId) && Objects.equals(productBookingNumber, productPurchaseCancelRQ.productBookingNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, productBookingNumber);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", productBookingNumber='" + getProductBookingNumber() + "'" +
            "}";
    }

    

    
}
