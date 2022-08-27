package fab.shop.microservices.core.cart.persistence;

import java.util.List;
import javax.persistence.*;

import fab.shop.api.core.product.Offer;

@Entity
@Table(name = "carts", indexes = { @Index(name = "index_unique_user_shop", unique = true, columnList = "userId, shopId")})
public class CartEntity {

	@Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;

	private List<Offer> productList;
	private String serviceAddress;
	private Integer userId;
	private Integer shopId;
	private Float valuation;
    


	public CartEntity(Integer cartId, Integer version, List<Offer> productList, String serviceAddress, Integer userId, Integer shopId, Float valuation) {
		this.cartId = cartId;
		this.version = version;
		this.productList = productList;
		this.serviceAddress = serviceAddress;
		this.userId = userId;
		this.shopId = shopId;
		this.valuation = valuation;
	}


	public CartEntity() {
	}


	@Override
	public String toString() {
		return "{" +
			" cartId='" + getCartId() + "'" +
			", version='" + getVersion() + "'" +
			", productList='" + getProductList() + "'" +
			", serviceAddress='" + getServiceAddress() + "'" +
			", userId='" + getUserId() + "'" +
			", shopId='" + getShopId() + "'" +
			", valuation='" + getValuation() + "'" +
			"}";
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

	public List<Offer> getProductList() {
		return this.productList;
	}

	public void setProductList(List<Offer> productList) {
		this.productList = productList;
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

}
