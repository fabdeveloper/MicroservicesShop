package fab.shop.api.core.product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductConfigRQ;
import fab.shop.api.core.product.msg.ProductConfigRS;
import fab.shop.api.core.product.msg.ProductCreateNewRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;


public interface ProductConfigService {
    
    
	@PostMapping(
		value = "/product/config/createnew",
		consumes = "application/json",
		produces = "application/json")
		public ProductCreateNewRS productCreateNew(@RequestBody ProductCreateNewRQ productCreateNewRQ);


    @PostMapping(
		value = "/product/config/config",
		consumes = "application/json",
		produces = "application/json")
		public ProductConfigRS productConfig(@RequestBody ProductConfigRQ productConfigRQ);
    
}
