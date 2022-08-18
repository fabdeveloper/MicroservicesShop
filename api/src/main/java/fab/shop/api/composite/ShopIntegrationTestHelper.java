package fab.shop.api.composite;


import org.springframework.web.bind.annotation.GetMapping;

import fab.shop.api.core.cart.msg.AddToCartRS;
import fab.shop.api.core.cart.msg.CartModificationRS;
import fab.shop.api.core.cart.msg.EmptyCartRS;
import fab.shop.api.core.cart.msg.GetCartRS;
import fab.shop.api.core.purchase.Purchase;
import fab.shop.api.core.valuation.msg.ValuationRS;

public interface ShopIntegrationTestHelper {
    
	// CartService tests
    
	@GetMapping(
		value = "/shoptester/testemptycart",
		produces = "application/json")
		EmptyCartRS emptyCartTestHelper();

	@GetMapping(
		value = "/shoptester/testgetcart",
		produces = "application/json")
		GetCartRS getCartTestHelper();

	  @GetMapping(
			    value = "/shoptester/testaddtocart",
			    produces = "application/json")
			  AddToCartRS addToCartTestHelper();

	  @GetMapping(
			    value = "/shoptester/testpurchaseconfirm",
			    produces = "application/json")
			  Purchase purchaseConfirmTestHelper();

	  @GetMapping(
			    value = "/shoptester/testvaluation",
			    produces = "application/json")
			  ValuationRS valuationTestHelper();

    
	@GetMapping(
        value = "/shoptester/testcartmodification",
        produces = "application/json")
        CartModificationRS cartModificationTestHelper();




	// ValuationService tests

	@GetMapping(
		value = "/shoptester/testvaluate",
		produces = "application/json")
		ValuationRS valuateTestHelper();



}
