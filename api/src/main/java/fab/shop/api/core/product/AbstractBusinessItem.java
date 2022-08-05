package fab.shop.api.core.product;

public abstract class AbstractBusinessItem {
    protected final int id;
    protected final String name;
    protected final String description;
    protected final String remarks;



    public AbstractBusinessItem(int id, String name, String description, String remarks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.remarks = remarks;
    }


    public AbstractBusinessItem() {
        this.id = 0;
        this.name = null;
        this.description = null;
        this.remarks = null;
    }


    public int getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


    public String getDescription() {
        return this.description;
    }


    public String getRemarks() {
        return this.remarks;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", remarks='" + getRemarks() + "'" +
            "}";
    }




}
