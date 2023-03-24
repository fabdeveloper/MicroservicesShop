package fab.shop.api.core.cart.msg;


import fab.shop.api.core.cart.Cart;



public class EmptyCartRS extends CartMessageGenericResponse {

    public EmptyCartRS() {
        super();
    }

    public EmptyCartRS(Cart cart, String status) {
        super(cart, status);        
    }

}
