package fab.shop.microservices.core.product.persistence;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface ArticleRepository extends CrudRepository<ArticleEntity, Integer> {
    
    @Transactional
    public Optional<ArticleEntity> findById(Integer articleId);
    
}
