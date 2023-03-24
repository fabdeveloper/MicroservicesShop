package fab.shop.microservices.core.purchase.persistence;


import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name="cartItems")
public class CartItemEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;


    @ManyToOne    
    @JoinColumn(name = "cart_id", nullable = false)
    private CartDetailEntity cart;

    private Integer itemCount;
    private Integer offerId;
    private String offerName;
    private String offerDescription;
    private Float offerPrice;



    public CartItemEntity() {
    }

    public CartItemEntity(Integer id, Integer version, CartDetailEntity cart, Integer itemCount, Integer offerId, String offerName, String offerDescription, Float offerPrice) {
        this.id = id;
        this.version = version;
        this.cart = cart;
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

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public CartDetailEntity getCart() {
        return this.cart;
    }

    public void setCart(CartDetailEntity cart) {
        this.cart = cart;
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

    public CartItemEntity id(Integer id) {
        setId(id);
        return this;
    }

    public CartItemEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public CartItemEntity cart(CartDetailEntity cart) {
        setCart(cart);
        return this;
    }

    public CartItemEntity itemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    public CartItemEntity offerId(Integer offerId) {
        setOfferId(offerId);
        return this;
    }

    public CartItemEntity offerName(String offerName) {
        setOfferName(offerName);
        return this;
    }

    public CartItemEntity offerDescription(String offerDescription) {
        setOfferDescription(offerDescription);
        return this;
    }

    public CartItemEntity offerPrice(Float offerPrice) {
        setOfferPrice(offerPrice);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CartItemEntity)) {
            return false;
        }
        CartItemEntity cartItemEntity = (CartItemEntity) o;
        return Objects.equals(id, cartItemEntity.id) && Objects.equals(version, cartItemEntity.version) && Objects.equals(cart, cartItemEntity.cart) && Objects.equals(itemCount, cartItemEntity.itemCount) && Objects.equals(offerId, cartItemEntity.offerId) && Objects.equals(offerName, cartItemEntity.offerName) && Objects.equals(offerDescription, cartItemEntity.offerDescription) && Objects.equals(offerPrice, cartItemEntity.offerPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, cart, itemCount, offerId, offerName, offerDescription, offerPrice);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", cart='" + getCart() + "'" +
            ", itemCount='" + getItemCount() + "'" +
            ", offerId='" + getOfferId() + "'" +
            ", offerName='" + getOfferName() + "'" +
            ", offerDescription='" + getOfferDescription() + "'" +
            ", offerPrice='" + getOfferPrice() + "'" +
            "}";
    }





    
}
