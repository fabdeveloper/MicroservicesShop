package fab.shop.microservices.core.product.persistence;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



public interface DiscountRepository extends CrudRepository<DiscountEntity, Integer> {
    
    @Transactional
    public Optional<DiscountEntity> findById(Integer discountId);
}
