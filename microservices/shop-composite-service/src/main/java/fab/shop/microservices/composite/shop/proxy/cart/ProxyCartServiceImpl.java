package fab.shop.microservices.composite.shop.proxy.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;



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
        return restTemplate.postForObject(getCartServiceUrl() + "/getCart", getCartRQ, GetCartRS.class);
    }

    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {
        return restTemplate.postForObject(getCartServiceUrl() + "/cartModification", cartModificationRQ, CartModificationRS.class);
    }

    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {
        return restTemplate.postForObject(getCartServiceUrl() + "/addToCart", addToCartRq, AddToCartRS.class);
    }

    @Override
    public RemoveFromCartRS removeFromCart(RemoveFromCartRQ removeFromCartRq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFromCart'");
    }

    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {
        return restTemplate.postForObject(getCartServiceUrl() + "/emptyCart", emptyCartRQ, EmptyCartRS.class);
    }

    @Override
    public DeleteCartRS deleteCart(DeleteCartRQ deleteCartRQ) {
        return restTemplate.postForObject(getCartServiceUrl() + "/deleteCart", deleteCartRQ, DeleteCartRS.class);
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
