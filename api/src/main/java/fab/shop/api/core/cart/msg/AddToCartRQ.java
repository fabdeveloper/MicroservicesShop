package fab.shop.api.core.cart.msg;

import fab.shop.api.core.product.Offer;

public class AddToCartRQ {

    private Offer offer;
    private Integer cartId;
    private Integer userId;
    private Integer shopId;




    public AddToCartRQ(Offer offer, Integer cartId, Integer userId, Integer shopId) {
        this.offer = offer;
        this.cartId = cartId;
        this.userId = userId;
        this.shopId = shopId;
    }




    public AddToCartRQ() {
        super();
		
		this.cartId = 0;
		this.offer = null;
        this.userId = null;
        this.shopId = null;
    }



    public Offer getOffer() {
        return this.offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }



    public Integer getCartId() {
        return this.cartId;
    }


    public Integer getUserId() {
        return this.userId;
    }


    public Integer getShopId() {
        return this.shopId;
    }



    @Override
    public String toString() {
        return "{" +
            " offer='" + getOffer() + "'" +
            ", cartId='" + getCartId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", shopId='" + getShopId() + "'" +
            "}";
    }




    
}
