package fab.shop.microservices.core.purchase.persistence;





import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="users")
public class UserDetailEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;

    @NotNull
    private Integer userId;
    @NotNull
    private Integer shopId;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;
    
    

    
}
