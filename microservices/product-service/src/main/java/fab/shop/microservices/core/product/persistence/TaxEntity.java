package fab.shop.microservices.core.product.persistence;

import fab.shop.api.core.product.EnumSign;

import java.util.Objects;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table(name="TAXES")
public class TaxEntity extends AbstractExtraValuableEntityItem {

    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;


    public TaxEntity() {
        super();
    }

    public TaxEntity(Integer id, Integer version, String name, String description, String remarks,
                        Float percentValue, Float fixedValue) {
        super(name, description, remarks, percentValue, fixedValue);
        this.id = id;
        this.version = version;
    }

    @Override
    protected EnumSign initIncrement() {
        return EnumSign.increment;
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

    public TaxEntity id(Integer id) {
        setId(id);
        return this;
    }

    public TaxEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TaxEntity)) {
            return false;
        }
        TaxEntity taxEntity = (TaxEntity) o;
        return Objects.equals(id, taxEntity.id) && Objects.equals(version, taxEntity.version);
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
