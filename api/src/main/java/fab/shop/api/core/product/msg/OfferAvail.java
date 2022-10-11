package fab.shop.api.core.product.msg;

import fab.shop.api.core.product.Offer;

public class OfferAvail {
    private Offer offer;
    private Integer count;


    public OfferAvail() {
    }

    public OfferAvail(Offer offer, Integer count) {
        this.offer = offer;
        this.count = count;
    }

    public Offer getOffer() {
        return this.offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public OfferAvail offer(Offer offer) {
        setOffer(offer);
        return this;
    }

    public OfferAvail count(Integer count) {
        setCount(count);
        return this;
    }



    @Override
    public String toString() {
        return "{" +
            " offer='" + getOffer().toString() + "'" +
            ", count='" + getCount() + "'" +
            "}";
    }
    
}
