package fab.shop.api.core.cart;

import fab.shop.api.core.product.Product;

public class AddToCartRQ {

    private final Product product;
    private final Integer cartId;



    public AddToCartRQ(Product product, Integer cartId) {
        this.product = product;
        this.cartId = cartId;
    }


    public AddToCartRQ() {
        super();
		
		this.cartId = 0;
		this.product = null;
    }


    public Product getProduct() {
        return this.product;
    }


    public Integer getCartId() {
        return this.cartId;
    }


    
}
