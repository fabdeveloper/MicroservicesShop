package fab.shop.microservices.core.cart.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CartRepository extends CrudRepository<CartEntity, Integer> {

    @Transactional(readOnly = true)
    public CartEntity findByCartId(Integer cartId);
}
