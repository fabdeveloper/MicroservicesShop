package fab.shop.api.core.cart.msg;

public class EmptyCartRQ {
    private Integer cartId;
    private Integer userId;
    private Integer shopId;



    
    public EmptyCartRQ() {
    }



    public EmptyCartRQ(Integer cartId, Integer userId, Integer shopId) {
        this.cartId = cartId;
        this.userId = userId;
        this.shopId = shopId;
    }


    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }



    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

}
