package fab.shop.microservices.core.cart.persistence;

import java.util.Date;

// import fab.shop.microservices.core.product.persistence.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "cart_items")
public class CartItemEntity {
  
    @Id @GeneratedValue
    private Integer id;
    @Version
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "cartId", nullable = false)
    private CartEntity cart;

    // @ManyToOne
    // @JoinColumn(name = "id", nullable = false)
    // private OfferEntity offer;

    // private Integer cartId;
    private Integer offerId;
    private Integer count;

    private Date creationDate;
	private Date modificationDate;





    public CartItemEntity(Integer id, Integer version, CartEntity cart, Integer offerId, Integer count, Date creationDate, Date modificationDate) {
        this.id = id;
        this.version = version;
        this.cart = cart;
        this.offerId = offerId;
        this.count = count;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }







    
    public CartItemEntity() {
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }   

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return this.modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }



    public CartEntity getCart() {
        return this.cart;
    }

    public void setCart(CartEntity cart) {
        this.cart = cart;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", cart='" + getCart().getCartId() + "'" +
            ", offerId='" + getOfferId() + "'" +
            ", count='" + getCount() + "'" +
            ", creationDate='" + getCreationDate() + "'" +
            ", modificationDate='" + getModificationDate() + "'" +
            "}";
    }







}
