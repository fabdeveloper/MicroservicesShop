package fab.shop.microservices.core.cart.helper;

import fab.shop.api.core.cart.Cart;

public interface PersistenceHelper {

    public Cart findCart(Integer cartId, Integer userId, Integer shopId);

    public Cart persistCart(Cart cart);

    Boolean deleteCartFromDBById(Integer cartId);

    
    
}
