package fab.shop.api.core.cart.msg;

import java.util.List;

import fab.shop.api.core.product.Offer;

public class GetCartRS {
    private Integer cartId;
    private List<Offer> productList;
    private Float valuation;


    public GetCartRS(Integer cartId, List<Offer> productList, Float valuation) {
        this.cartId = cartId;
        this.productList = productList;
        this.valuation = valuation;
    }


    public GetCartRS() {
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
