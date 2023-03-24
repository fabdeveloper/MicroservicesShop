package fab.shop.microservices.core.product.persistence;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface OfferRepository  extends CrudRepository<OfferEntity, Integer> {
    
    @Transactional
    public Optional<OfferEntity> findById(Integer offerId);



    @Transactional
    @Query("select x from OfferEntity x where x.article.id = :articleId")
    public List<OfferEntity> findByArticleId(@Param("articleId") Integer articleId);

    
    @Transactional
    @Query("select x from OfferEntity x where x.id = :offerId and x.article.product.shop.id = :shopId")
    public OfferEntity findByOfferIdAndShopId(@Param("offerId") Integer offerId, @Param("shopId") Integer shopId);

}
