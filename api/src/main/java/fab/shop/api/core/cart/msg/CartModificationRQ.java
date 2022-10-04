package fab.shop.api.core.cart.msg;

import fab.shop.api.core.cart.Cart;


public class CartModificationRQ {
 
    private Cart cart;


    public CartModificationRQ(Cart cart) {
        this.cart = cart;
    }

    public CartModificationRQ() {
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "{" +
            " cart='" + getCart().toString() + "'" +
            "}";
    }

}
