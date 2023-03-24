package fab.shop.microservices.core.product.persistence;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface ArticleRepository extends CrudRepository<ArticleEntity, Integer> {
    
    @Transactional
    public Optional<ArticleEntity> findById(Integer articleId);

    @Transactional
    @Query("select x from ArticleEntity x where x.product.id = :productId")
    public List<ArticleEntity> findByProductId(@Param("productId") Integer productId);
    
}
