package fab.shop.microservices.core.cart.persistence;

import fab.shop.microservices.core.product.persistence.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "CART_ITEMS")
public class CartItemEntity {
  
    @Id @GeneratedValue
    private Integer item_id;
    @Version
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private CartEntity cart;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private OfferEntity offer;

    // private Integer cartId;
    // private Integer offerId;
    private Integer count;



    public CartItemEntity(Integer item_id, Integer version, CartEntity cart, Integer count) {
        this.item_id = item_id;
        this.version = version;
        this.cart = cart;
        this.count = count;
    }


    


    
    public CartItemEntity() {
    }



    public CartEntity getCart() {
        return this.cart;
    }

    public void setCart(CartEntity cart) {
        this.cart = cart;
    }
    



    public Integer getItem_id() {
        return this.item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
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
