package fab.shop.microservices.core.purchase.persistence;





import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="cartItems")
public class CartItemEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;



    
}
