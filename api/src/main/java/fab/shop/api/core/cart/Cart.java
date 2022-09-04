package fab.shop.api.core.cart;

import java.util.List;

// import fab.shop.api.core.product.Offer;

public class Cart {
	
	private final Integer cartId;
	private final List<CartItem> cartItemsList;

	private final String serviceAddress;
	private final Integer userId;
	private final Integer shopId;
	private final Float valuation;

	


	public Cart(Integer cartId, List<CartItem> cartItemsList, String serviceAddress, Integer userId, Integer shopId, Float valuation) {
		this.cartId = cartId;
		this.cartItemsList = cartItemsList;
		this.serviceAddress = serviceAddress;
		this.userId = userId;
		this.shopId = shopId;
		this.valuation = valuation;
	}
	

	public Cart() {
		super();
		
		this.cartId = null;
		this.cartItemsList = null;
		this.serviceAddress = null;
		this.userId = null;
		this.shopId = null;
		this.valuation = null;
	}

	public Integer getCartId() {
		return cartId;
	}


	public List<CartItem> getCartItemsList() {
		return this.cartItemsList;
	}

	
	

	public String getServiceAddress() {
		return this.serviceAddress;
	}


	public Integer getUserId() {
		return this.userId;
	}


	public Integer getShopId() {
		return this.shopId;
	}


	public Float getValuation() {
		return this.valuation;
	}


	@Override
	public String toString() {

		String cartItemsList = "{ ";
		for(CartItem cartItem : getCartItemsList()){
			cartItemsList += cartItem.toString() + " ,";
		}
		cartItemsList += " } ";
		
		return "{" +
			" cartId='" + getCartId() + "'" +
			", cartItemsList='" + cartItemsList + "'" +
			", serviceAddress='" + getServiceAddress() + "'" +
			", userId='" + getUserId() + "'" +
			", shopId='" + getShopId() + "'" +
			", valuation='" + getValuation() + "'" +
			"}";
	}



	
}
