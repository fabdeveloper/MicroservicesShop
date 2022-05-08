package fab.shop.microservices.core.purchase.persistence;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="purchases")
public class PurchaseEntity {

    @Id
    private String id;

    @Version
    private Integer version;

    @Indexed(unique = true)
    private int purchaseId;
    
    private final List<Product> productList;
	private final Integer userId;
	private final Float price;
	private final String shipmentAddress;
    private final String paymentMethod;
	private final String status;



    public PurchaseEntity() {
    }


    public PurchaseEntity(String id, Integer version, int purchaseId, List<Product> productList, Integer userId, Float price, String shipmentAddress, String paymentMethod, String status) {
        this.id = id;
        this.version = version;
        this.purchaseId = purchaseId;
        this.productList = productList;
        this.userId = userId;
        this.price = price;
        this.shipmentAddress = shipmentAddress;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public int getPurchaseId() {
        return this.purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public List<Product> getProductList() {
        return this.productList;
    }


    public Integer getUserId() {
        return this.userId;
    }


    public Float getPrice() {
        return this.price;
    }


    public String getShipmentAddress() {
        return this.shipmentAddress;
    }


    public String getPaymentMethod() {
        return this.paymentMethod;
    }


    public String getStatus() {
        return this.status;
    }


}                                     
