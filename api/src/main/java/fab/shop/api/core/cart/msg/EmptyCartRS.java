package fab.shop.api.core.cart.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.product.Offer;

public class EmptyCartRS {
    private Integer cartId;
    private List<Offer> productList;
    private Float valuation;


    public EmptyCartRS() {
        this.cartId = null;
        this.productList = new ArrayList<Offer>();
        this.valuation = 0.0f;
    }


    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public List<Offer> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Offer> productList) {
        this.productList = productList;
    }

    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }

}
