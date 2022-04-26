package fab.shop.microservices.composite.shop.services;

import fab.shop.api.core.purchase.Purchase;
import fab.shop.api.core.purchase.PurchaseService;
import fab.shop.api.core.valuation.ValuationRQ;
import fab.shop.api.core.valuation.ValuationRS;
import fab.shop.api.core.valuation.ValuationService;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import fab.shop.api.composite.PurchaseConfirmRQ;
import fab.shop.api.core.cart.AddToCartRQ;
import fab.shop.api.core.cart.AddToCartRS;
import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartService;


@Component
public class ShopCompositeIntegration implements CartService, ProductService, PurchaseService, ValuationService{

    private final RestTemplate restTemplate;
    // private final WebClient webClient;
    private final ObjectMapper mapper;

    private final String productServiceUrl;
    private final String purchaseServiceUrl;
    private final String cartServiceUrl;
    private final String tillServiceUrl;
    private final String userServiceUrl;
    private final String valuationServiceUrl;



    @Autowired
    public ShopCompositeIntegration(RestTemplate restTemplate,
                                    // WebClient client, 
                                    ObjectMapper mapper, 
                                    @Value("${app.product-service.host}") String productServiceHost, 
                                    @Value("${app.product-service.port}") int productServicePort,  
                                    @Value("${app.cart-service.host}") String cartServiceHost, 
                                    @Value("${app.cart-service.port}") int cartServicePort,   
                                    @Value("${app.purchase-service.host}") String purchaseServiceHost, 
                                    @Value("${app.purchase-service.port}") int purchaseServicePort,   
                                    @Value("${app.till-service.host}") String tillServiceHost, 
                                    @Value("${app.till-service.port}") int tillServicePort, 
                                    @Value("${app.users-service.host}") String userServiceHost, 
                                    @Value("${app.users-service.port}") int userServicePort,
                                    @Value("${app.valuation-service.host}") String valuationServiceHost, 
                                    @Value("${app.valuation-service.port}") int valuationServicePort) {

        this.restTemplate = restTemplate;
        // this.webClient = client;
        this.mapper = mapper;

        this.productServiceUrl = "http://" + productServiceHost + ":" + productServicePort + "/product";
        this.purchaseServiceUrl = "http://" + purchaseServiceHost + ":" + purchaseServicePort + "/purchase";
        this.cartServiceUrl = "http://" + cartServiceHost + ":" + cartServicePort + "/cart";
        this.tillServiceUrl = "http://" + tillServiceHost + ":" + tillServicePort + "/till";
        this.userServiceUrl = "http://" + userServiceHost + ":" + userServicePort + "/user";
        this.valuationServiceUrl = "http://" + valuationServiceHost + ":" + valuationServicePort + "/valuation";
    }


    @Override
    public Purchase getPurchase(int purchaseId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Purchase createPurchase(Purchase purchase) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product getProduct(int productId) {
        String cadenaConsulta = getProductServiceUrl() + "/" + productId;
        Product product = getRestTemplate().getForObject(cadenaConsulta, Product.class);
        return product;
    }

    @Override
    public Cart getCart(int cartId) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {
        return restTemplate.postForObject(getCartServiceUrl() + "/addToCart", addToCartRq, AddToCartRS.class);
   
    }


    @Override
    public void deleteCart(int userId) {
        // TODO Auto-generated method stub
        
    }

    // GETTERS AND SETTERS

    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }


    public ObjectMapper getMapper() {
        return this.mapper;
    }


    public String getProductServiceUrl() {
        return this.productServiceUrl;
    }


    public String getPurchaseServiceUrl() {
        return this.purchaseServiceUrl;
    }


    public String getCartServiceUrl() {
        return this.cartServiceUrl;
    }


    public String getTillServiceUrl() {
        return this.tillServiceUrl;
    }


    public String getUserServiceUrl() {
        return this.userServiceUrl;
    }

    public String getValuationServiceUrl() {
        return this.valuationServiceUrl;
    }


    @Override
    public Cart updateCart(Cart cart) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Purchase purchaseCancel(int purchaseId) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Purchase purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        String url = getPurchaseServiceUrl() + "/confirm";
        Purchase purchase = getRestTemplate().postForObject(url, purchaseConfirmRQ, Purchase.class);        
        
        return purchase;
    }


    @Override
    public Cart removeFromCart(Integer productId, Integer cartId) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public ValuationRS valuate(ValuationRQ valuationRQ) {
        String url = getValuationServiceUrl() + "/valuate" ;

        ValuationRS valuationRs = getRestTemplate().postForObject(url,valuationRQ, ValuationRS.class);

        return valuationRs;
    }





    
}
