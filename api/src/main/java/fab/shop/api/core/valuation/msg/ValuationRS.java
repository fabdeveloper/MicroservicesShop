package fab.shop.api.core.valuation.msg;

import java.util.List;

import fab.shop.api.core.product.Offer;

public class ValuationRS {

    private List<Offer> offerList;
    private Float valuation;



    public ValuationRS(List<Offer> offerList, Float valuation) {
        this.offerList = offerList;
        this.valuation = valuation;
    }


    public ValuationRS() {
    }





    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }


    public List<Offer> getOfferList() {
        return this.offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }


    @Override
    public String toString() {
        return "{" +
            " offerList='" + getOfferList() + "'" +
            ", valuation='" + getValuation() + "'" +
            "}";
    }



}
