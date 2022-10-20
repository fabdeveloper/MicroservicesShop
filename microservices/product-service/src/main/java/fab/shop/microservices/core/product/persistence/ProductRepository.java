package fab.shop.microservices.core.product.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
    
    @Transactional
    public ProductEntity findByProductId(Integer productId);
}
