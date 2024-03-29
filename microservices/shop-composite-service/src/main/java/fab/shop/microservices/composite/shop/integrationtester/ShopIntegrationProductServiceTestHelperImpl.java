package fab.shop.microservices.composite.shop.integrationtester;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.core.product.msg.GenericProductConfigRQ;
import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.api.core.product.msg.ProductCreateNewRQ;

import fab.shop.api.core.product.msg.ProductMappersTestRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.api.core.product.transfer.OfferPurchase;
import fab.shop.api.core.product.transfer.Product;
import fab.shop.api.core.product.transfer.Shop;
import fab.shop.api.core.product.msg.ProductConfirmRQ;
import fab.shop.api.core.product.msg.ProductConfirmRS;
import fab.shop.microservices.composite.shop.services.ShopCompositeIntegration;
import fab.shop.util.http.ServiceUtil;
import fab.shop.api.composite.integrationtester.ShopIntegrationProductServiceTestHelper;



@RestController
public class ShopIntegrationProductServiceTestHelperImpl implements ShopIntegrationProductServiceTestHelper {

    
    private final RestTemplate restTemplate;
    private final ServiceUtil serviceUtil;
    private final ShopCompositeIntegration shopIntegration;

    @Autowired
    public ShopIntegrationProductServiceTestHelperImpl(RestTemplate restTemplate, ServiceUtil serviceUtil, ShopCompositeIntegration shopIntegration) {
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
    public ProductMappersTestRS productMappersTestHelper() {
      String allresults = restTemplate.getForObject(getShopIntegration().getProductServiceUrl() + "/maptester/testall", String.class);

        ProductMappersTestRS rs = new ProductMappersTestRS(allresults);
        return rs;
    }


    @Override
    public GetAvailRS getAvailTestHelper() {

        List<Integer> productList = new ArrayList<>();
        productList.add(5);
        List<Integer> articleList = new ArrayList<>();
        articleList.add(3);
        articleList.add(5);
        articleList.add(6);
        articleList.add(9);



        GetAvailRQ rq = new GetAvailRQ(4, productList, articleList, null);

        String surl = getShopIntegration().getProductServiceUrl() + "/getAvail";
        System.out.println("ShopIntegrationProductServiceTestHelperImpl - getAvailTestHelper - llamando al servicio en : " + surl);

        return restTemplate.postForObject(surl, rq, GetAvailRS.class);
    }


    @Override
    public GetOfferListDetailRS getOfferListDetailTestHelper() {

        List<Integer> offerList = new ArrayList<>();
        offerList.add(12);

        GetOfferListDetailRQ rq = new GetOfferListDetailRQ(3, offerList);

        return restTemplate.postForObject(getShopIntegration().getProductServiceUrl() + "/getOfferListDetail", rq, GetOfferListDetailRS.class);
    }


    @Override
    public ProductConfirmRS productPurchaseConfirmTestHelper() {
        List<OfferPurchase> offerPurechaseList = new ArrayList<>();
        OfferPurchase offerPurchase = new OfferPurchase(12, 2);
        offerPurechaseList.add(offerPurchase);

        ProductConfirmRQ rq = new ProductConfirmRQ(44, offerPurechaseList);

        return restTemplate.postForObject(getShopIntegration().getProductServiceUrl() + "/productPurchaseConfirm", rq, ProductConfirmRS.class);
    }


    @Override
    public ProductPurchaseCancelRS productPurchaseCancelTestHelper() {

        List<OfferPurchase> offerPurechaseList = new ArrayList<>();
        OfferPurchase offerPurchase = new OfferPurchase(5, 2);
        offerPurechaseList.add(offerPurchase);

        ProductPurchaseCancelRQ rq = new ProductPurchaseCancelRQ(21, offerPurechaseList);


        return restTemplate.postForObject(getShopIntegration().getProductServiceUrl() + "/productPurchaseCancel", rq, ProductPurchaseCancelRS.class);
    }


    @Override
    public ProductCreateNewRS productCreateNewTestHelper() {

        List<Shop> shopList = new ArrayList<>();
        Shop shop = new Shop(3, "shop name", "shop description", "shop remarks", 5555);
        shopList.add(shop);

        ProductCreateNewRQ rq = new ProductCreateNewRQ(1, shopList, null, null, null, null, null);

        return restTemplate.postForObject(getShopIntegration().getProductServiceUrl() + "/createnew", rq, ProductCreateNewRS.class);

    }


    @Override
    public ProductCreateNewRS productTestConfigTestHelper() {

        GenericProductConfigRQ rq = new GenericProductConfigRQ();
        String info = "testing rq ...";
        
        rq.setInfo(info);

        return getShopIntegration().testConfig(rq);
    }
    
}
