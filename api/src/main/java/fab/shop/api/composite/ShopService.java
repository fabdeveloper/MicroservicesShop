package fab.shop.api.composite;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.msg.*;
import fab.shop.api.core.purchase.msg.*;
import fab.shop.api.core.valuation.msg.*;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name="Shop Service", description="REST API for Shop Services")
public interface ShopService extends IEShopOrchestrator  {
	  
	
	  @Operation(summary = "${api.shop-service.post-addtocart.description}", description = "${api.shop-service.post-addtocart.notes}")
	  @ApiResponses(value = {
		  @ApiResponse(responseCode ="200", description = "${api.responseCodes.ok.description}"),
		  @ApiResponse(responseCode ="400", description = "${api.responseCodes.badRequest.description}"),
		  @ApiResponse(responseCode ="404", description = "${api.responseCodes.notFound.description}"),
		  @ApiResponse(responseCode ="422", description = "${api.responseCodes.unprocessableEntity.description}")

	  })
	  @PostMapping(
		value = "/shop/addToCart",
		consumes = "application/json",
		produces = "application/json")
	  AddToCartRS addToCart(@RequestBody AddToCartRQ addToCartRQ);



	  @Operation(summary = "${api.shop-service.post-emptycart.description}", description = "${api.shop-service.post-emptycart.notes}")
	  @ApiResponses(value = {
		  @ApiResponse(responseCode ="200", description = "${api.responseCodes.ok.description}")
	  })
	  @PostMapping(
			    value = "/shop/emptyCart",
				consumes = "application/json",
			    produces = "application/json")
			  EmptyCartRS emptyCart(@RequestBody EmptyCartRQ emptyCartRQ);


	@Operation(summary = "${api.shop-service.post-getcart.description}", description = "${api.shop-service.post-getcart.notes}")
	@ApiResponses(value = {
		@ApiResponse(responseCode ="200", description = "${api.responseCodes.ok.description}")
	})
	  @PostMapping(
			    value = "/shop/getCart",
				consumes = "application/json",
			    produces = "application/json")
			  GetCartRS getCart(@RequestBody GetCartRQ getCartRQ);


	@Operation(summary = "${api.shop-service.post-cartmodification.description}", description = "${api.shop-service.post-cartmodification.notes}")
	@ApiResponses(value = {
		@ApiResponse(responseCode ="200", description = "${api.responseCodes.ok.description}")
	})
	  @PostMapping(
		value = "/shop/cartModification",
		consumes = "application/json",
		produces = "application/json")
	  CartModificationRS cartModification(@RequestBody CartModificationRQ cartModificationRQ);
	  

	  // PurchaseService

	  @PostMapping(
			    value = "/shop/confirm",
				consumes = "application/json",
			    produces = "application/json")
				PurchaseConfirmRS purchaseConfirm(@RequestBody PurchaseConfirmRQ purchaseConfirmRQ);
	  

	
	// ValuationService


	@Operation(summary = "${api.shop-service.post-getvaluation.description}", description = "${api.shop-service.post-getvaluation.notes}")
	@ApiResponses(value = {
		@ApiResponse(responseCode ="200", description = "${api.responseCodes.ok.description}")
	})
	  @PostMapping(
			    value = "/shop/valuate",
				consumes = "application/json",
			    produces = "application/json")
			  ValuationRS getValuation(@RequestBody ValuationRQ valuationRQ);



	// ProductService

	
	  
	@PostMapping(
		value = "/shop/getAvail",
		consumes = "application/json",
		produces = "application/json")
		GetAvailRS getAvail(@RequestBody GetAvailRQ getAvailRQ);
	  
		@PostMapping(
			value = "/shop/getOfferListDetail",
			consumes = "application/json",
			produces = "application/json")
			GetOfferListDetailRS getOfferListDetail(@RequestBody GetOfferListDetailRQ getOfferListDetailRQ);

			
	  
		@PostMapping(
			value = "/shoop/productPurchaseConfirm",
			consumes = "application/json",
			produces = "application/json")
			ProductPurchaseConfirmRS productPurchaseConfirm(@RequestBody ProductPurchaseConfirmRQ productPurchaseConfirmRQ);

			
	  
		@PostMapping(
			value = "/shop/productPurchaseCancel",
			consumes = "application/json",
			produces = "application/json")
			ProductPurchaseCancelRS productPurchaseCancel(@RequestBody ProductPurchaseCancelRQ productPurchaseCancelRQ);



	// TEST HELPERS ******************* //

	  @GetMapping(
			    value = "/shop/apiobject",
			    produces = "application/json")
			  String apiObject();


	  @GetMapping(
			    value = "/shop/entityobject",
			    produces = "application/json")
			  String entityObject();

}
