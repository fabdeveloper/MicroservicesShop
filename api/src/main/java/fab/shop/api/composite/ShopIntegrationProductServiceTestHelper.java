package fab.shop.api.composite;

import org.springframework.web.bind.annotation.GetMapping;

import fab.shop.api.core.product.msg.*;

public interface ShopIntegrationProductServiceTestHelper {
    
    
	@GetMapping(
        value = "/shoptester/productservice/testproductmappers",
        produces = "application/json")
      ProductMappersTestRS productMappersTestHelper();
}
