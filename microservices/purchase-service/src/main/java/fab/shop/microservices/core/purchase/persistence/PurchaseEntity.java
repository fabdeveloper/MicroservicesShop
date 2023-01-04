package fab.shop.microservices.core.purchase.persistence;

import java.util.Date;

import javax.persistence.*;



@Entity
@Table(name="purchases")
public class PurchaseEntity {

    @Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;

    private Date creationDate;
    private Date modificationDate;

    @ManyToOne
    private UserDetailEntity user;

    @OneToOne
    private CartDetailEntity cart;

    @OneToOne
    private DeliveryDetailEntity delivery;

    @OneToOne
    private PaymentDetailEntity payment;

    


    
}
