package fab.shop.api.core.product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import fab.shop.api.core.product.msg.*;


@Tag(name="Product Service", description="REST API for Product Services")
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

			
			@Operation(summary = "${api.product-service.post-productbooking.description}", description = "${api.product-service.post-productbooking.notes}")
			@ApiResponses(value = {
				@ApiResponse(responseCode ="200", description = "${api.responseCodes.ok.description}"),
				@ApiResponse(responseCode ="400", description = "${api.responseCodes.badRequest.description}"),
				@ApiResponse(responseCode ="404", description = "${api.responseCodes.notFound.description}"),
				@ApiResponse(responseCode ="422", description = "${api.responseCodes.unprocessableEntity.description}")
		
			})
		@PostMapping(
			value = "/product/productBooking",
			consumes = "application/json",
			produces = "application/json")
			ProductBookingRS productBooking(@RequestBody ProductBookingRQ productBookingRQ);


			@Operation(summary = "${api.product-service.post-productpurchaseconfirm.description}", description = "${api.product-service.post-productpurchaseconfirm.notes}")
			@ApiResponses(value = {
				@ApiResponse(responseCode ="200", description = "${api.responseCodes.ok.description}"),
				@ApiResponse(responseCode ="400", description = "${api.responseCodes.badRequest.description}"),
				@ApiResponse(responseCode ="404", description = "${api.responseCodes.notFound.description}"),
				@ApiResponse(responseCode ="422", description = "${api.responseCodes.unprocessableEntity.description}")
		
			})
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
