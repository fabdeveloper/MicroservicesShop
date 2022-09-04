package fab.shop.api.core.cart;

import fab.shop.api.core.product.Offer;

public class CartItem {
    
    private final Integer id;
    private final Integer cart_id;
    private final Integer offer_id;
    private final Integer count;







    public CartItem(Integer id, Integer cart_id, Integer offer_id, Integer count) {
        this.id = id;
        this.cart_id = cart_id;
        this.offer_id = offer_id;
        this.count = count;
    }


    

    public CartItem() {
        this.id = null;
        this.cart_id = null;
        this.offer_id = null;
        this.count = null;
    }



    public Integer getId() {
        return this.id;
    }




    public Integer getCart_id() {
        return this.cart_id;
    }

    


    public Integer getOffer_id() {
        return this.offer_id;
    }

    


    public Integer getCount() {
        return this.count;
    }



    @Override
    public String toString() {
        return "CartItem= {" +
            " id='" + getId() + "'" +
            ", cart_id='" + getCart_id() + "'" +
            ", offer_id='" + getOffer_id() + "'" +
            ", count='" + getCount() + "'" +
            "}";
    }





}
