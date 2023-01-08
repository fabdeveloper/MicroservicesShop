package fab.shop.microservices.core.purchase.persistence;




import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="payments")
public class PaymentDetailEntity {

    @Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;

    @NotNull
    private String paymentStatus;
    @NotNull
    private PaymentTypeEnum paymentType;
    
    private Date paymentDate;
    private Date paymentModificationDate;

    


    
}
