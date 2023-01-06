package fab.shop.microservices.core.purchase.persistence;





import javax.persistence.*;



@Entity
@Table(name="users")
public class UserDetailEntity {

    @Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;


    
}
