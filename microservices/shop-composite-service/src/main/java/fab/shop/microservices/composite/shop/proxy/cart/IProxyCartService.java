package fab.shop.microservices.composite.shop.proxy.cart;

import fab.shop.api.core.cart.msg.*;


public interface IProxyCartService {


    

		GetCartRS getCart(GetCartRQ getCartRQ);	 

		CartModificationRS cartModification(CartModificationRQ cartModificationRQ);	  

		AddToCartRS addToCart(AddToCartRQ addToCartRq);

		RemoveFromCartRS removeFromCart(RemoveFromCartRQ removeFromCartRq);

		EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ);
			  
		DeleteCartRS deleteCart(DeleteCartRQ deleteCartRQ);


		/***************
		 * 
		 * it tests MapStruct interface
		 * 
		 */

		String getCartApiObject();

		String getCartEntityObject();



    
}
