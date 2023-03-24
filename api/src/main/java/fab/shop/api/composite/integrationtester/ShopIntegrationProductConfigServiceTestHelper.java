package fab.shop.api.composite.integrationtester;

import org.springframework.web.bind.annotation.GetMapping;

import fab.shop.api.core.product.msg.ProductConfigRS;
import fab.shop.api.core.product.msg.ProductCreateNewRS;

public interface ShopIntegrationProductConfigServiceTestHelper {

    
	@GetMapping(
        value = "/shoptester/productconfigservice/testproductcreatenew",
        produces = "application/json")
      ProductCreateNewRS productCreateNewTestHelper();


      
	@GetMapping(
        value = "/shoptester/productconfigservice/testproductconfig",
        produces = "application/json")
      ProductConfigRS productConfigTestHelper();
    
}
