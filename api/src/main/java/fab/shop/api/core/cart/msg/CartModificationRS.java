package fab.shop.api.core.cart.msg;

import fab.shop.api.core.cart.Cart;

public class CartModificationRS extends CartMessageGenericResponse {
        
    public CartModificationRS(Cart cart, String status) {
        super(cart, status);        
    }

    public CartModificationRS() {
        super();
    }

}
