package fab.shop.microservices.core.purchase.persistence;



import javax.persistence.*;



@Entity
@Table(name="carts")
public class CartDetailEntity {

    @Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;


    
}
