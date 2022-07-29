package fab.shop.api.core.cart.msg;

public class DeleteCartRS {
    private Integer cartId;
    private String status;


    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
