package fab.shop.microservices.core.product.persistence;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface ShopRepository extends CrudRepository<ShopEntity, Integer> {
    
    @Transactional
    public Optional<ShopEntity> findById(Integer shopId);
    
}
