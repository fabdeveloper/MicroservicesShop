package fab.shop.api.core.purchase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import fab.shop.api.composite.PurchaseConfirmRQ;


public interface PurchaseService {
	
	  	@GetMapping(
			    value = "/purchase/{purchaseId}",
			    produces = "application/json")
			  Purchase getPurchase(@PathVariable int purchaseId);


		@PostMapping(
			    value = "/purchase/create",
				consumes = "application/json",
			    produces = "application/json")
			  Purchase createPurchase(@RequestBody Purchase purchase);

		@GetMapping(
			    value = "/purchase/cancel",
			    produces = "application/json")
			  Purchase purchaseCancel(@RequestParam int purchaseId);


		@PostMapping(
			    value = "/purchase/confirm",
				consumes = "application/json",
			    produces = "application/json")
			  Purchase purchaseConfirm(@RequestBody PurchaseConfirmRQ purchaseConfirmRQ);

}
