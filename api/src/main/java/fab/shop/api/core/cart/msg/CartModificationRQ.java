package fab.shop.api.core.cart.msg;

import fab.shop.api.core.cart.Cart;


public class CartModificationRQ {
    
    private Integer cartId;
    private Cart newCart;


    public CartModificationRQ(Integer cartId, Cart newCart) {
        this.cartId = cartId;
        this.newCart = newCart;
    }

    public CartModificationRQ() {
    }




    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Cart getNewCart() {
        return this.newCart;
    }

    public void setNewCart(Cart newCart) {
        this.newCart = newCart;
    }


    @Override
    public String toString() {
        return "{" +
            " cartId='" + getCartId() + "'" +
            ", newCart='" + getNewCart().toString() + "'" +
            "}";
    }



    

}
