package fab.shop.microservices.core.cart.helper;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartItem;
import fab.shop.microservices.core.cart.persistence.CartEntity;
import fab.shop.microservices.core.cart.persistence.CartItemEntity;
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
    @Transactional
    public Cart mergeCart(Cart cart){
        Cart newCart = null;

        // List<CartItem> itemsList = cart.getCartItemsList();
        // List<CartItemEntity> itemEntitiesList = this.getItemMapper().apiListToEntityList(itemsList);

        Integer cartId = cart.getCartId();


        CartEntity cartEntity = getRepository().findByCartId(cartId);

        cartEntity.setValuation(cart.getValuation());
        // cartEntity.setItemsList(itemEntitiesList);
        

        CartEntity mergedEntity = getRepository().save(cartEntity);
        newCart = getMapper().entityToApi(mergedEntity);

        return newCart;
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
