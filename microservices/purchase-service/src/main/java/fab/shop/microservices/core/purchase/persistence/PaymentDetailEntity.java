package fab.shop.microservices.core.purchase.persistence;




import javax.persistence.*;



@Entity
@Table(name="payments")
public class PaymentDetailEntity {

    @Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;


    
}
