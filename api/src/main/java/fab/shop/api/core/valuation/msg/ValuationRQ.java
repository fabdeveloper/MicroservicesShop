package fab.shop.api.core.valuation.msg;

import java.util.List;

import fab.shop.api.core.product.Offer;

public class ValuationRQ {

    private List<Offer> offerList = null;

    


    public ValuationRQ(List<Offer> offerList) {
        this.offerList = offerList;
    }


    public ValuationRQ() {
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
            "}";
    }

    

}
