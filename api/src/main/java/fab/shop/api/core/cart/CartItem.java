package fab.shop.api.core.cart;

import fab.shop.api.core.product.Offer;

public class CartItem {
    
    private Integer id;
    private Integer cartId;
    private Integer offerId;
    private Integer count;






    public CartItem(Integer id, Integer cartId, Integer offerId, Integer count) {
        this.id = id;
        this.cartId = cartId;
        this.offerId = offerId;
        this.count = count;
    }




    

    public CartItem() {
        // this.id = null;
        // this.cartId = null;
        // this.offerId = null;
        // this.count = null;
    }



    public Integer getId() {
        return this.id;
    }


    public Integer getCartId() {
        return this.cartId;
    }


    public Integer getOfferId() {
        return this.offerId;
    }


    public Integer getCount() {
        return this.count;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }
    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }
    public void setCount(Integer count) {
        this.count = count;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cartId='" + getCartId() + "'" +
            ", offerId='" + getOfferId() + "'" +
            ", count='" + getCount() + "'" +
            "}";
    }




}
