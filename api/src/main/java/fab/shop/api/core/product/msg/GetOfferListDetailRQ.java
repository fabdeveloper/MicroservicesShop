package fab.shop.api.core.product.msg;

import java.util.List;

public class GetOfferListDetailRQ {
    private Integer shopId;
    private List<Integer> offerList;


    public GetOfferListDetailRQ() {
    }

    public GetOfferListDetailRQ(Integer shopId, List<Integer> offerList) {
        this.shopId = shopId;
        this.offerList = offerList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public List<Integer> getOfferList() {
        return this.offerList;
    }

    public void setOfferList(List<Integer> offerList) {
        this.offerList = offerList;
    }

    public GetOfferListDetailRQ shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public GetOfferListDetailRQ offerList(List<Integer> offerList) {
        setOfferList(offerList);
        return this;
    }



    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", offerList='" + getOfferList().toString() + "'" +
            "}";
    }



}
