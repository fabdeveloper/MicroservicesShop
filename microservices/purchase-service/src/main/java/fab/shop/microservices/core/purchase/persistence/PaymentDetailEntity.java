package fab.shop.microservices.core.purchase.persistence;




import java.util.Date;

import javax.persistence.*;



@Entity
@Table(name="payments")
public class PaymentDetailEntity {

    @Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;

    private String paymentStatus;
    private PaymentTypeEnum paymentType;
    private Date paymentDate;
    private Date paymentModificationDate;

    


    
}
