package fab.shop.api.core.cart.msg;

import fab.shop.api.core.cart.Cart;

public class DeleteCartRS extends CartMessageGenericResponse {

    public DeleteCartRS(Cart cart, String status) {
        super(cart, status);        
    }

    public DeleteCartRS() {
        super();
    }



}
