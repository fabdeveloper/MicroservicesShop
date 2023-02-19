package fab.shop.api.core.purchase.transfer;

import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotNull;



public class CartDetail {
    private Integer id;

    @NotNull
    private List<CartItem> itemsList;
    @NotNull
    private Float valuation;
    @NotNull
    private Integer productBookingNumber;
    @NotNull
    private Integer shopId;


    public CartDetail() {
    }

    public CartDetail(Integer id, List<CartItem> itemsList, Float valuation, Integer productBookingNumber, Integer shopId) {
        this.id = id;
        this.itemsList = itemsList;
        this.valuation = valuation;
        this.productBookingNumber = productBookingNumber;
        this.shopId = shopId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<CartItem> getItemsList() {
        return this.itemsList;
    }

    public void setItemsList(List<CartItem> itemsList) {
        this.itemsList = itemsList;
    }

    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }

    public Integer getProductBookingNumber() {
        return this.productBookingNumber;
    }

    public void setProductBookingNumber(Integer productBookingNumber) {
        this.productBookingNumber = productBookingNumber;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public CartDetail id(Integer id) {
        setId(id);
        return this;
    }

    public CartDetail itemsList(List<CartItem> itemsList) {
        setItemsList(itemsList);
        return this;
    }

    public CartDetail valuation(Float valuation) {
        setValuation(valuation);
        return this;
    }

    public CartDetail productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    public CartDetail shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CartDetail)) {
            return false;
        }
        CartDetail cartDetail = (CartDetail) o;
        return Objects.equals(id, cartDetail.id) && Objects.equals(itemsList, cartDetail.itemsList) && Objects.equals(valuation, cartDetail.valuation) && Objects.equals(productBookingNumber, cartDetail.productBookingNumber) && Objects.equals(shopId, cartDetail.shopId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemsList, valuation, productBookingNumber, shopId);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", itemsList='" + getItemsList() + "'" +
            ", valuation='" + getValuation() + "'" +
            ", productBookingNumber='" + getProductBookingNumber() + "'" +
            ", shopId='" + getShopId() + "'" +
            "}";
    }

    


}
