package fab.shop.microservices.composite.shop.integrationtester;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.composite.integrationtester.ShopIntegrationTestHelper;
import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartItem;
import fab.shop.api.core.cart.msg.AddToCartRQ;
import fab.shop.api.core.cart.msg.AddToCartRS;
import fab.shop.api.core.cart.msg.CartModificationRQ;
import fab.shop.api.core.cart.msg.CartModificationRS;
import fab.shop.api.core.cart.msg.EmptyCartRQ;
import fab.shop.api.core.cart.msg.EmptyCartRS;
import fab.shop.api.core.cart.msg.GetCartRQ;
import fab.shop.api.core.cart.msg.GetCartRS;
import fab.shop.api.core.product.msg.ProductMappersTestRS;
import fab.shop.api.core.product.transfer.Discount;
import fab.shop.api.core.product.transfer.EnumSign;
import fab.shop.api.core.product.transfer.Tax;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;
import fab.shop.api.core.valuation.msg.ValuationRQ;
import fab.shop.api.core.valuation.msg.ValuationRS;
import fab.shop.api.core.valuation.transfer.ValuableItem;
import fab.shop.microservices.composite.shop.services.ShopCompositeIntegration;
import fab.shop.util.http.ServiceUtil;


@RestController
public class ShopIntegrationTestHelperImpl implements ShopIntegrationTestHelper{

    private final RestTemplate restTemplate;
    private final ServiceUtil serviceUtil;
    private final ShopCompositeIntegration shopIntegration;

    private final String shopCompositeServiceUrl;


    @Autowired
    public ShopIntegrationTestHelperImpl(ShopCompositeIntegration shopIntegration, RestTemplate restTemplate, 
                                            ServiceUtil serviceUtil, 
                                            @Value("${app.shop-composite-service.host}") String shopCompositeServiceHost,
                                            @Value("${app.shop-composite-service.port}") String shopCompositeServicePort  ) {
        
        this.shopIntegration = shopIntegration;
        this.restTemplate = restTemplate;
        this.serviceUtil = serviceUtil;
        this.shopCompositeServiceUrl = "http://" + shopCompositeServiceHost + ":" + shopCompositeServicePort + "/shop";
    }



    public ShopCompositeIntegration getShopIntegration() {
        return this.shopIntegration;
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
    public PurchaseConfirmRS purchaseConfirmTestHelper() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public ValuationRS valuateTestHelper() {
        List<Discount> discountList = new ArrayList<>();
        List<Tax> taxList = new ArrayList<>();
        Tax tax = new Tax(2, "tax name", "tax description", "tax remarks", 25.00f, null);
        taxList.add(tax);
        Discount discount = new Discount(1, "discount name", "discount description", "discount remarks", 10.00f, null);
        discountList.add(discount);

        List<ValuableItem> valuableItemsList = new ArrayList<>();
        ValuableItem item = new ValuableItem(1, 1, 9.99f, discountList, taxList);
        valuableItemsList.add(item);

        ValuationRQ valuationRQ = new ValuationRQ(valuableItemsList);
        return restTemplate.postForObject(getShopCompositeServiceUrl() + "/valuate", valuationRQ, ValuationRS.class);
    }


    
}
