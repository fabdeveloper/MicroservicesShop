package fab.shop.microservices.core.product.persistence;

import javax.persistence.*;




@Entity
@Table(name = "PRODUCTS")
public class ProductEntity {
    
    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;




}
