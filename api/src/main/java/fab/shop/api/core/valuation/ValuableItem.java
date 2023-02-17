package fab.shop.api.core.valuation;

import java.util.*;

import fab.shop.api.core.product.transfer.Discount;
import fab.shop.api.core.product.transfer.Tax;

public class ValuableItem {
    protected Integer offerId;
    protected Integer shopId;

    protected Float unitPrice;
    protected Integer units;

    protected List<Discount> discountList;
    protected List<Tax> taxList;


    public ValuableItem() {
    }

    public ValuableItem(Integer offerId, Integer shopId, Float unitPrice, Integer units, List<Discount> discountList, List<Tax> taxList) {
        this.offerId = offerId;
        this.shopId = shopId;
        this.unitPrice = unitPrice;
        this.units = units;
        this.discountList = discountList;
        this.taxList = taxList;
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

    public Float getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnits() {
        return this.units;
    }

    public void setUnits(Integer units) {
        this.units = units;
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

    public ValuableItem offerId(Integer offerId) {
        setOfferId(offerId);
        return this;
    }

    public ValuableItem shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public ValuableItem unitPrice(Float unitPrice) {
        setUnitPrice(unitPrice);
        return this;
    }

    public ValuableItem units(Integer units) {
        setUnits(units);
        return this;
    }

    public ValuableItem discountList(List<Discount> discountList) {
        setDiscountList(discountList);
        return this;
    }

    public ValuableItem taxList(List<Tax> taxList) {
        setTaxList(taxList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ValuableItem)) {
            return false;
        }
        ValuableItem valuableItem = (ValuableItem) o;
        return Objects.equals(offerId, valuableItem.offerId) && Objects.equals(shopId, valuableItem.shopId) && Objects.equals(unitPrice, valuableItem.unitPrice) && Objects.equals(units, valuableItem.units) && Objects.equals(discountList, valuableItem.discountList) && Objects.equals(taxList, valuableItem.taxList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, shopId, unitPrice, units, discountList, taxList);
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
            ", unitPrice='" + getUnitPrice() + "'" +
            ", units='" + getUnits() + "'" +
            ", discountList='" + discounts + "'" +
            ", taxList='" + taxes + "'" +
            "}";
    }    

}
