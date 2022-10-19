package fab.shop.microservices.core.product.persistence;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name="SHOPS")
public class ShopEntity extends AbstractBusinessEntityItem {        

    private Integer ownerId;
    private List<Integer> adminListIds;
    


    public ShopEntity() {
        super();
    }


    public ShopEntity(Integer id, Integer version, String name, String description, String remarks, Integer ownerId, List<Integer> adminListIds) {
        super(ownerId, version, name, description, remarks);
        this.ownerId = ownerId;
        this.adminListIds = adminListIds;
    }


    public Integer getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public List<Integer> getAdminListIds() {
        return this.adminListIds;
    }

    public void setAdminListIds(List<Integer> adminListIds) {
        this.adminListIds = adminListIds;
    }


    @Override
    public String toString() {
        String anterior = super.toString();
        return anterior + ", {" +
            " ownerId='" + getOwnerId() + "'" +
            ", adminListIds='" + getAdminListIds() + "'" +
            "}";
    }




}
