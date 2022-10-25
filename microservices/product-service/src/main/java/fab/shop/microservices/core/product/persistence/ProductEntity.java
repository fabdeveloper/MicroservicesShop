package fab.shop.microservices.core.product.persistence;

import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class ProductEntity extends AbstractBusinessEntityItem {    

    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "shop_id", nullable = false)
    private ShopEntity shop;

    private String type;



    public ProductEntity() {
        super();
    }


    public ProductEntity(Integer id, Integer version, String name, String description, String remarks, ShopEntity shop, String type) {
        super(name, description, remarks);
        this.id = id;
        this.version = version;
        this.shop = shop;
        this.type = type;
    }
    

    public ShopEntity getShop() {
        return this.shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

    public ProductEntity id(Integer id) {
        setId(id);
        return this;
    }

    public ProductEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public ProductEntity shop(ShopEntity shop) {
        setShop(shop);
        return this;
    }

    public ProductEntity type(String type) {
        setType(type);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductEntity)) {
            return false;
        }
        ProductEntity productEntity = (ProductEntity) o;
        return Objects.equals(id, productEntity.id) && Objects.equals(version, productEntity.version) && Objects.equals(shop, productEntity.shop) && Objects.equals(type, productEntity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, shop, type);
    }

    @Override
    public String toString() {
        String anterior = super.toString();

        return anterior + ", {" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", shop='" + getShop() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }


}
