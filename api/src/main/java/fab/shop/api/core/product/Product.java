package fab.shop.api.core.product;


public class Product {
	
	 private final int id;
	 private final String name;
	 private final String type;
	  
	  private final String serviceAddress;


	public Product(int id, String name, String type, String serviceAddress) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.serviceAddress = serviceAddress;
	}



	  public Product() {
	    id = 0;
	    name = null;
		this.type = null;
	    serviceAddress = null;
	  }



	public int getId() {
		return this.id;
	}



	  public String getName() {
	    return name;
	  }

	public String getServiceAddress() {
		return serviceAddress;
	}

	public String getType() {
		return this.type;
	}	 
	

	

}
