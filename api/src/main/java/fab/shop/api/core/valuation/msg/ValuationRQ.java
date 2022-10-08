package fab.shop.api.core.valuation.msg;

import java.util.List;

import fab.shop.api.core.valuation.ValuableItem;

public class ValuationRQ {

    protected List<ValuableItem> valuableItemsList = null;



    public ValuationRQ(List<ValuableItem> valuableItemsList) {
        this.valuableItemsList = valuableItemsList;
    }

    public ValuationRQ() {
    }


    public List<ValuableItem> getValuableItemsList() {
        return this.valuableItemsList;
    }

    public void setValuableItemsList(List<ValuableItem> valuableItemsList) {
        this.valuableItemsList = valuableItemsList;
    }


    @Override
    public String toString() {
        String valuableItemsListString = "{ ";
        for(ValuableItem item : getValuableItemsList()){
            valuableItemsListString += item.toString();
            valuableItemsListString += ", ";
        }
        valuableItemsListString += " }";

        return "{" +
            " valuableItemsList= " + valuableItemsListString +
            "}";
    }



}
