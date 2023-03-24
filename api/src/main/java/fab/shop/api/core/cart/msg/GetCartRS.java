package fab.shop.api.core.cart.msg;

import fab.shop.api.core.cart.Cart;

public class GetCartRS extends CartMessageGenericResponse{


    public GetCartRS(Cart cart, String status){
        super(cart, status);
    }

    public GetCartRS(){
        super();
    }

}
