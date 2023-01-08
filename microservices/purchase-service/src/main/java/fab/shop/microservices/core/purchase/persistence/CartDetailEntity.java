package fab.shop.microservices.core.purchase.persistence;



import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="carts")
public class CartDetailEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;


    @NotNull
    private List<ItemCartEntity> itemsList;
    @NotNull
    private Float valuation;
    @NotNull
    private Integer productBookingNumber;
    
    
    
}
