package fab.shop.api.core.product;

public abstract class AbstractExtraValuableItem extends AbstractBusinessItem{

    protected Float percentValue;
    protected Float fixedValue;

    protected EnumSign increment;


    public AbstractExtraValuableItem(int id, String name, String description, String remarks, Float percentValue, Float fixedValue, EnumSign increment) {
        super(id, name, description, remarks);
        this.percentValue = percentValue;
        this.fixedValue = fixedValue;
        this.increment = increment;
    }


    public AbstractExtraValuableItem() {
        super();
    }



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

    public void setIncrement(EnumSign increment) {
        this.increment = increment;
    }


    @Override
    public String toString() {
        String anterior = super.toString();
        return anterior + "{" +
            " percentValue='" + getPercentValue() + "'" +
            ", fixedValue='" + getFixedValue() + "'" +
            ", increment='" + getIncrement() + "'" +
            "}";
    }


    
}
