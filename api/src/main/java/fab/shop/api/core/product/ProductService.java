package fab.shop.api.core.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fab.shop.api.core.product.msg.GenericProductConfigRQ;
import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;

public interface ProductService {
	
	  /**
	   * Sample usage: "curl $HOST:$PORT/product/1".
	   *
	   * @param productId Id of the product
	   * @return the product, if found, else null
	   */
	//   @GetMapping(
	//     value = "/product/{productId}",
	//     produces = "application/json")
	//   Product getProduct(@PathVariable int productId);


	  
	  @PostMapping(
		value = "/product/getAvail",
		consumes = "application/json",
		produces = "application/json")
		GetAvailRS getAvail(@RequestBody GetAvailRQ getAvailRQ);
	  
		@PostMapping(
			value = "/product/getOfferListDetail",
			consumes = "application/json",
			produces = "application/json")
			GetOfferListDetailRS getOfferListDetail(@RequestBody GetOfferListDetailRQ getOfferListDetailRQ);

			
	  
		@PostMapping(
			value = "/product/productPurchaseConfirm",
			consumes = "application/json",
			produces = "application/json")
			ProductPurchaseConfirmRS productPurchaseConfirm(@RequestBody ProductPurchaseConfirmRQ productPurchaseConfirmRQ);

			
	  
		@PostMapping(
			value = "/product/productPurchaseCancel",
			consumes = "application/json",
			produces = "application/json")
			ProductPurchaseCancelRS productPurchaseCancel(@RequestBody ProductPurchaseCancelRQ productPurchaseCancelRQ);

			
	@PostMapping(
		value = "/product/createnew",
		consumes = "application/json",
		produces = "application/json")
		public ProductCreateNewRS productCreateNew(@RequestBody ProductConfigBasicRQ productCreateNewRQ);


		
	@PostMapping(
		value = "/product/testconfig",
		consumes = "application/json",
		produces = "application/json")
		public ProductCreateNewRS testConfig(@RequestBody GenericProductConfigRQ testConfigRQ);


}
