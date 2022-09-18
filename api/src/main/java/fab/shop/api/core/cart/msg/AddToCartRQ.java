package fab.shop.api.core.cart.msg;

import fab.shop.api.core.cart.CartItem;

public class AddToCartRQ {

    private Integer cartId;
    private Integer userId;
    private Integer shopId;
    private CartItem item;



    public AddToCartRQ(Integer cartId, Integer userId, Integer shopId, CartItem item) {
        this.cartId = cartId;
        this.userId = userId;
        this.shopId = shopId;
        this.item = item;
    }



    public AddToCartRQ() {
    }







    public CartItem getItem() {
        return this.item;
    }

    public void setItem(CartItem item) {
        this.item = item;
    }



    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }



    public Integer getCartId() {
        return this.cartId;
    }


    public Integer getUserId() {
        return this.userId;
    }


    public Integer getShopId() {
        return this.shopId;
    }







    
}
