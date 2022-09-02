package fab.shop.api.core.cart;

import fab.shop.api.core.product.Offer;

public class CartItem {
    
    private final Integer item_id;
    private final Cart cart;
    private final Offer offer;
    private final Integer count;



    public CartItem(Integer item_id, Cart cart, Offer offer, Integer count) {
        this.item_id = item_id;
        this.cart = cart;
        this.offer = offer;
        this.count = count;
    }

    public CartItem() {
        this.item_id = null;
        this.cart = null;
        this.offer = null;
        this.count = null;
    }



    public Integer getItem_id() {
        return this.item_id;
    }


    public Cart getCart() {
        return this.cart;
    }


    public Offer getOffer() {
        return this.offer;
    }


    public Integer getCount() {
        return this.count;
    }




}
