package fab.shop.microservices.core.product.persistence;


import java.util.Objects;

import javax.persistence.*;



@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BusinessEntity {
    


    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;
    
    protected String name;

    protected String description;

    protected String remarks;


    public BusinessEntity() {
    }

    public BusinessEntity(Integer id, Integer version, String name, String description, String remarks) {
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

    public BusinessEntity id(Integer id) {
        setId(id);
        return this;
    }

    public BusinessEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public BusinessEntity name(String name) {
        setName(name);
        return this;
    }

    public BusinessEntity description(String description) {
        setDescription(description);
        return this;
    }

    public BusinessEntity remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BusinessEntity)) {
            return false;
        }
        BusinessEntity businessEntity = (BusinessEntity) o;
        return Objects.equals(id, businessEntity.id) && Objects.equals(version, businessEntity.version) && Objects.equals(name, businessEntity.name) && Objects.equals(description, businessEntity.description) && Objects.equals(remarks, businessEntity.remarks);
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
