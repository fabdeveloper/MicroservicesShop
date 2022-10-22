package fab.shop.microservices.core.product.persistence;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface TaxRepository extends CrudRepository<TaxEntity, Integer> {
    
    @Transactional
    public Optional<TaxEntity> findById(Integer taxId);
    
}
