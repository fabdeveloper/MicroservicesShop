package fab.shop.api.core.product;

public class Discount extends AbstractExtraValuableItem {


    public Discount(Integer id, String name, String description, String remarks, Float percentValue, Float fixedValue, EnumSign increment) {
        super(id, name, description, remarks, percentValue, fixedValue);
    }


    public Discount() {
        super();
    }


    @Override
    protected EnumSign initIncrement() {
        return EnumSign.decrement;
    }


    
}
