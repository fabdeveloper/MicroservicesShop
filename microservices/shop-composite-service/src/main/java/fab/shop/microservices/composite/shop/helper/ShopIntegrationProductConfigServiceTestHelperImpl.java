package fab.shop.microservices.composite.shop.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.composite.ShopIntegrationProductConfigServiceTestHelper;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.product.msg.ProductConfigRQ;
import fab.shop.api.core.product.msg.ProductConfigRS;
import fab.shop.api.core.product.msg.ProductCreateNewRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.microservices.composite.shop.services.ShopCompositeIntegration;
import fab.shop.util.http.ServiceUtil;

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
        Product product = new Product(0, null, null, null, null, null, null);
        productCreateNewRQ.addProduct(product);


        return restTemplate.postForObject(getShopIntegration().getProductServiceUrl() + "/config/createnew", productCreateNewRQ, ProductCreateNewRS.class);
    }

    @Override
    public ProductConfigRS productConfigTestHelper() {

        ProductConfigRQ productConfigRQ = new ProductConfigRQ();
        
        return restTemplate.postForObject(getShopIntegration().getProductServiceUrl() + "/config/config", productConfigRQ, ProductConfigRS.class);
    }
    
}
