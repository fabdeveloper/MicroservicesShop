package fab.shop.microservices.core.cart.persistence;

import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartEntity, Integer> {
    public CartEntity findByCartId(Integer cartId);
}
