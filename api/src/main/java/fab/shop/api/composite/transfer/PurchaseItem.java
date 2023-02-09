package fab.shop.api.composite.transfer;

public class PurchaseItem {

    private Integer offerId;
    private Integer count;
    


    public PurchaseItem() {
    }

    public PurchaseItem(Integer offerId, Integer count) {
        this.offerId = offerId;
        this.count = count;
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

    public PurchaseItem offerId(Integer offerId) {
        setOfferId(offerId);
        return this;
    }

    public PurchaseItem count(Integer count) {
        setCount(count);
        return this;
    }

    

    @Override
    public String toString() {
        return "{" +
            " offerId='" + getOfferId() + "'" +
            ", count='" + getCount() + "'" +
            "}";
    }

    
}
