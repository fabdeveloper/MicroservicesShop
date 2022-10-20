package fab.shop.api.core.product;

import java.util.List;

public class Shop extends AbstractBusinessItem {

    private Integer ownerId;
    private List<Integer> adminListIds;

    public Shop() {
        super();
    }

    public Shop(int id, String name, String description, String remarks,
                        Integer ownerId, List<Integer> adminListIds) {
        super(id, name, description, remarks);
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

    public Shop ownerId(Integer ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    public Shop adminListIds(List<Integer> adminListIds) {
        setAdminListIds(adminListIds);
        return this;
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
