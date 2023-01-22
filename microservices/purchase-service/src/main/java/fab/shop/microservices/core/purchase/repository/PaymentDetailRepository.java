package fab.shop.microservices.core.purchase.repository;


import fab.shop.microservices.core.purchase.persistence.*;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface PaymentDetailRepository extends CrudRepository<PaymentDetailEntity, Integer> {
    
    public Optional<PaymentDetailEntity> findById(Integer paymentDetailId );
}
