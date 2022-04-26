package fab.shop.api.core.cart;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



public interface CartService {
	
	  	@GetMapping(
			    value = "/cart/{cartId}",
			    produces = "application/json")
			  Cart getCart(@PathVariable int cartId);

		@PostMapping(
			    value = "/cart/update",
				consumes = "application/json",
			    produces = "application/json")
				//Cart addToCart(@RequestParam Product product, @RequestParam Integer cartId);
				Cart updateCart(@RequestBody Cart cart);	  


		@PostMapping(
			    value = "/cart/addToCart",
				consumes = "application/json",
			    produces = "application/json")
				//Cart addToCart(@RequestParam Product product, @RequestParam Integer cartId);
				AddToCartRS addToCart(@RequestBody AddToCartRQ addToCartRq);

		@GetMapping(
			    value = "/cart/{productId}",
			    produces = "application/json")
			  Cart removeFromCart(@RequestParam Integer productId, @RequestParam Integer cartId);

		@DeleteMapping(
			    value = "/cart/{cartId}",
			    produces = "application/json")
			  void deleteCart(@PathVariable int cartId);

}
