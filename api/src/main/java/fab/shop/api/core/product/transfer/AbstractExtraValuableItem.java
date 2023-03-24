package fab.shop.api.core.product.transfer;

public abstract class AbstractExtraValuableItem extends AbstractBusinessItem{

    protected Float percentValue;
    protected Float fixedValue;

    private final EnumSign increment;

    
    public AbstractExtraValuableItem(Integer id, String name, String description, String remarks, Float percentValue, Float fixedValue) {
        super(id, name, description, remarks);
        this.percentValue = percentValue;
        this.fixedValue = fixedValue;
        this.increment = initIncrement();
    }


    public AbstractExtraValuableItem() {
        super();
        this.increment = initIncrement();
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
        return anterior + "{" +
            " percentValue='" + getPercentValue() + "'" +
            ", fixedValue='" + getFixedValue() + "'" +
            ", increment='" + getIncrement() + "'" +
            "}";
    }


    
}
