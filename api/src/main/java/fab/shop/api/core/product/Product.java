package fab.shop.api.core.product;


public class Product extends AbstractBusinessItem{
	

	private  Shop shop;
	 private  String type;
     private String serviceAddress;


	public Product(int id, String name, String description, String remarks, Shop shop, String type, String serviceAddress) {
		super(id, name, description, remarks);
		
		this.shop = shop;
		this.type = type;
		this.serviceAddress = serviceAddress;
	}



	  public Product() {
		super();

		this.shop = null;
		this.type = null;
	    serviceAddress = null;
	  }


	public Shop getShop() {
		return this.shop;
	}


	public String getServiceAddress() {
		return serviceAddress;
	}

	public String getType() {
		return this.type;
	}	 

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}




	@Override
	public String toString() {
		String anterior = super.toString();
		return anterior + ", {" +
			" shop='" + getShop().toString() + "'" +
			", type='" + getType() + "'" +
			", serviceAddress='" + getServiceAddress() + "'" +
			"}";
	}
	

	

	

}
