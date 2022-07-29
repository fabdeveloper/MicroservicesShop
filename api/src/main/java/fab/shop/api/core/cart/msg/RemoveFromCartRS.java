package fab.shop.api.core.cart.msg;

import java.util.List;

import fab.shop.api.core.product.Product;

public class RemoveFromCartRS {
    
    private Integer cartId;

    private List<Product> productList;
    private Float valuation;


    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }
    
}
