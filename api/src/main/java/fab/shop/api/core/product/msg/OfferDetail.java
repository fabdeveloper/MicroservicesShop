package fab.shop.api.core.product.msg;

import java.util.*;

public class OfferDetail {
    protected Integer offerId;
    protected String offerName;
    protected String offerDescription;
    protected Float offerUnitPrice;
    protected Integer count;



    public OfferDetail() {
    }

    public OfferDetail(Integer offerId, String offerName, String offerDescription, Float offerUnitPrice, Integer count) {
        this.offerId = offerId;
        this.offerName = offerName;
        this.offerDescription = offerDescription;
        this.offerUnitPrice = offerUnitPrice;
        this.count = count;
    }

    public Integer getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return this.offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferDescription() {
        return this.offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public Float getOfferUnitPrice() {
        return this.offerUnitPrice;
    }

    public void setOfferUnitPrice(Float offerUnitPrice) {
        this.offerUnitPrice = offerUnitPrice;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public OfferDetail offerId(Integer offerId) {
        setOfferId(offerId);
        return this;
    }

    public OfferDetail offerName(String offerName) {
        setOfferName(offerName);
        return this;
    }

    public OfferDetail offerDescription(String offerDescription) {
        setOfferDescription(offerDescription);
        return this;
    }

    public OfferDetail offerUnitPrice(Float offerUnitPrice) {
        setOfferUnitPrice(offerUnitPrice);
        return this;
    }

    public OfferDetail count(Integer count) {
        setCount(count);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OfferDetail)) {
            return false;
        }
        OfferDetail offerDetail = (OfferDetail) o;
        return Objects.equals(offerId, offerDetail.offerId) && Objects.equals(offerName, offerDetail.offerName) && Objects.equals(offerDescription, offerDetail.offerDescription) && Objects.equals(offerUnitPrice, offerDetail.offerUnitPrice) && Objects.equals(count, offerDetail.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, offerName, offerDescription, offerUnitPrice, count);
    }

    @Override
    public String toString() {
        return "{" +
            " offerId='" + getOfferId() + "'" +
            ", offerName='" + getOfferName() + "'" +
            ", offerDescription='" + getOfferDescription() + "'" +
            ", offerUnitPrice='" + getOfferUnitPrice() + "'" +
            ", count='" + getCount() + "'" +
            "}";
    }

}
