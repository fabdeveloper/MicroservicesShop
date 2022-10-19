package fab.shop.microservices.core.product.persistence;

import javax.persistence.*;


@Entity
@Table(name = "PRODUCTS")
public class ProductEntity extends AbstractBusinessEntityItem {    

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


    @Override
    public String toString() {
        String anterior = super.toString();
        return anterior + ", {" +
            " shop='" + getShop().toString() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }




}
