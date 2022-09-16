package fab.shop.microservices.core.cart.helper;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartItem;
// import fab.shop.api.core.product.Offer;

@Component
public class PersistenceHelperImpl implements PersistenceHelper{
    
    private Cart cartMock = null;


    public Cart getCartMock() {
        return this.cartMock;
    }

    public void setCartMock(Cart cartMock) {
        this.cartMock = cartMock;
    }


    @Override
    public Cart findCart(Integer cartId, Integer userId, Integer shopId){
        Cart cart = null;
        String serviceAddress= null;

        //cart = cartRepository.findById(cartId);

        if(getCartMock() != null && cartId == getCartMock().getCartId()){ // ENCONTRADO 
            cart = getCartMock();

        } else{ 
            Float valuation = 0.0f;
            cart = new Cart(cartId, new ArrayList<CartItem>(), serviceAddress, userId, shopId, valuation);            
        }
        return cart;
    }

    @Override
    public Cart persistCart(Cart cart){

        setCartMock(cart);

        return cart;
    }
    
    @Override
    public void deleteCartFromDBById(Integer cartId){
        if(cartId != null && getCartMock() != null && cartId.compareTo(getCartMock().getCartId()) == 0){
            setCartMock(null);
        }
    }

    @Override
    public Cart mergeCart(Cart cart) {
        // TODO Auto-generated method stub
        return null;
    }

}
