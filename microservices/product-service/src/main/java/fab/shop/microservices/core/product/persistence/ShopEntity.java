package fab.shop.microservices.core.product.persistence;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name="SHOPS")
public class ShopEntity extends AbstractBusinessEntityItem {        

    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;

    private Integer ownerId;


    


    public ShopEntity() {
        super();
    }

    public ShopEntity(Integer id, Integer version, String name, String description, String remarks, Integer ownerId) {
        super(name, description, remarks);
        this.id = id;
        this.version = version;
        this.ownerId = ownerId;
    }


    public ShopEntity(Integer id, Integer version, Integer ownerId) {
        this.id = id;
        this.version = version;
        this.ownerId = ownerId;
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

    public Integer getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public ShopEntity id(Integer id) {
        setId(id);
        return this;
    }

    public ShopEntity version(Integer version) {
        setVersion(version);
        return this;
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
        return Objects.equals(id, shopEntity.id) && Objects.equals(version, shopEntity.version) && Objects.equals(ownerId, shopEntity.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, ownerId);
    }

    @Override
    public String toString() {
        String anterior = super.toString();
        return anterior + ", {" +            
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", ownerId='" + getOwnerId() + "'" +
            "}";
    }


}
