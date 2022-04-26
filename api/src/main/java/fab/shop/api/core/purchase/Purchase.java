package fab.shop.api.core.purchase;

import java.util.List;

import fab.shop.api.core.product.Product;

public class Purchase {
	
	private final Integer id;	
	private final List<Product> productList;
	private final Integer userId;
	private final Float price;
	private final String shipmentAddress;
    private final String paymentMethod;
	private final String status;

	private final String serviceAddress;

	

	public Purchase(Integer id, List<Product> productList, Integer userId, Float price, String shipmentAddress, String paymentMethod, String status, String serviceAddress) {
		this.id = id;
		this.productList = productList;
		this.userId = userId;
		this.price = price;
		this.shipmentAddress = shipmentAddress;
		this.paymentMethod = paymentMethod;
		this.status = status;
		this.serviceAddress = serviceAddress;
	}


	public Purchase() {
		super();
		
		this.id = 0;
		this.productList = null;
		this.userId = null;
		this.price = null;
		this.shipmentAddress = null;
		this.paymentMethod = null;
		this.status = null;
		this.serviceAddress = null;
	}


	public Integer getId() {
		return id;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public Integer getUserId() {
		return userId;
	}


	public Float getPrice() {
		return price;
	}
	
	

	public String getShipmentAddress() {
		return this.shipmentAddress;
	}


	public String getPaymentMethod() {
		return this.paymentMethod;
	}


	public String getStatus() {
		return this.status;
	}

	

	public String getServiceAddress() {
		return this.serviceAddress;
	}


}
