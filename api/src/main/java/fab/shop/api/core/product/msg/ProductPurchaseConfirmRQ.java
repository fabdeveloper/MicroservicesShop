package fab.shop.api.core.product.msg;

import java.util.Date;

public class ProductPurchaseConfirmRQ {
	
	private Integer shopId;
	private Integer userId;
	private Integer productBookingNumber;
	private Date productBookingTime;
	
	
	public ProductPurchaseConfirmRQ() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProductPurchaseConfirmRQ(Integer shopId, Integer userId, Integer productBookingNumber,
			Date productBookingTime) {
		super();
		this.shopId = shopId;
		this.userId = userId;
		this.productBookingNumber = productBookingNumber;
		this.productBookingTime = productBookingTime;
	}


	public Integer getShopId() {
		return shopId;
	}


	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getProductBookingNumber() {
		return productBookingNumber;
	}


	public void setProductBookingNumber(Integer productBookingNumber) {
		this.productBookingNumber = productBookingNumber;
	}


	public Date getProductBookingTime() {
		return productBookingTime;
	}


	public void setProductBookingTime(Date productBookingTime) {
		this.productBookingTime = productBookingTime;
	}


	@Override
	public String toString() {
		return "ProductPurchaseConfirmRQ [shopId=" + shopId + ", userId=" + userId + ", productBookingNumber="
				+ productBookingNumber + ", productBookingTime=" + productBookingTime + "]";
	}
	
	
	
	
	
	

}
