package fab.shop.microservices.core.product.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import fab.shop.api.core.product.EnumSign;

import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name="DISCOUNTS")
public class DiscountEntity extends AbstractExtraValuableEntityItem {

    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;


    public DiscountEntity() {
        super();
    }

    public DiscountEntity(Integer id, Integer version, String name, String description, String remarks,
                                Float percentValue, Float fixedValue) {
        super(name, description, remarks, percentValue, fixedValue);

        this.id = id;
        this.version = version;
    }
    

    @Override
    protected EnumSign initIncrement() {
        return EnumSign.decrement;
    }


    public DiscountEntity(Integer id, Integer version) {
        this.id = id;
        this.version = version;
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

    public DiscountEntity id(Integer id) {
        setId(id);
        return this;
    }

    public DiscountEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DiscountEntity)) {
            return false;
        }
        DiscountEntity discountEntity = (DiscountEntity) o;
        return Objects.equals(id, discountEntity.id) && Objects.equals(version, discountEntity.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version);
    }

    @Override
    public String toString() {
        String anterior = super.toString();
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            "}, " + anterior;
    }

    
}
