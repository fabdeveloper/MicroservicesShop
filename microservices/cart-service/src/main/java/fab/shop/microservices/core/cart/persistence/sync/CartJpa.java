package fab.shop.microservices.core.cart.persistence.sync;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "carts")
public class CartJpa {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Version
    private int version;

    private Integer userId;
    private Float valuation;
    private List<CartItemJpa> cartItemsList;


    public CartJpa() {
    }


    public CartJpa(Integer id, Integer userId, Float valuation, List<CartItemJpa> cartItemsList) {
        this.id = id;
        this.userId = userId;
        this.valuation = valuation;
        this.cartItemsList = cartItemsList;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }

    public List<CartItemJpa> getCartItemsList() {
        return this.cartItemsList;
    }

    public void setCartItemsList(List<CartItemJpa> cartItemsList) {
        this.cartItemsList = cartItemsList;
    }

    
}
