package fab.shop.api.core.valuation;

import java.util.List;

public class ValuableItem {
    protected Integer offerId;
    protected Integer shopId;

    protected Float price;
    protected List<Discount> discountList;
    protected List<Tax> taxList;


    public ValuableItem(Integer offerId, Integer shopId, Float price, List<Discount> discountList, List<Tax> taxList) {
        this.offerId = offerId;
        this.shopId = shopId;
        this.price = price;
        this.discountList = discountList;
        this.taxList = taxList;
    }


    public ValuableItem() {
    }


    public Integer getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
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



    @Override
    public String toString() {
        String discounts = "{ ";
        for(Discount discount : getDiscountList()){
            discounts += discount.toString();
            discounts += " ,";
        }
        discounts += " }";
        String taxes = "{ ";
        for(Tax tax : getTaxList()){
            taxes += tax.toString();
            taxes += " ,";
        }
        taxes += " }";
        return "{" +
            " offerId='" + getOfferId() + "'" +
            ", shopId='" + getShopId() + "'" +
            ", price='" + getPrice() + "'" +
            ", discountList='" + discounts + "'" +
            ", taxList='" + taxes + "'" +
            "}";
    }



}
