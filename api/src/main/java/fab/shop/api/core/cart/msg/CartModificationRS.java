package fab.shop.api.core.cart.msg;

import java.util.List;

import fab.shop.api.core.product.Offer;

public class CartModificationRS {
    
    private Integer cartId;
    private List<Offer> offersList;
    private Float valuation;
    private Integer userId;
    private Integer shopId;



    public CartModificationRS(Integer cartId, List<Offer> offersList, Float valuation, Integer userId, Integer shopId) {
        this.cartId = cartId;
        this.offersList = offersList;
        this.valuation = valuation;
        this.userId = userId;
        this.shopId = shopId;
    }


    public CartModificationRS() {
    }



    @Override
    public String toString() {
        return "{" +
            " cartId='" + getCartId() + "'" +
            ", offersList='" + getOffersList() + "'" +
            ", valuation='" + getValuation() + "'" +
            ", userId='" + getUserId() + "'" +
            ", shopId='" + getShopId() + "'" +
            "}";
    }


    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }


    public List<Offer> getOffersList() {
        return this.offersList;
    }

    public void setOffersList(List<Offer> offersList) {
        this.offersList = offersList;
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
    

    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }
    

}
