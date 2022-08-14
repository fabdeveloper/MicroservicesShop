package fab.shop.api.core.cart.msg;

public class EmptyCartRQ {
    private Integer cartId;


    
    public EmptyCartRQ() {
    }


    public EmptyCartRQ(Integer cartId) {
        this.cartId = cartId;
    }



    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

}
