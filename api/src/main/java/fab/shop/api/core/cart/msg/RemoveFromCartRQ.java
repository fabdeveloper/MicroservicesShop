package fab.shop.api.core.cart.msg;

public class RemoveFromCartRQ {
    
    private Integer cartId;
    private Integer offerId;

    public RemoveFromCartRQ() {
    }

    public RemoveFromCartRQ(Integer cartId, Integer offerId) {
        this.cartId = cartId;
        this.offerId = offerId;
    }

    

    

    @Override
    public String toString() {
        return "{" +
            " cartId='" + getCartId() + "'" +
            ", offerId='" + getOfferId() + "'" +
            "}";
    }



    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }


    public Integer getOfferId() {
        return this.offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }


}
