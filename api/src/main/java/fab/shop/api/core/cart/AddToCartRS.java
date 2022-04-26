package fab.shop.api.core.cart;

public class AddToCartRS {

    private final Cart cart;
    private final String status;


    public AddToCartRS(Cart cart, String status) {
        this.cart = cart;
        this.status = status;
    }


    public AddToCartRS() {

        this.cart = null;
        this.status = null;
    }


    public Cart getCart() {
        return this.cart;
    }


    public String getStatus() {
        return this.status;
    }



    
}
