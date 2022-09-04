package fab.shop.microservices.core.cart.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fab.shop.api.core.cart.Cart;
import fab.shop.microservices.core.cart.persistence.CartEntity;
import fab.shop.microservices.core.cart.persistence.CartRepository;
import fab.shop.microservices.core.cart.services.CartMapper;

@Component
public class PersistenceHelperRepositoryImpl implements PersistenceHelper {

    @Autowired
    private CartRepository repository;

    @Autowired
    private CartMapper mapper;
    


    public PersistenceHelperRepositoryImpl(CartRepository repository, CartMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public PersistenceHelperRepositoryImpl() {
    }


    public CartRepository getRepository() {
        return this.repository;
    }

    public void setRepository(CartRepository repository) {
        this.repository = repository;
    }

    public CartMapper getMapper() {
        return this.mapper;
    }

    public void setMapper(CartMapper mapper) {
        this.mapper = mapper;
    }



    @Override
    public Cart findCart(Integer cartId, Integer userId, Integer shopId) {
        Cart cart = null;

        // CartEntity cartEntity = getRepository().findByUserIdAndShopId(userId, shopId);
        // Cart cart = getMapper().entityToApi(cartEntity);

        return cart;
    }

    @Override
    public Cart persistCart(Cart cart) {
        Cart newCart = null;

        CartEntity cartEntity = getMapper().apiToEntity(cart);
        CartEntity persistedCartEntity = getRepository().save(cartEntity);

        newCart = getMapper().entityToApi(persistedCartEntity);
        return newCart;
    }

    @Override
    public void deleteCartFromDBById(Integer cartId) {
        getRepository().deleteById(cartId);
    }
    
}
