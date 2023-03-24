package fab.shop.microservices.core.product.persistence;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name="SHOPS")
public class ShopEntity extends BusinessEntity {        

    
    private Integer ownerId;



    public ShopEntity() {
    }

    public ShopEntity(Integer id, Integer version, String name, String description, String remarks, Integer ownerId) {
        super(id, version, name, description, remarks);

        this.ownerId = ownerId;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public ShopEntity ownerId(Integer ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ShopEntity)) {
            return false;
        }
        ShopEntity shopEntity = (ShopEntity) o;
        return Objects.equals(ownerId, shopEntity.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ownerId);
    }

    @Override
    public String toString() {
        String anterior = super.toString();
        return "{ " + anterior +
            ", ownerId='" + getOwnerId() + "'" +
            " }";
    }

    

}
