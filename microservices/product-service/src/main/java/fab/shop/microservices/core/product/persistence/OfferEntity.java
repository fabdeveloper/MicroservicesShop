package fab.shop.microservices.core.product.persistence;

import javax.persistence.*;


@Entity
@Table(name = "OFFERS")
public class OfferEntity {

    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;

    
    
}
