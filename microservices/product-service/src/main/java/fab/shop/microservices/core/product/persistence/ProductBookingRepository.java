package fab.shop.microservices.core.product.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface ProductBookingRepository extends CrudRepository<ProductBookingEntity, Integer> {
    
    public Optional<ProductBookingEntity> findById(Integer productBookingId);
    
}
