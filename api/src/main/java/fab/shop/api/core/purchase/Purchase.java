package fab.shop.api.core.purchase;

import java.util.Date;
import java.util.List;

import fab.shop.api.core.product.Product;

public class Purchase {
	
	private final Integer id;	
	private final List<Product> productList;
	private final Integer userId;
	private final String userName;
	private final Float price;
	private final String shipmentAddress;
	private final String shipmentType;
	private final Date deliberyDate;

    private final String paymentMethod;
    private final String paymentStatus;
	private final Date paymentDate;

	private final String status;

	private final String serviceAddress;
	private final Date confirmationDate;
	private final Date modificationDate;
	private final Date cancelationDate;





	



	public Purchase(Integer id, List<Product> productList, Integer userId, String userName, Float price, String shipmentAddress, String shipmentType, Date deliberyDate, String paymentMethod, String paymentStatus, Date paymentDate, String status, String serviceAddress, Date confirmationDate, Date modificationDate, Date cancelationDate) {
		this.id = id;
		this.productList = productList;
		this.userId = userId;
		this.userName = userName;
		this.price = price;
		this.shipmentAddress = shipmentAddress;
		this.shipmentType = shipmentType;
		this.deliberyDate = deliberyDate;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
		this.status = status;
		this.serviceAddress = serviceAddress;
		this.confirmationDate = confirmationDate;
		this.modificationDate = modificationDate;
		this.cancelationDate = cancelationDate;
	}


	public Purchase() {
		super();
		
		this.id = 0;
		this.productList = null;
		this.userId = null;
		this.userName = null;
		this.price = null;
		this.shipmentAddress = null;
		this.shipmentType = null;
		this.deliberyDate = null;
		this.paymentMethod = null;
		this.paymentStatus = null;
		this.paymentDate = null;
		this.status = null;
		this.serviceAddress = null;
		this.confirmationDate = null;
		this.modificationDate = null;
		this.cancelationDate = null;
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


	public String getUserName() {
		return this.userName;
	}


	public String getShipmentType() {
		return this.shipmentType;
	}


	public Date getDeliberyDate() {
		return this.deliberyDate;
	}


	public String getPaymentStatus() {
		return this.paymentStatus;
	}


	public Date getPaymentDate() {
		return this.paymentDate;
	}


	public Date getConfirmationDate() {
		return this.confirmationDate;
	}


	public Date getModificationDate() {
		return this.modificationDate;
	}


	public Date getCancelationDate() {
		return this.cancelationDate;
	}


}
