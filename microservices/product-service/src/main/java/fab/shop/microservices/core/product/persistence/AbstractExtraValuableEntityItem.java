package fab.shop.microservices.core.product.persistence;

import java.util.Objects;

import javax.persistence.*;

import fab.shop.api.core.product.transfer.EnumSign;



@Entity
public abstract class AbstractExtraValuableEntityItem extends BusinessEntity {

    protected Float percentValue;
    protected Float fixedValue;

    private final EnumSign increment = initIncrement();


    public AbstractExtraValuableEntityItem() {
        super();
    }

    public AbstractExtraValuableEntityItem(Integer id, Integer version, String name, String description, String remarks,
                Float percentValue, Float fixedValue) {
        super(id, version, name, description, remarks);
        this.percentValue = percentValue;
        this.fixedValue = fixedValue;
    }

    protected abstract EnumSign initIncrement();


    public Float getPercentValue() {
        return this.percentValue;
    }

    public void setPercentValue(Float percentValue) {
        this.percentValue = percentValue;
    }

    public Float getFixedValue() {
        return this.fixedValue;
    }

    public void setFixedValue(Float fixedValue) {
        this.fixedValue = fixedValue;
    }

    public EnumSign getIncrement() {
        return this.increment;
    }



    @Override
    public String toString() {
        String anterior = super.toString();
        return anterior + ", {" +
            " percentValue='" + getPercentValue() + "'" +
            ", fixedValue='" + getFixedValue() + "'" +
            ", increment='" + getIncrement() + "'" +
            "}";
    }

    
}
