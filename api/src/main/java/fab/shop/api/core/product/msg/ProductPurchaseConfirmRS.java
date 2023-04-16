package fab.shop.api.core.product.msg;

import java.util.Date;
import java.util.List;

public class ProductPurchaseConfirmRS {

    private Integer shopId;
    private Integer userId;
    private Boolean bConfirmed;
    private Integer productBookingNumber;
    private Date productBookingTime;
    private List<String> errorList;
    
	public ProductPurchaseConfirmRS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductPurchaseConfirmRS(Integer shopId, Integer userId, Boolean bConfirmed, Integer productBookingNumber,
			Date productBookingTime, List<String> errorList) {
		super();
		this.shopId = shopId;
		this.userId = userId;
		this.bConfirmed = bConfirmed;
		this.productBookingNumber = productBookingNumber;
		this.productBookingTime = productBookingTime;
		this.errorList = errorList;
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

	public Boolean getbConfirmed() {
		return bConfirmed;
	}

	public void setbConfirmed(Boolean bConfirmed) {
		this.bConfirmed = bConfirmed;
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

	public List<String> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}

	@Override
	public String toString() {
		return "ProductPurchaseConfirmRS [shopId=" + shopId + ", userId=" + userId + ", bConfirmed=" + bConfirmed
				+ ", productBookingNumber=" + productBookingNumber + ", productBookingTime=" + productBookingTime
				+ ", errorList=" + errorList + "]";
	}   
	
	
    
    


}
