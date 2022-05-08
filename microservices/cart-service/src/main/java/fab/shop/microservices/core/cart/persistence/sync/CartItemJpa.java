package fab.shop.microservices.core.cart.persistence.sync;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "cartitems")
public class CartItemJpa {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Version
    private int version;

    private Integer cartId;
    private Integer offerId;
    private Integer count;


    public CartItemJpa() {
    }


    public CartItemJpa(Integer id, Integer cartId, Integer offerId, Integer count) {
        this.id = id;
        this.cartId = cartId;
        this.offerId = offerId;
        this.count = count;
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

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
