package fab.shop.microservices.core.cart.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CartRepository extends CrudRepository<CartEntity, Integer> {
    // public interface CartRepository extends JpaRepository<CartEntity, Integer> {


    // @Transactional(readOnly = true)
    public CartEntity findByCartId(Integer cartId);

    @Transactional(readOnly = true)
    @Query("select x from CARTS x where x.userId = :userId and x.shopId = :shopId")
    public CartEntity findByUserIdAndShopId(@Param("userId") Integer userId, @Param("shopId") Integer shopId);


}



