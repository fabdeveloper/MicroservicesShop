package fab.shop.microservices.composite.shop.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.composite.ShopIntegrationTestHelper;
import fab.shop.api.core.cart.msg.AddToCartRS;
import fab.shop.api.core.cart.msg.CartModificationRQ;
import fab.shop.api.core.cart.msg.CartModificationRS;
import fab.shop.api.core.cart.msg.EmptyCartRS;
import fab.shop.api.core.cart.msg.GetCartRS;
import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.purchase.Purchase;
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



    @Override
    public EmptyCartRS emptyCartTestHelper() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetCartRS getCartTestHelper() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AddToCartRS addToCartTestHelper() {
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
    public CartModificationRS cartModificationTestHelper() {

        String serviceAddress = getServiceUtil().getServiceAddress();
        Integer cartId = 999;
        Float offerPrice = 9.99f;
        Product product = new Product(3, "product name", "product description", "product remarks", "product type", serviceAddress);
        Article article = new Article(2, "article name", "article description", "article remarks", product);
        Offer offer = new Offer(1, "offer name", "offer description", "offer remarks", offerPrice, article);

        List<Offer> offerList = new ArrayList<Offer>();
        CartModificationRQ cartModificationRQ = new CartModificationRQ(cartId, offerList,  cartId, cartId, offerPrice);

        return restTemplate.postForObject(getShopCompositeServiceUrl() + "/emptyCart", cartModificationRQ, CartModificationRS.class);


    }
    
}
