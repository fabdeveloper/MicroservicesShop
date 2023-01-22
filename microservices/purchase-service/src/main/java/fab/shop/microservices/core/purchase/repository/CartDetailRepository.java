package fab.shop.microservices.core.purchase.repository;

import fab.shop.microservices.core.purchase.persistence.*;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface CartDetailRepository extends CrudRepository<CartDetailEntity, Integer> {
    
    public Optional<CartDetailEntity> findById(Integer cartDetailId);
}
