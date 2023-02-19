package fab.shop.api.core.product.transfer;

import java.util.*;

public class OfferDetail {
 
    protected Integer offerId;
    protected String offerName;
    protected String offerDescription;
    protected Float offerUnitPrice;
    protected Integer count;

    protected List<Discount> discountList;
    protected List<Tax> taxList;


    public OfferDetail() {
    }

    public OfferDetail(Integer offerId, String offerName, String offerDescription, Float offerUnitPrice, Integer count, List<Discount> discountList, List<Tax> taxList) {
        this.offerId = offerId;
        this.offerName = offerName;
        this.offerDescription = offerDescription;
        this.offerUnitPrice = offerUnitPrice;
        this.count = count;
        this.discountList = discountList;
        this.taxList = taxList;
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

    public List<Discount> getDiscountList() {
        return this.discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public List<Tax> getTaxList() {
        return this.taxList;
    }

    public void setTaxList(List<Tax> taxList) {
        this.taxList = taxList;
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

    public OfferDetail discountList(List<Discount> discountList) {
        setDiscountList(discountList);
        return this;
    }

    public OfferDetail taxList(List<Tax> taxList) {
        setTaxList(taxList);
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
        return Objects.equals(offerId, offerDetail.offerId) && Objects.equals(offerName, offerDetail.offerName) && Objects.equals(offerDescription, offerDetail.offerDescription) && Objects.equals(offerUnitPrice, offerDetail.offerUnitPrice) && Objects.equals(count, offerDetail.count) && Objects.equals(discountList, offerDetail.discountList) && Objects.equals(taxList, offerDetail.taxList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, offerName, offerDescription, offerUnitPrice, count, discountList, taxList);
    }

    @Override
    public String toString() {
        return "{" +
            " offerId='" + getOfferId() + "'" +
            ", offerName='" + getOfferName() + "'" +
            ", offerDescription='" + getOfferDescription() + "'" +
            ", offerUnitPrice='" + getOfferUnitPrice() + "'" +
            ", count='" + getCount() + "'" +
            ", discountList='" + getDiscountList() + "'" +
            ", taxList='" + getTaxList() + "'" +
            "}";
    }


    
}
