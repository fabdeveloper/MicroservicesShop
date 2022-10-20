package fab.shop.microservices.core.product.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface TaxRepository extends CrudRepository<TaxEntity, Integer> {
    
    @Transactional
    public TaxEntity findByTaxId(Integer taxId);
    
}
