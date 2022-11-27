package fab.shop.microservices.composite.shop.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.composite.ShopIntegrationProductConfigServiceTestHelper;
import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Discount;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.Shop;
import fab.shop.api.core.product.Tax;
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductConfigRQ;
import fab.shop.api.core.product.msg.ProductConfigRS;
import fab.shop.api.core.product.msg.ProductCreateNewRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.microservices.composite.shop.services.ShopCompositeIntegration;
import fab.shop.util.http.ServiceUtil;


@RestController
public class ShopIntegrationProductConfigServiceTestHelperImpl implements ShopIntegrationProductConfigServiceTestHelper{

    private final RestTemplate restTemplate;
    private final ServiceUtil serviceUtil;
    private final ShopCompositeIntegration shopIntegration;



    @Autowired
    public ShopIntegrationProductConfigServiceTestHelperImpl(RestTemplate restTemplate, ServiceUtil serviceUtil, ShopCompositeIntegration shopIntegration) {
        this.restTemplate = restTemplate;
        this.serviceUtil = serviceUtil;
        this.shopIntegration = shopIntegration;
    }


    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }


    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }


    public ShopCompositeIntegration getShopIntegration() {
        return this.shopIntegration;
    }





    @Override
    public ProductCreateNewRS productCreateNewTestHelper() {


        ProductCreateNewRQ productCreateNewRQ = new ProductCreateNewRQ();

        // shop
        Shop shop = new Shop(null, "shop name", "shop description", "shop remarks", 33334);
        productCreateNewRQ.addShop(shop);

        // product
        Shop shop2 = new Shop(null, "shop2 name", "shop2 description", "shop2 remarks", 33335);
        Product product = new Product(null, "product 100 name", "product 100 description", "product 100 remarks", shop2, "product 100 type", getServiceUtil().getServiceAddress());
        productCreateNewRQ.addProduct(product);

        // article
        Shop shop3 = new Shop(null, "shop3 name", "shop3 description", "shop3 remarks", 33337);
        Product product2 = new Product(null, "product 2 name", "product 2 description", "product 2 remarks", shop3, "product 2 type", getServiceUtil().getServiceAddress());
        Article article = new Article(null, "article name", "article description", "article remarks", product2);
        productCreateNewRQ.addArticle(article);


        // discount

        Discount discount = new Discount(null, "discount name", "discount description", "discount remarks", 5.00f, null);
        productCreateNewRQ.addDiscount(discount);

        Tax tax = new Tax(null, "tax name", "tax description", "tax remarks", 21.00f, null);
        productCreateNewRQ.addTax(tax);

        // offer
        Shop shop4 = new Shop(null, "shop4 name", "shop4 description", "shop4 remarks", 33336);
        Product product3 = new Product(null, "product 3 name", "product 3 description", "product 3 remarks", shop4, "product 3 type", getServiceUtil().getServiceAddress());
        Article article2 = new Article(null, "article name", "article description", "article remarks", product3);

        List<Discount> discounList = new ArrayList<>();
        List<Tax> taxList = new ArrayList<>();
        Discount discount2 = new Discount(null, "discount2 name", "discount2 description", "discount2 remarks", 20.00f, null);
        discounList.add(discount2);
        Tax tax2 = new Tax(null, "tax2 name", "tax2 description", "tax2 remarks", 26.00f, null);
        taxList.add(tax2);
        Offer offer = new Offer(null, "offer name", "offer description", "offer remarks", 9.99f, article2, discounList, taxList, new Date(), new Date(), true, 5, 5);
        productCreateNewRQ.addOffer(offer);
 
        System.out.println("sending : " + productCreateNewRQ.toString());
        String urlservice = getShopIntegration().getProductServiceUrl() + "/config/createnew";
        System.out.println("sending to : " + urlservice);

        return restTemplate.postForObject(urlservice, productCreateNewRQ, ProductCreateNewRS.class);
    }

    @Override
    public ProductConfigRS productConfigTestHelper() {

        ProductConfigRQ rq = new ProductConfigRQ();

        Shop shop = new Shop(5, "shop name", "shop description", "shop remarks", 123);
        rq.addShop(shop);
        System.out.println("enviado : " + rq.toString());
        return restTemplate.postForObject(getShopIntegration().getProductServiceUrl() + "/config/config", rq, ProductConfigRS.class);
    }
    
}
