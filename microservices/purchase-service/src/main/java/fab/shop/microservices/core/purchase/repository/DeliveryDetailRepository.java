package fab.shop.microservices.core.purchase.repository;

import fab.shop.microservices.core.purchase.persistence.*;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface DeliveryDetailRepository extends CrudRepository<DeliveryDetailEntity, Integer> {
    
    public Optional<DeliveryDetailEntity> findById(Integer deliveryDetailId);
}
