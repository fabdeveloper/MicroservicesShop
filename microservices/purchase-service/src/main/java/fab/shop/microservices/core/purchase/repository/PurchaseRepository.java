package fab.shop.microservices.core.purchase.repository;

import fab.shop.api.core.purchase.transfer.Purchase;
import fab.shop.microservices.core.purchase.persistence.PurchaseEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;





public interface PurchaseRepository extends CrudRepository<PurchaseEntity, Integer> {


    // @Transactional
    public Optional<PurchaseEntity> findById(Integer purchaseId);



    @Query("select x from PurchaseEntity x where x.user.id = :userId and x.shopId = :shopId")
    public Optional<List<PurchaseEntity>> findByUserIdAndShopId(@Param("userId") Integer userId, @Param("shopId") Integer shopId);


    
}
