package fab.shop.api.core.product.msg;

import java.util.List;

public class GetOfferListDetailRS {

    private Integer shopId;
    private List<OfferAvail> offerList;



    public GetOfferListDetailRS() {
    }

    public GetOfferListDetailRS(Integer shopId, List<OfferAvail> offerList) {
        this.shopId = shopId;
        this.offerList = offerList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public List<OfferAvail> getOfferList() {
        return this.offerList;
    }

    public void setOfferList(List<OfferAvail> offerList) {
        this.offerList = offerList;
    }

    public GetOfferListDetailRS shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public GetOfferListDetailRS offerList(List<OfferAvail> offerList) {
        setOfferList(offerList);
        return this;
    }



    @Override
    public String toString() {
        String offerListString = "{ ";
        for(OfferAvail offerAvail : getOfferList()){
            offerListString += offerAvail.toString();
            offerListString += ", ";
        }
        offerListString += " }";
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", offerList='" + offerListString + "'" +
            "}";
    }



    
    
}
