package fab.shop.microservices.core.product.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
    
    @Transactional
    public Optional<ProductEntity> findById(Integer productId);
}
