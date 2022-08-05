package fab.shop.api.core.cart.msg;

import fab.shop.api.core.product.Offer;

public class AddToCartRQ {

    private final Offer product;
    private final Integer cartId;



    public AddToCartRQ(Offer product, Integer cartId) {
        this.product = product;
        this.cartId = cartId;
    }


    public AddToCartRQ() {
        super();
		
		this.cartId = 0;
		this.product = null;
    }


    public Offer getProduct() {
        return this.product;
    }


    public Integer getCartId() {
        return this.cartId;
    }




    @Override
    public String toString() {
        return "{" +
            " product='" + getProduct().toString() + "'" +
            ", cartId='" + getCartId() + "'" +
            "}";
    }


    
}
