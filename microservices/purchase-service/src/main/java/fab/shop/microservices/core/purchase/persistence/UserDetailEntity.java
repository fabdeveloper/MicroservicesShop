package fab.shop.microservices.core.purchase.persistence;





import javax.persistence.*;



@Entity
@Table(name="users")
public class UserDetailEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;

    private Integer userId;
    private Integer shopId;
    private String email;
    private String phoneNumber;
    
    

    
}
