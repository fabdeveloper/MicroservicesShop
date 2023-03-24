package fab.shop.api.core.cart.msg;

import fab.shop.api.core.cart.Cart;

public class AddToCartRS extends CartMessageGenericResponse {

    public AddToCartRS(Cart cart, String status){
        super(cart, status);
    }

    public AddToCartRS(){
        super();
    }

    
}
