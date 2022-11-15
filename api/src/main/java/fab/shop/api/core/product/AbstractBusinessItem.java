package fab.shop.api.core.product;

public abstract class AbstractBusinessItem {
    protected  Integer id;
    protected  String name;
    protected  String description;
    protected  String remarks;



    public AbstractBusinessItem(Integer id, String name, String description, String remarks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.remarks = remarks;
    }


    public AbstractBusinessItem() {
        // this.id = 0;
        // this.name = null;
        // this.description = null;
        // this.remarks = null;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        String idString = (getId() != null ? getId().toString() : "null");
        return "{" +
            " id='" + idString + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", remarks='" + getRemarks() + "'" +
            "}";
    }




}
