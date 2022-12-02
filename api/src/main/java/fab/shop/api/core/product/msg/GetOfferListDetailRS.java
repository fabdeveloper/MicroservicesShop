package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.product.Offer;

public class GetOfferListDetailRS {

    private Integer shopId;
    private List<Offer> offerList;
    private String status;



    public GetOfferListDetailRS(Integer shopId, List<Offer> offerList, String status) {
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

    public List<Offer> getOfferList() {
        if(this.offerList == null){
            this.offerList = new ArrayList<Offer>();
        }
        return this.offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addOffer(Offer offer){
        getOfferList().add(offer);
    }


    @Override
    public String toString() {
        String offerListString = "{ ";
        if(getOfferList() != null){
            for(Offer offer : getOfferList()){
                offerListString += offer.toString();
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
