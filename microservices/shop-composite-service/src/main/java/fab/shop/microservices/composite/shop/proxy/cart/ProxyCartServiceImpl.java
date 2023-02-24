package fab.shop.microservices.composite.shop.proxy.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import fab.shop.api.core.cart.msg.*;


@Component
public class ProxyCartServiceImpl implements IProxyCartService {

    private final RestTemplate restTemplate;

    private final String cartServiceUrl;


    @Autowired
    public ProxyCartServiceImpl(RestTemplate restTemplate, 
                                @Value("${app.cart-service.host}") String cartServiceHost, 
                                @Value("${app.cart-service.port}") int cartServicePort) {
        this.cartServiceUrl = "http://" + cartServiceHost + ":" + cartServicePort + "/cart";
    }


    @Override
    public GetCartRS getCart(GetCartRQ getCartRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCart'");
    }

    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cartModification'");
    }

    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToCart'");
    }

    @Override
    public RemoveFromCartRS removeFromCart(RemoveFromCartRQ removeFromCartRq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFromCart'");
    }

    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emptyCart'");
    }

    @Override
    public DeleteCartRS deleteCart(DeleteCartRQ deleteCartRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCart'");
    }

    @Override
    public String getCartApiObject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCartApiObject'");
    }

    @Override
    public String getCartEntityObject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCartEntityObject'");
    }


    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }


    public String getCartServiceUrl() {
        return this.cartServiceUrl;
    }


    
}
