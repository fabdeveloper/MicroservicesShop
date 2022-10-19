package fab.shop.microservices.core.product.persistence;


import java.util.Objects;

import javax.persistence.*;



public abstract class AbstractBusinessEntityItem {
    
    @Id @GeneratedValue
    protected Integer id;

    @Version
    protected Integer version;

    protected String name;

    protected String description;

    protected String remarks;



    public AbstractBusinessEntityItem() {
    }

    public AbstractBusinessEntityItem(Integer id, Integer version, String name, String description, String remarks) {
        this.id = id;
        this.version = version;
        this.name = name;
        this.description = description;
        this.remarks = remarks;
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

    public AbstractBusinessEntityItem id(Integer id) {
        setId(id);
        return this;
    }

    public AbstractBusinessEntityItem version(Integer version) {
        setVersion(version);
        return this;
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
        return Objects.equals(id, abstractBusinessEntityItem.id) && Objects.equals(version, abstractBusinessEntityItem.version) && Objects.equals(name, abstractBusinessEntityItem.name) && Objects.equals(description, abstractBusinessEntityItem.description) && Objects.equals(remarks, abstractBusinessEntityItem.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, name, description, remarks);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", remarks='" + getRemarks() + "'" +
            "}";
    }

}
