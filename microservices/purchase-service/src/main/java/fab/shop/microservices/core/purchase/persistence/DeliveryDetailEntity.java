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

    private String deliveryAddress;
    private String phoneNumber;
    private String remarks;
    private String status;
    private Date deliveryDate;


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
            ", deliveryAddress='" + getDeliveryAddress() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", status='" + getStatus() + "'" +
            ", deliveryDate='" + getDeliveryDate() + "'" +
            "}";
    }

    


    
}
