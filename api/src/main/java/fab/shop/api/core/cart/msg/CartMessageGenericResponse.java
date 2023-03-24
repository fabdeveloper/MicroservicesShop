package fab.shop.api.core.cart.msg;

import java.util.Objects;

import fab.shop.api.core.cart.Cart;

public abstract class CartMessageGenericResponse {
    
    private Cart cart;
    private String status;

    

    public CartMessageGenericResponse() {
    }

    public CartMessageGenericResponse(Cart cart, String status) {
        this.cart = cart;
        this.status = status;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CartMessageGenericResponse cart(Cart cart) {
        setCart(cart);
        return this;
    }

    public CartMessageGenericResponse status(String status) {
        setStatus(status);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CartMessageGenericResponse)) {
            return false;
        }
        CartMessageGenericResponse cartMessageGenericResponse = (CartMessageGenericResponse) o;
        return Objects.equals(cart, cartMessageGenericResponse.cart) && Objects.equals(status, cartMessageGenericResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cart, status);
    }

    @Override
    public String toString() {
        return "{" +
            " cart='" + getCart().toString() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }


    
}
