package fab.shop.microservices.core.product.persistence;

import java.util.Date;


import javax.persistence.*;


@Entity
@Table(name="offeravail")
public class OfferAvailabilityEntity {
    
    
    @Id @GeneratedValue
    private Integer id;

    @Version
    private Integer version;

    @OneToOne
    private OfferEntity offer;
    
    private Date dateFrom;
    private Date dateTo;
    private Boolean open;
    private Integer stockMax;
    private Integer availCount;



}
