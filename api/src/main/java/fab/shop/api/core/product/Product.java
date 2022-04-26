package fab.shop.api.core.product;

public class Product {
	
	 private final int productId;
	  private final String name;
	  private final Float price;
	  private final String serviceAddress;


	public Product(int productId, String name, Float price, String serviceAddress) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.serviceAddress = serviceAddress;
	}


	  public Product() {
	    productId = 0;
	    name = null;
	    price = (float) 0;
	    serviceAddress = null;
	  }



	  public int getProductId() {
	    return productId;
	  }

	  public String getName() {
	    return name;
	  }

	public String getServiceAddress() {
		return serviceAddress;
	}


	public Float getPrice() {
		return this.price;
	}


	  
	  

}
