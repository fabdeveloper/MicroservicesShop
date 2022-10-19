package fab.shop.microservices.core.product.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import fab.shop.api.core.product.EnumSign;
import javax.persistence.*;


@Entity
@Table(name="DISCOUNTS")
public class DiscountEntity extends AbstractExtraValuableEntityItem {


    public DiscountEntity() {
        super();
    }

    public DiscountEntity(Integer id, Integer version, String name, String description, String remarks,
                                Float percentValue, Float fixedValue) {
        super(id, version, name, description, remarks, percentValue, fixedValue);
    }
    

    @Override
    protected EnumSign initIncrement() {
        return EnumSign.decrement;
    }
    
}
