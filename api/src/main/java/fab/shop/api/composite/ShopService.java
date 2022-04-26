package fab.shop.api.composite;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import fab.shop.api.core.cart.AddToCartRQ;
import fab.shop.api.core.cart.AddToCartRS;
import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.purchase.Purchase;
import fab.shop.api.core.valuation.ValuationRQ;
import fab.shop.api.core.valuation.ValuationRS;

public interface ShopService {
	
	  @GetMapping(
			    value = "/shop/avail",
			    produces = "application/json")
			  List<Product> getAvail();
	  
	  @GetMapping(
			    value = "/shop/{productId}",
			    produces = "application/json")
			  Product getProduct(@PathVariable int productId);
	  
	  @PostMapping(
			    value = "/shop/addToCart",
				consumes = "application/json",
			    produces = "application/json")
			  AddToCartRS addToCart(@RequestBody AddToCartRQ body);
	  
	  @PostMapping(
			    value = "/shop/confirm",
				consumes = "application/json",
			    produces = "application/json")
			  Purchase purchaseConfirm(@RequestBody PurchaseConfirmRQ body);
	  
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
			    value = "/shop/testcart",
			    produces = "application/json")
			  AddToCartRS cartTestHelper();

	  @GetMapping(
			    value = "/shop/testpurchaseconfirm",
			    produces = "application/json")
			  Purchase purchaseConfirmTestHelper();

	  @GetMapping(
			    value = "/shop/testvaluation",
			    produces = "application/json")
			  ValuationRS valuationTestHelper();

}
