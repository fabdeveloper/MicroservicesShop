package fab.shop.api.core.product;


public class Product extends AbstractBusinessItem{
	

	 private final String type;
     private final String serviceAddress;


	public Product(int id, String name, String description, String remarks, String type, String serviceAddress) {
		super(id, name, description, remarks);
		
		this.type = type;
		this.serviceAddress = serviceAddress;
	}



	  public Product() {
		super();

		this.type = null;
	    serviceAddress = null;
	  }




	public String getServiceAddress() {
		return serviceAddress;
	}

	public String getType() {
		return this.type;
	}	 




	@Override
	public String toString() {
		return "{" + super.toString() + 
			", type='" + getType() + "'" +
			", serviceAddress='" + getServiceAddress() + "'" +
			"}";
	}

	

	

}
