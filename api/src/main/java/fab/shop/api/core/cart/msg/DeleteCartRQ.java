package fab.shop.api.core.cart.msg;

public class DeleteCartRQ {
    private Integer cartId;



    public DeleteCartRQ() {
    }


    public DeleteCartRQ(Integer cartId) {
        this.cartId = cartId;
    }


    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

}
