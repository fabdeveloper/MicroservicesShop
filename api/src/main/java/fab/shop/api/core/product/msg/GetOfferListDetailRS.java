package fab.shop.api.core.product.msg;

import java.util.List;

public class GetOfferListDetailRS {

    private Integer shopId;
    private List<OfferAvail> offerList;
    private String status;



    public GetOfferListDetailRS(Integer shopId, List<OfferAvail> offerList, String status) {
        this.shopId = shopId;
        this.offerList = offerList;
        this.status = status;
    }



    public GetOfferListDetailRS() {
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        String offerListString = "{ ";
        if(getOfferList() != null){
            for(OfferAvail offerAvail : getOfferList()){
                offerListString += offerAvail.toString();
                offerListString += ", ";
            }
        }
        offerListString += " }";
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", offerList='" + offerListString + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }



    
    
}
