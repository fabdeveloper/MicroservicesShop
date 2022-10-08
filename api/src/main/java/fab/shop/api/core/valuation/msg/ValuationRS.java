package fab.shop.api.core.valuation.msg;

import java.util.List;

import fab.shop.api.core.valuation.ValuatedItem;

public class ValuationRS {

    private List<ValuatedItem> valuatedItemsList;
    private Float totalValuation;



    public ValuationRS(List<ValuatedItem> valuatedItemsList, Float totalValuation) {
        this.valuatedItemsList = valuatedItemsList;
        this.totalValuation = totalValuation;
    }


    public ValuationRS() {
    }



    public List<ValuatedItem> getValuatedItemsList() {
        return this.valuatedItemsList;
    }

    public void setValuatedItemsList(List<ValuatedItem> valuatedItemsList) {
        this.valuatedItemsList = valuatedItemsList;
    }

    public Float getTotalValuation() {
        return this.totalValuation;
    }

    public void setTotalValuation(Float totalValuation) {
        this.totalValuation = totalValuation;
    }


    @Override
    public String toString() {
        String valuatedItemsListString = "{ ";
        for(ValuatedItem item : getValuatedItemsList()){
            valuatedItemsListString += item.toString();
            valuatedItemsListString += ", ";
        }
        valuatedItemsListString += " }";
        
        return "{" +
            " valuatedItemsList='" + valuatedItemsListString + "'" +
            ", totalValuation='" + getTotalValuation() + "'" +
            "}";
    }



}
