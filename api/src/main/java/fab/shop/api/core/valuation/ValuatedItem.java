package fab.shop.api.core.valuation;

import java.util.List;

import fab.shop.api.core.product.transfer.Discount;
import fab.shop.api.core.product.transfer.Tax;
import fab.shop.api.core.valuation.transfer.ValuableItem;

public class ValuatedItem extends ValuableItem {

    protected Float valuation;

    // Integer offerId, Integer shopId, Float unitPrice, Integer units, List<Discount> discountList, List<Tax> taxList
    public ValuatedItem(Integer offerId, Integer shopId, Float price, Integer units, List<Discount> discountList, List<Tax> taxList, Float valuation) {
        super(offerId, shopId, price, units, discountList, taxList);
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
