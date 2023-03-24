package fab.shop.api.core.product.transfer;

public class Shop extends AbstractBusinessItem {

    private Integer ownerId;


    public Shop() {
        super();
    }

    public Shop(Integer id, String name, String description, String remarks,
                        Integer ownerId) {
        super(id, name, description, remarks);
        this.ownerId = ownerId;
    }



    public Shop(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Shop ownerId(Integer ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    @Override
    public String toString() {
        String anterior = super.toString();
        return "Shop : { " + anterior + ", {" +
                " ownerId='" + getOwnerId() + "'" +
            "}}";
    }



    
}
