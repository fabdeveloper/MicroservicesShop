package fab.shop.api.core.product;

public class Tax extends AbstractExtraValuableItem {


    public Tax(Integer id, String name, String description, String remarks, Float percentValue, Float fixedValue) {
        super(id, name, description, remarks, percentValue, fixedValue);
    }


    public Tax() {
        super();
    }


    @Override
    protected EnumSign initIncrement() {
        return EnumSign.increment;
    }

}
