package fab.shop.microservices.core.product.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface ArticleRepository extends CrudRepository<ArticleEntity, Integer> {
    
    @Transactional
    public ArticleEntity findByArticleId(Integer articleId);
    
}
