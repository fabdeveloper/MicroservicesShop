package fab.shop.microservices.core.product.persistence;

import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class ProductEntity extends BusinessEntity {    

    

    @ManyToOne
    @JoinColumn(name = "shop_id", nullable = false)
    private ShopEntity shop;

    private String type;


    public ProductEntity() {
        super();
    }

    public ProductEntity(Integer id, Integer version, String name, String description, String remarks, ShopEntity shop, String type) {
        super(id, version, name, description, remarks);
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

    public ProductEntity shop(ShopEntity shop) {
        setShop(shop);
        return this;
    }

    public ProductEntity type(String type) {
        setType(type);
        return this;
    }

    
    @Override
    public String toString() {
        String anterior = super.toString();
        String shopString = (getShop() != null ? getShop().toString() : "null");

        return "{ " + anterior +
            ", shop='" + shopString + "'" +
            ", type='" + getType() + "'" +
            " }";
    }


    

}
