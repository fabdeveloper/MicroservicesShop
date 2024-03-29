package fab.shop.microservices.core.product.persistence;

import java.util.Objects;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import fab.shop.api.core.product.transfer.EnumSign;


@Entity
@Table(name="TAXES")
public class TaxEntity extends AbstractExtraValuableEntityItem {

    
    public TaxEntity() {
        super();
    }

    public TaxEntity(Integer id, Integer version, String name, String description, String remarks,
                        Float percentValue, Float fixedValue) {
        super(id, version, name, description, remarks, percentValue, fixedValue);
    }

    @Override
    protected EnumSign initIncrement() {
        return EnumSign.increment;
    }


    
    
}
