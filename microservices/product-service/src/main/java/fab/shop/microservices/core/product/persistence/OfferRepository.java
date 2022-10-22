package fab.shop.microservices.core.product.persistence;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



public interface OfferRepository  extends CrudRepository<OfferEntity, Integer> {
    
    @Transactional
    public Optional<OfferEntity> findById(Integer offerId);

}
