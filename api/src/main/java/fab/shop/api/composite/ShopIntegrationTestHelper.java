package fab.shop.api.composite;


import org.springframework.web.bind.annotation.GetMapping;

import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.msg.*;
import fab.shop.api.core.purchase.msg.*;
import fab.shop.api.core.valuation.msg.*;

public interface ShopIntegrationTestHelper {
    
	// CartService tests
    


	@GetMapping(
		value = "/shoptester/testgetcart",
		produces = "application/json")
		GetCartRS getCartTestHelper();

	  @GetMapping(
			    value = "/shoptester/testaddtocart",
			    produces = "application/json")
			  AddToCartRS addToCartTestHelper();

	@GetMapping(
				value = "/shoptester/testcartmodification",
				produces = "application/json")
				CartModificationRS cartModificationTestHelper();

	@GetMapping(
				value = "/shoptester/testemptycart",
				produces = "application/json")
				EmptyCartRS emptyCartTestHelper();






	// ValuationService tests

	@GetMapping(
		value = "/shoptester/testvaluate",
		produces = "application/json")
		ValuationRS valuateTestHelper();


		// PurchaseService tests

	@GetMapping(
			value = "/shoptester/testpurchaseconfirm",
			produces = "application/json")
		  PurchaseConfirmRS purchaseConfirmTestHelper();

}
