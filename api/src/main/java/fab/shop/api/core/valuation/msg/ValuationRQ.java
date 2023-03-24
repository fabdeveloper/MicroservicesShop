package fab.shop.api.core.valuation.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.valuation.transfer.ValuableItem;

public class ValuationRQ {

    protected List<ValuableItem> valuableItemsList;



    public ValuationRQ(List<ValuableItem> valuableItemsList) {
        this.valuableItemsList = valuableItemsList;
    }

    public ValuationRQ() {
    }

    public void addValuableItem(ValuableItem item){
        getValuableItemsList().add(item);
    }


    public List<ValuableItem> getValuableItemsList() {
        if(this.valuableItemsList == null){
            this.valuableItemsList = new ArrayList<>();
        }
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
