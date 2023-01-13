package fab.shop.microservices.core.purchase.persistence;



import java.util.Date;

import javax.persistence.*;




@Entity
@Table(name="deliveries")
public class DeliveryDetailEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;

    private String customerName;
    private String deliveryAddress;
    private String phoneNumber;

    private String remarks;
    private String status;
    private Date deliveryDate;


    public DeliveryDetailEntity() {
    }


    public DeliveryDetailEntity(Integer id, Integer version, String customerName, String deliveryAddress, String phoneNumber, String remarks, String status, Date deliveryDate) {
        this.id = id;
        this.version = version;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.phoneNumber = phoneNumber;
        this.remarks = remarks;
        this.status = status;
        this.deliveryDate = deliveryDate;
    }

    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }


    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryDate() {
        return this.deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", deliveryAddress='" + getDeliveryAddress() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", status='" + getStatus() + "'" +
            ", deliveryDate='" + getDeliveryDate() + "'" +
            "}";
    }
    
}
