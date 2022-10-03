package fab.shop.api.core.cart.msg;

import fab.shop.api.core.cart.Cart;


public class CartModificationRQ {
 
    private Cart newCart;


    public CartModificationRQ(Cart newCart) {
        this.newCart = newCart;
    }


    public CartModificationRQ() {
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
            " newCart='" + getNewCart().toString() + "'" +
            "}";
    }
    

}
