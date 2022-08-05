package fab.shop.api.core.cart;

import java.util.List;

import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;

public class Cart {
	
	private final int cartId;
	private final List<Offer> productList;
	private final String serviceAddress;

	

	public Cart(int cartId, List<Offer> productList, String serviceAddress) {
		this.cartId = cartId;
		this.productList = productList;
		this.serviceAddress = serviceAddress;
	}
	

	public Cart() {
		super();
		
		this.cartId = 0;
		this.productList = null;
		this.serviceAddress = null;
	}

	public int getCartId() {
		return cartId;
	}
	public List<Offer> getProductList() {
		return productList;
	}
	

	public String getServiceAddress() {
		return this.serviceAddress;
	}


	
	
	
	
}
