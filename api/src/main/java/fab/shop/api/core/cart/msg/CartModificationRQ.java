package fab.shop.api.core.cart.msg;

import java.util.List;

import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;

public class CartModificationRQ {
    
    private Integer cartId;
    private List<Offer> offerList;
    private Integer userId;
    private Integer shopId;
    private Float valuation;


    public CartModificationRQ(Integer cartId, List<Offer> offerList, Integer userId, Integer shopId, Float valuation) {
        this.cartId = cartId;
        this.offerList = offerList;
        this.userId = userId;
        this.shopId = shopId;
        this.valuation = valuation;
    }

    public CartModificationRQ() {
    }




    @Override
    public String toString() {
        return "{" +
            " cartId='" + getCartId() + "'" +
            ", offerList='" + getOfferList() + "'" +
            ", userId='" + getUserId() + "'" +
            ", shopId='" + getShopId() + "'" +
            ", valuation='" + getValuation() + "'" +
            "}";
    }
    



    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }


    public List<Offer> getOfferList() {
        return this.offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
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
