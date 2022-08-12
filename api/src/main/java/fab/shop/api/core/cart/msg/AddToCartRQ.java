package fab.shop.api.core.cart.msg;

import fab.shop.api.core.product.Offer;

public class AddToCartRQ {

    private final Offer product;
    private final Integer cartId;
    private final Integer userId;
    private final Integer shopId;




    public AddToCartRQ(Offer product, Integer cartId, Integer userId, Integer shopId) {
        this.product = product;
        this.cartId = cartId;
        this.userId = userId;
        this.shopId = shopId;
    }




    public AddToCartRQ() {
        super();
		
		this.cartId = 0;
		this.product = null;
        this.userId = null;
        this.shopId = null;
    }


    public Offer getProduct() {
        return this.product;
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
            " product='" + getProduct().toString() + "'" +
            ", cartId='" + getCartId() + "'" +
            "}";
    }


    
}
