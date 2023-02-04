package fab.shop.microservices.composite.shop.services;

import java.util.List;
import fab.shop.api.core.purchase.PurchaseService;
import fab.shop.api.core.valuation.ValuationService;
import fab.shop.api.core.valuation.msg.ValuationRQ;
import fab.shop.api.core.valuation.msg.ValuationRS;
import fab.shop.api.core.product.ProductService;
import fab.shop.api.core.product.msg.GenericProductConfigRQ;
import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import fab.shop.api.core.purchase.msg.*;
import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.cart.CartService;

import fab.shop.api.composite.IEShopOrchestrator;
import fab.shop.api.composite.msg.*;
import fab.shop.api.composite.transfer.*;



@Component
public class ShopCompositeIntegration implements CartService, ProductService, PurchaseService, ValuationService, IEShopOrchestrator {

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
    public ValuationRS valuate(
            ValuationRQ valuationRQ) {
                return restTemplate.postForObject(getValuationServiceUrl() + "/valuate", valuationRQ, ValuationRS.class);
    }


    @Override
    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {
        return restTemplate.postForObject(getCartServiceUrl() + "/cartModification", cartModificationRQ, CartModificationRS.class);
    }



    @Override
    public RemoveFromCartRS removeFromCart(RemoveFromCartRQ removeFromCartRq) {
        // TODO Auto-generated method stub
        return null;
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
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {
        return restTemplate.postForObject(getCartServiceUrl() + "/addToCart", addToCartRq, AddToCartRS.class);
   
    }

    
    @Override
    public GetCartRS getCart(GetCartRQ getCartRQ) {
        return restTemplate.postForObject(getCartServiceUrl() + "/getCart", getCartRQ, GetCartRS.class);
    }


    // @Override
    public String getCartApiObject() {
        return getRestTemplate().getForObject(getCartServiceUrl() + "/apiobject", String.class);        
    }


    // @Override
    public String getCartEntityObject() {
        return getRestTemplate().getForObject(getCartServiceUrl() + "/entityobject", String.class);        
    }


    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/getAvail", getAvailRQ, GetAvailRS.class);
    }


    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/getOfferListDetail", getOfferListDetailRQ, GetOfferListDetailRS.class);
    }


    @Override
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/productPurchaseConfirm", productPurchaseConfirmRQ, ProductPurchaseConfirmRS.class);
    }


    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/productPurchaseCancel", productPurchaseCancelRQ, ProductPurchaseCancelRS.class);
    }


    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/testconfig", testConfigRQ, ProductCreateNewRS.class);
    }

    

    @Transactional
    @Override
    public EShopPurchaseConfirmRS eShopPurchaseConfirm(EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ){
        EShopPurchaseConfirmRS rs = new EShopPurchaseConfirmRS();

        Integer shopId = eShopPurchaseConfirmRQ.getShopId();
        Integer userId = eShopPurchaseConfirmRQ.getUserId();
        List<PurchaseItem> purchaseList = eShopPurchaseConfirmRQ.getPurchaseList();




        // product tasks

        ProductPurchaseConfirmRQ productPurchaseConfirmRQ = new ProductPurchaseConfirmRQ(shopId, purchaseList);
        try{
            ProductPurchaseConfirmRS productPurchaseConfirmRS = restTemplate.postForObject(getProductServiceUrl() + "/productPurchaseConfirm", productPurchaseConfirmRQ, ProductPurchaseConfirmRS.class);

        } catch(Exception e){
            String sError = "ERROR - ProductService - not available - msg: " + e.getMessage();
            rs.addError(sError);
            EShopPurchaseConfirmException exception = new EShopPurchaseConfirmException();
            exception.setEShopPurchaseConfirmRS(rs);

            throw exception;
        }

        // purchase tasks 
        PurchaseConfirmRQ purchaseConfirmRQ = new PurchaseConfirmRQ(null);
        PurchaseConfirmRS purchaseConfirmRS = restTemplate.postForObject(getPurchaseServiceUrl() + "/purchaseConfirm", purchaseConfirmRQ, PurchaseConfirmRS.class);


        // cart tasks 
        DeleteCartRQ deleteCartRQ = new DeleteCartRQ();
        DeleteCartRS deleteCartRS = restTemplate.postForObject(getCartServiceUrl() + "/deleteCart", deleteCartRQ, DeleteCartRS.class);




        return rs;
    }

    
}
