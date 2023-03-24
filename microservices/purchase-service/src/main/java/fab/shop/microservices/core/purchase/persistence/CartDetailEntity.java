package fab.shop.microservices.core.purchase.persistence;



import java.util.List;
import java.util.Objects;

import javax.persistence.*;




@Entity
@Table(name="carts")
public class CartDetailEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;


    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType. EAGER)
    private List<CartItemEntity> itemsList;
    private Float valuation;

    private Integer productBookingNumber;
    


    public CartDetailEntity() {
    }

    public CartDetailEntity(Integer id, Integer version, List<CartItemEntity> itemsList, Float valuation, Integer productBookingNumber) {
        this.id = id;
        this.version = version;
        this.itemsList = itemsList;
        this.valuation = valuation;
        this.productBookingNumber = productBookingNumber;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<CartItemEntity> getItemsList() {
        return this.itemsList;
    }

    public void setItemsList(List<CartItemEntity> itemsList) {
        this.itemsList = itemsList;
    }

    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }

    public Integer getProductBookingNumber() {
        return this.productBookingNumber;
    }

    public void setProductBookingNumber(Integer productBookingNumber) {
        this.productBookingNumber = productBookingNumber;
    }

    public CartDetailEntity id(Integer id) {
        setId(id);
        return this;
    }

    public CartDetailEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public CartDetailEntity itemsList(List<CartItemEntity> itemsList) {
        setItemsList(itemsList);
        return this;
    }

    public CartDetailEntity valuation(Float valuation) {
        setValuation(valuation);
        return this;
    }

    public CartDetailEntity productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CartDetailEntity)) {
            return false;
        }
        CartDetailEntity cartDetailEntity = (CartDetailEntity) o;
        return Objects.equals(id, cartDetailEntity.id) && Objects.equals(version, cartDetailEntity.version) && Objects.equals(itemsList, cartDetailEntity.itemsList) && Objects.equals(valuation, cartDetailEntity.valuation) && Objects.equals(productBookingNumber, cartDetailEntity.productBookingNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, itemsList, valuation, productBookingNumber);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", itemsList='" + getItemsList() + "'" +
            ", valuation='" + getValuation() + "'" +
            ", productBookingNumber='" + getProductBookingNumber() + "'" +
            "}";
    }

    
    
}
