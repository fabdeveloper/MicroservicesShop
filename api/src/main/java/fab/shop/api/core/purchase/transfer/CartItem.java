package fab.shop.api.core.purchase.transfer;

import java.util.Objects;

public class CartItem {

    
    private Integer id;



    private Integer cartId;

    private Integer itemCount;
    private Integer offerId;
    private String offerName;
    private String offerDescription;
    private Float offerPrice;



    public CartItem() {
    }

    public CartItem(Integer id, Integer cartId, Integer itemCount, Integer offerId, String offerName, String offerDescription, Float offerPrice) {
        this.id = id;
        this.cartId = cartId;
        this.itemCount = itemCount;
        this.offerId = offerId;
        this.offerName = offerName;
        this.offerDescription = offerDescription;
        this.offerPrice = offerPrice;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getItemCount() {
        return this.itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return this.offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferDescription() {
        return this.offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public Float getOfferPrice() {
        return this.offerPrice;
    }

    public void setOfferPrice(Float offerPrice) {
        this.offerPrice = offerPrice;
    }

    public CartItem id(Integer id) {
        setId(id);
        return this;
    }

    public CartItem cartId(Integer cartId) {
        setCartId(cartId);
        return this;
    }

    public CartItem itemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    public CartItem offerId(Integer offerId) {
        setOfferId(offerId);
        return this;
    }

    public CartItem offerName(String offerName) {
        setOfferName(offerName);
        return this;
    }

    public CartItem offerDescription(String offerDescription) {
        setOfferDescription(offerDescription);
        return this;
    }

    public CartItem offerPrice(Float offerPrice) {
        setOfferPrice(offerPrice);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CartItem)) {
            return false;
        }
        CartItem cartItem = (CartItem) o;
        return Objects.equals(id, cartItem.id) && Objects.equals(cartId, cartItem.cartId) && Objects.equals(itemCount, cartItem.itemCount) && Objects.equals(offerId, cartItem.offerId) && Objects.equals(offerName, cartItem.offerName) && Objects.equals(offerDescription, cartItem.offerDescription) && Objects.equals(offerPrice, cartItem.offerPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cartId, itemCount, offerId, offerName, offerDescription, offerPrice);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cartId='" + getCartId() + "'" +
            ", itemCount='" + getItemCount() + "'" +
            ", offerId='" + getOfferId() + "'" +
            ", offerName='" + getOfferName() + "'" +
            ", offerDescription='" + getOfferDescription() + "'" +
            ", offerPrice='" + getOfferPrice() + "'" +
            "}";
    }

    
}
