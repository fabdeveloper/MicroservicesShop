package fab.shop.api.core.product.msg;

public class OfferPurchase {
    private Integer offerId;
    private Integer count;
    


    public OfferPurchase(Integer offerId, Integer count) {
        this.offerId = offerId;
        this.count = count;
    }


    public OfferPurchase() {
    }


    public Integer getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }



    @Override
    public String toString() {
        return "{" +
            " offerId='" + getOfferId() + "'" +
            ", count='" + getCount() + "'" +
            "}";
    }

}
