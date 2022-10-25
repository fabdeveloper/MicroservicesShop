package fab.shop.microservices.composite.shop.helper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.composite.ShopIntegrationProductServiceTestHelper;
import fab.shop.api.core.product.msg.ProductMappersTestRS;
import fab.shop.microservices.composite.shop.services.ShopCompositeIntegration;
import fab.shop.util.http.ServiceUtil;



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
    
}
