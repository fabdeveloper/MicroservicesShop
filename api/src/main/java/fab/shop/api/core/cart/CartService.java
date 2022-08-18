package fab.shop.api.core.cart;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fab.shop.api.core.cart.msg.*;




public interface CartService {
	
	  	// @GetMapping(
		// 	    value = "/cart/{cartId}",
		// 	    produces = "application/json")
		// 	  Cart getCart(@PathVariable int cartId);

		@PostMapping(
			value = "/cart/getCart",
			consumes = "application/json",
			produces = "application/json")
			GetCartRS getCart(@RequestBody GetCartRQ getCartRQ);	  


		@PostMapping(
			    value = "/cart/cartModification",
				consumes = "application/json",
			    produces = "application/json")
				CartModificationRS cartModification(@RequestBody CartModificationRQ cartModificationRQ);	  


		@PostMapping(
			    value = "/cart/addToCart",
				consumes = "application/json",
			    produces = "application/json")
				//Cart addToCart(@RequestParam Product product, @RequestParam Integer cartId);
				AddToCartRS addToCart(@RequestBody AddToCartRQ addToCartRq);

		@PostMapping(
			    value = "/cart/removeFromCart",
				consumes = "application/json",
			    produces = "application/json")
			  RemoveFromCartRS removeFromCart(@RequestBody RemoveFromCartRQ removeFromCartRq);

		@PostMapping(
			    value = "/cart/emptyCart",
				consumes = "application/json",
			    produces = "application/json")
			  EmptyCartRS emptyCart(@RequestBody EmptyCartRQ emptyCartRQ);

			  
		@DeleteMapping(
			    value = "/cart/deleteCart",
			    produces = "application/json")
			  DeleteCartRS deleteCart(@RequestBody DeleteCartRQ deleteCartRQ);

}
