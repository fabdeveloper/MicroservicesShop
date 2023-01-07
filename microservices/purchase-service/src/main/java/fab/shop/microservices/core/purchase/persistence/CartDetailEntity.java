package fab.shop.microservices.core.purchase.persistence;



import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="carts")
public class CartDetailEntity {

    @Id @GeneratedValue
    private Integer cartId;

	@Version
    private Integer version;


    private List<ItemCart> itemsList;
    private Float valuation;
    private Integer productBookingNumber;
    
    
    
}
