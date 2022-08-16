package fab.shop.api.composite;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.purchase.Purchase;
import fab.shop.api.core.purchase.msg.*;
import fab.shop.api.core.valuation.msg.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name="Shop Service", description="REST API for Shop Services")
public interface ShopService  {
	
	  @GetMapping(
			    value = "/shop/avail",
			    produces = "application/json")
			  List<Product> getAvail();
	  
	  @GetMapping(
			    value = "/shop/{productId}",
			    produces = "application/json")
			  Product getProduct(@PathVariable int productId);
	  
	
	  @Operation(summary = "${api.shop-service.post-addtocart.description}", description = "${api.shop-service.post-addtocart.notes}")
	  @ApiResponses(value = {
		  @ApiResponse(responseCode ="200", description = "${api.responseCodes.ok.description}"),
		  @ApiResponse(responseCode ="400", description = "${api.responseCodes.badRequest.description}"),
		  @ApiResponse(responseCode ="404", description = "${api.responseCodes.notFound.description}"),
		  @ApiResponse(responseCode ="422", description = "${api.responseCodes.unprocessableEntity.description}")

	  })



	  
	  @PostMapping(
			    value = "/shop/emptyCart",
				consumes = "application/json",
			    produces = "application/json")
			  EmptyCartRS emptyCart(@RequestBody EmptyCartRQ emptyCartRQ);

	  @PostMapping(
			    value = "/shop/addToCart",
				consumes = "application/json",
			    produces = "application/json")
			  AddToCartRS addToCart(@RequestBody AddToCartRQ addToCartRQ);

	  @PostMapping(
			    value = "/shop/getCart",
				consumes = "application/json",
			    produces = "application/json")
			  GetCartRS getCart(@RequestBody GetCartRQ getCartRQ);

			  
	  @PostMapping(
		value = "/shop/cartModification",
		consumes = "application/json",
		produces = "application/json")
	  CartModificationRS cartModification(@RequestBody CartModificationRQ cartModificationRQ);
	  
	  @PostMapping(
			    value = "/shop/confirm",
				consumes = "application/json",
			    produces = "application/json")
			  Purchase purchaseConfirm(@RequestBody PurchaseConfirmRQ purchaseConfirmRQ);
	  
	  @GetMapping(
			    value = "/shop/purchase/{purchaseId}",
			    produces = "application/json")
			  Product getPurchase(@PathVariable int purchaseId);

	  @PostMapping(
			    value = "/shop/valuate",
				consumes = "application/json",
			    produces = "application/json")
			  ValuationRS getValuation(@RequestBody ValuationRQ body);


	// TEST HELPERS ******************* //


	
	@GetMapping(
		value = "/shop/testemptycart",
		produces = "application/json")
		EmptyCartRS emptyCartTestHelper();

	@GetMapping(
		value = "/shop/testgetcart",
		produces = "application/json")
		GetCartRS getCartTestHelper();

	  @GetMapping(
			    value = "/shop/testaddtocart",
			    produces = "application/json")
			  AddToCartRS addToCartTestHelper();

	  @GetMapping(
			    value = "/shop/testpurchaseconfirm",
			    produces = "application/json")
			  Purchase purchaseConfirmTestHelper();

	  @GetMapping(
			    value = "/shop/testvaluation",
			    produces = "application/json")
			  ValuationRS valuationTestHelper();

}
