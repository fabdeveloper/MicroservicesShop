package fab.shop.api.core.purchase.msg;

public class GetPurchaseListRQ {
    private Integer userId;
    private Integer shopId;


    public GetPurchaseListRQ() {
    }


    public GetPurchaseListRQ(Integer userId, Integer shopId) {
        this.userId = userId;
        this.shopId = shopId;
    }


    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }


    @Override
    public String toString() {
        return "{" +
            " userId='" + getUserId() + "'" +
            ", shopId='" + getShopId() + "'" +
            "}";
    }


}
