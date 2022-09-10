package fab.shop.api.core.cart;

import java.util.List;

// import fab.shop.api.core.product.Offer;

public class Cart {
	
	private Integer cartId;
	private List<CartItem> cartItemsList;

	private String serviceAddress;
	private Integer userId;
	private Integer shopId;
	private Float valuation;

	


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
		
		// this.cartId = null;
		// this.cartItemsList = null;
		// this.serviceAddress = null;
		// this.userId = null;
		// this.shopId = null;
		// this.valuation = null;
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

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public void setCartItemsList(List<CartItem> cartItemsList) {
		this.cartItemsList = cartItemsList;
	}
	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public void setValuation(Float valuation) {
		this.valuation = valuation;
	}



	@Override 
	public String toString() {

		String cartItemsList = null;

		if(getCartItemsList() != null){
			cartItemsList = "{ ";
			for(CartItem cartItem : getCartItemsList()){
				cartItemsList += cartItem.toString() + " ,";
			}
			cartItemsList += " } ";

		}

		
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
