package fab.shop.microservices.core.purchase.persistence;



import javax.persistence.*;



@Entity
@Table(name="deliveries")
public class DeliveryDetailEntity {

    @Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;


    
}
