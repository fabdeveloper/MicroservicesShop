package fab.shop.microservices.core.cart.check;

import org.springframework.beans.factory.annotation.Autowired;

import fab.shop.microservices.core.cart.services.CartMapper;

public class MapStructMain {


    @Autowired
    private CartMapper cartMapper;




    
    

    public static void main(String[] args) {

        MapStructMain tester = new MapStructMain();


        CartMapper mapper = tester.getCartMapper();
        System.out.println("********************    mapper = " + mapper);


        
    }
    


    public CartMapper getCartMapper() {
        return this.cartMapper;
    }

    public void setCartMapper(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }


    
}
