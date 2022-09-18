package fab.shop.microservices.core.cart.persistence;

import java.util.Date;
import java.util.List;
import javax.persistence.*;



@Entity
@Table(name = "carts", indexes = { @Index(name = "index_unique_user_shop", unique = true, columnList = "userId, shopId")})
public class CartEntity {

	@Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;

	@OneToMany(mappedBy = "cartId")
	private List<CartItemEntity> itemsList;
	
	private String serviceAddress;
	private Integer userId;
	private Integer shopId;
	private Float valuation;
	private Date creationDate;
	private Date modificationDate;
	
    


	public CartEntity(Integer cartId, Integer version, List<CartItemEntity> itemsList, String serviceAddress, Integer userId, Integer shopId, Float valuation, Date creationDate, Date modificationDate) {
		this.cartId = cartId;
		this.version = version;
		this.itemsList = itemsList;
		this.serviceAddress = serviceAddress;
		this.userId = userId;
		this.shopId = shopId;
		this.valuation = valuation;
		this.creationDate = creationDate;
		this.modificationDate = modificationDate;
	}




	public CartEntity() {
	}




	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}



	public List<CartItemEntity> getItemsList() {
		return this.itemsList;
	}

	public void setItemsList(List<CartItemEntity> itemsList) {
		this.itemsList = itemsList;
	}


	public Integer getCartId() {
		return this.cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}



	public String getServiceAddress() {
		return this.serviceAddress;
	}

	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Float getValuation() {
		return this.valuation;
	}

	public void setValuation(Float valuation) {
		this.valuation = valuation;
	}



	@Override
	public String toString() {
		String itemsList = " { ";

		for(CartItemEntity item : getItemsList()){
			itemsList += item.toString() + ", ";
		}
		itemsList += " } ";
		return "{" +
			" cartId='" + getCartId() + "'" +
			", version='" + getVersion() + "'" +
			", itemsList='" + itemsList + "'" +
			", serviceAddress='" + getServiceAddress() + "'" +
			", userId='" + getUserId() + "'" +
			", shopId='" + getShopId() + "'" +
			", valuation='" + getValuation() + "'" +
			", creationDate='" + getCreationDate() + "'" +
			", modificationDate='" + getModificationDate() + "'" +
			"}";
	}


	// @Override
	// public String toString() {

	// 	String itemsList = " { ";

	// 	for(CartItemEntity item : getItemsList()){
	// 		itemsList += item.toString() + ", ";
	// 	}
	// 	itemsList += " } ";
	// 	return "{" +
	// 		" cartId='" + getCartId() + "'" +
	// 		", version='" + getVersion() + "'" +
	// 		", itemsList='" + itemsList + "'" +
	// 		", serviceAddress='" + getServiceAddress() + "'" +
	// 		", userId='" + getUserId() + "'" +
	// 		", shopId='" + getShopId() + "'" +
	// 		", valuation='" + getValuation() + "'" +
	// 		"}";
	// }




}
