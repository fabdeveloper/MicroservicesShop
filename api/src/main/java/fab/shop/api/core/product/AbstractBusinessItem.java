package fab.shop.api.core.product;

public abstract class AbstractBusinessItem {
    protected  int id;
    protected  String name;
    protected  String description;
    protected  String remarks;



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
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
