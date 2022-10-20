package fab.shop.microservices.core.product.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



public interface OfferRepository  extends CrudRepository<ProductEntity, Integer> {
    
    @Transactional
    public OfferEntity findByOfferId(Integer offerId);

}
