package fab.shop.microservices.core.purchase.repository;

import fab.shop.api.core.purchase.transfer.Purchase;
import fab.shop.microservices.core.purchase.persistence.PurchaseEntity;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;




public interface PurchaseRepository extends CrudRepository<PurchaseEntity, Integer> {


    // @Transactional
    public Optional<PurchaseEntity> findById(Integer purchaseId);


    
}
