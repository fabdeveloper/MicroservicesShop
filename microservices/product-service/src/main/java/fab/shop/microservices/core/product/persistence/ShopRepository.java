package fab.shop.microservices.core.product.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface ShopRepository extends CrudRepository<ShopEntity, Integer> {
    
    @Transactional
    public ShopEntity findByShopId(Integer shopId);
    
}
