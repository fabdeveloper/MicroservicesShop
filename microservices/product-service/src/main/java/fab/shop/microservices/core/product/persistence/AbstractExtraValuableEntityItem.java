package fab.shop.microservices.core.product.persistence;

import java.util.Objects;

import fab.shop.api.core.product.EnumSign;

public abstract class AbstractExtraValuableEntityItem extends AbstractBusinessEntityItem {

    protected Float percentValue;
    protected Float fixedValue;

    private final EnumSign increment = initIncrement();


    public AbstractExtraValuableEntityItem() {
        super();
    }

    public AbstractExtraValuableEntityItem(String name, String description, String remarks,
                Float percentValue, Float fixedValue) {
        super(name, description, remarks);
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


    public AbstractExtraValuableEntityItem percentValue(Float percentValue) {
        setPercentValue(percentValue);
        return this;
    }

    public AbstractExtraValuableEntityItem fixedValue(Float fixedValue) {
        setFixedValue(fixedValue);
        return this;
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
