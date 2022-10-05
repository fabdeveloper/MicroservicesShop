package fab.shop.api.core.valuation;

public class ValuatedItem extends ValuableItem {

    protected Float valuation;


    public ValuatedItem(Integer offerId, Integer shopId, Float price, List<Discount> discountList, List<Tax> taxList, Float valuation) {
        super(offerId, shopId, price, discountList, taxList);
        this.valuation = valuation;
    }


    public ValuatedItem() {
        super();
    }


    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }



    @Override
    public String toString() {
        String anterior = super.toString();
        return anterior + "{" +
            " valuation='" + getValuation() + "'" +
            "}";
    }



    
}
