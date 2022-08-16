package fab.shop.api.core.cart;

import java.util.List;

import fab.shop.api.core.product.Offer;

public class Cart {
	
	private final Integer cartId;
	private final List<Offer> productList;
	private final String serviceAddress;
	private final Integer userId;
	private final Integer shopId;
	private final Float valuation;

	




	public Cart(Integer cartId, List<Offer> productList, Integer userId, Integer shopId, Float valuation, String serviceAddress) {
		this.cartId = cartId;
		this.productList = productList;
		this.serviceAddress = serviceAddress;
		this.userId = userId;
		this.shopId = shopId;
		this.valuation = valuation;
	}

	

	public Cart() {
		super();
		
		this.cartId = null;
		this.productList = null;
		this.serviceAddress = null;
		this.userId = null;
		this.shopId = null;
		this.valuation = null;
	}

	public Integer getCartId() {
		return cartId;
	}
	public List<Offer> getProductList() {
		return productList;
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
		return "{" + super.toString() +
			", cartId='" + getCartId() + "'" +
			", productList='" + getProductList() + "'" +
			", serviceAddress='" + getServiceAddress() + "'" +
			"}";
	}
	
	
	
	
}
