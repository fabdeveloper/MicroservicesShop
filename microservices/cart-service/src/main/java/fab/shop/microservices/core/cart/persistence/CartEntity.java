package fab.shop.microservices.core.cart.persistence;

import java.util.List;
import javax.persistence.*;



@Entity
@Table(name = "CARTS", indexes = { @Index(name = "index_unique_user_shop", unique = true, columnList = "userId, shopId")})
public class CartEntity {

	@Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;

	@OneToMany(mappedBy = "cart")
	private List<CartItemEntity> itemsList;
	
	private String serviceAddress;
	private Integer userId;
	private Integer shopId;
	private Float valuation;
    





	public CartEntity() {
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

}
