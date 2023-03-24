package fab.shop.microservices.core.product.persistence;


import java.util.Objects;

import javax.persistence.*;



public abstract class AbstractBusinessEntityItem {
    


    protected String name;

    protected String description;

    protected String remarks;



    public AbstractBusinessEntityItem() {
    }

    public AbstractBusinessEntityItem(String name, String description, String remarks) {
        this.name = name;
        this.description = description;
        this.remarks = remarks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public AbstractBusinessEntityItem name(String name) {
        setName(name);
        return this;
    }

    public AbstractBusinessEntityItem description(String description) {
        setDescription(description);
        return this;
    }

    public AbstractBusinessEntityItem remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AbstractBusinessEntityItem)) {
            return false;
        }
        AbstractBusinessEntityItem abstractBusinessEntityItem = (AbstractBusinessEntityItem) o;
        return Objects.equals(name, abstractBusinessEntityItem.name) && Objects.equals(description, abstractBusinessEntityItem.description) && Objects.equals(remarks, abstractBusinessEntityItem.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, remarks);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", remarks='" + getRemarks() + "'" +
            "}";
    }



}
