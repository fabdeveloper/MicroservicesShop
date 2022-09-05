package fab.shop.microservices.core.cart.persistence;

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

    // @ManyToOne
    // @JoinColumn(name = "id", nullable = false)
    // private CartEntity cart;

    // @ManyToOne
    // @JoinColumn(name = "id", nullable = false)
    // private OfferEntity offer;

    private Integer cartId;
    private Integer offerId;
    private Integer count;




    public CartItemEntity(Integer id, Integer version, Integer cartId, Integer offerId, Integer count) {
        this.id = id;
        this.version = version;
        this.cartId = cartId;
        this.offerId = offerId;
        this.count = count;
    }
   


    
    public CartItemEntity() {
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

}
