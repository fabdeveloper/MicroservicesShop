package fab.shop.api.core.cart.msg;

public class RemoveFromCartRQ {
    
    private Integer cartId;
    private Integer productId;


    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

}
