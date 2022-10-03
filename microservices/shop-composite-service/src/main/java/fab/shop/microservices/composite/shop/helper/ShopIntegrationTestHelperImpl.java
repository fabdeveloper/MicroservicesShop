package fab.shop.microservices.composite.shop.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.composite.ShopIntegrationTestHelper;
import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartItem;
import fab.shop.api.core.cart.msg.AddToCartRQ;
import fab.shop.api.core.cart.msg.AddToCartRS;
import fab.shop.api.core.cart.msg.CartModificationRQ;
import fab.shop.api.core.cart.msg.CartModificationRS;
import fab.shop.api.core.cart.msg.DeleteCartRS;
import fab.shop.api.core.cart.msg.EmptyCartRQ;
import fab.shop.api.core.cart.msg.EmptyCartRS;
import fab.shop.api.core.cart.msg.GetCartRQ;
import fab.shop.api.core.cart.msg.GetCartRS;
import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.purchase.Purchase;
import fab.shop.api.core.valuation.msg.ValuationRQ;
import fab.shop.api.core.valuation.msg.ValuationRS;
import fab.shop.util.http.ServiceUtil;


@RestController
public class ShopIntegrationTestHelperImpl implements ShopIntegrationTestHelper{

    private final RestTemplate restTemplate;
    private final ServiceUtil serviceUtil;


    private final String shopCompositeServiceUrl;


    @Autowired

    public ShopIntegrationTestHelperImpl(RestTemplate restTemplate, 
                                            ServiceUtil serviceUtil, 
                                            @Value("${app.shop-composite-service.host}") String shopCompositeServiceHost,
                                            @Value("${app.shop-composite-service.port}") String shopCompositeServicePort  ) {
        this.restTemplate = restTemplate;
        this.serviceUtil = serviceUtil;
        this.shopCompositeServiceUrl = "http://" + shopCompositeServiceHost + ":" + shopCompositeServicePort + "/shop";
    }


    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }



    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }


    public String getShopCompositeServiceUrl() {
        return this.shopCompositeServiceUrl;
    }


    // CartService



    @Override
    public GetCartRS getCartTestHelper() {

        Integer cartId = 999;
        Integer userId = 999;
		Integer shopId = 999;       

        GetCartRQ getCartRQ = new GetCartRQ(cartId, userId, shopId);

        return restTemplate.postForObject(getShopCompositeServiceUrl() + "/getCart", getCartRQ, GetCartRS.class);
    }

    @Override
    public AddToCartRS addToCartTestHelper() {

        Integer cartId = null;
        Integer userId = 999;
		Integer shopId = 999;

        GetCartRQ getCartRQ = new GetCartRQ(cartId, userId, shopId);
        GetCartRS getCartRS = restTemplate.postForObject(getShopCompositeServiceUrl() + "/getCart", getCartRQ, GetCartRS.class);

        if(getCartRS != null){
            cartId = getCartRS.getCart().getCartId();
        }

        if(cartId == null){ return new AddToCartRS(null, "ERROR: getCart return cartid = null"); }

        Integer offerId = 15;
        Integer count = 2;

        CartItem cartItem = new CartItem(null, cartId, offerId, count);

		AddToCartRQ addToCart = new AddToCartRQ(cartId, userId, shopId, cartItem);
        System.out.println("AddToCartRQ = " + addToCart.toString());

        return restTemplate.postForObject(getShopCompositeServiceUrl() + "/addToCart", addToCart, AddToCartRS.class);
    }

    @Override
    public CartModificationRS cartModificationTestHelper() {

        // get the old cart
        Integer oldCartId = null;
        Integer userId = 999;
		Integer shopId = 999;
        GetCartRQ getCartRQ = new GetCartRQ(oldCartId, userId, shopId);

        GetCartRS getCartRS = restTemplate.postForObject(getShopCompositeServiceUrl() + "/getCart", getCartRQ, GetCartRS.class);
        if(getCartRS == null){ return new CartModificationRS(null, "ERROR: getCartRS is null"); }

        Cart oldCart = getCartRS.getCart();

        // oldCartId = getCartRS.getCart().getCartId();
        // if(oldCartId == null){ return new CartModificationRS(null, "ERROR: getCart return oldCartId = null"); }

        // add items
        List<CartItem> cartItemsList = new ArrayList<CartItem>();
        CartItem cartItem = new CartItem(null, oldCartId, 666, 6);
        cartItemsList.add(cartItem);

        Cart newCart = oldCart;
        newCart.setCartItemsList(cartItemsList);

        CartModificationRQ cartModificationRQ = new CartModificationRQ(newCart);
        CartModificationRS cartModificationRS = restTemplate.postForObject(getShopCompositeServiceUrl() + "/cartModification", cartModificationRQ, CartModificationRS.class);


        return cartModificationRS;
    }

    @Override
    public EmptyCartRS emptyCartTestHelper() {
        
        // get the test cart
        Integer cartId = null;
        Integer userId = 999;
		Integer shopId = 999;
        GetCartRQ getCartRQ = new GetCartRQ(cartId, userId, shopId);

        GetCartRS getCartRS = restTemplate.postForObject(getShopCompositeServiceUrl() + "/getCart", getCartRQ, GetCartRS.class);
        if(getCartRS == null){ return new EmptyCartRS(null, "ERROR: getCartRS is null"); }

        cartId = getCartRS.getCart().getCartId();
        EmptyCartRQ emptyCartRQ = new EmptyCartRQ(cartId, userId, shopId);
        EmptyCartRS emptyCartRS = restTemplate.postForObject(getShopCompositeServiceUrl() + "/emptyCart", emptyCartRQ, EmptyCartRS.class);


        return emptyCartRS;
    }

    @Override
    public DeleteCartRS deleteCartTestHelper() {
        // TODO Auto-generated method stub
        return null;
    }







    @Override
    public Purchase purchaseConfirmTestHelper() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ValuationRS valuationTestHelper() {
        // TODO Auto-generated method stub
        return null;
    }




    @Override
    public ValuationRS valuateTestHelper() {

        Float offerPrice = 9.99f;
        Product product = new Product(3, "product name", "product description", "product remarks", "product type", getServiceUtil().getServiceAddress());
        Article article = new Article(2, "article name", "article description", "article remarks", product);
        Offer offer = new Offer(1, "offer name", "offer description", "offer remarks", offerPrice, article);



        List<Offer> offerList = new ArrayList<Offer>();
        offerList.add(offer);
        offerList.add(offer);

        ValuationRQ valuationRQ = new ValuationRQ(offerList);


        return restTemplate.postForObject(getShopCompositeServiceUrl() + "/valuate", valuationRQ, ValuationRS.class);
    }



    
}
