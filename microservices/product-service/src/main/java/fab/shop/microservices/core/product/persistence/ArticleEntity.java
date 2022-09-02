package fab.shop.microservices.core.product.persistence;

import javax.persistence.*;


@Entity
@Table(name = "ARTICLES")
public class ArticleEntity {

    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;


    
    
}
