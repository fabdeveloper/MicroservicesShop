package fab.shop.api.core.purchase.transfer;

import java.util.Date;
import java.util.Objects;

public class DeliveryDetail {

    private Integer id;
    private String customerName;
    private String deliveryAddress;
    private String phoneNumber;

    private String remarks;
    private String status;
    private Date deliveryDate;



    public DeliveryDetail() {
    }

    public DeliveryDetail(Integer id, String customerName, String deliveryAddress, String phoneNumber, String remarks, String status, Date deliveryDate) {
        this.id = id;
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

    public DeliveryDetail id(Integer id) {
        setId(id);
        return this;
    }

    public DeliveryDetail customerName(String customerName) {
        setCustomerName(customerName);
        return this;
    }

    public DeliveryDetail deliveryAddress(String deliveryAddress) {
        setDeliveryAddress(deliveryAddress);
        return this;
    }

    public DeliveryDetail phoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    public DeliveryDetail remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DeliveryDetail status(String status) {
        setStatus(status);
        return this;
    }

    public DeliveryDetail deliveryDate(Date deliveryDate) {
        setDeliveryDate(deliveryDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DeliveryDetail)) {
            return false;
        }
        DeliveryDetail deliveryDetail = (DeliveryDetail) o;
        return Objects.equals(id, deliveryDetail.id) && Objects.equals(customerName, deliveryDetail.customerName) && Objects.equals(deliveryAddress, deliveryDetail.deliveryAddress) && Objects.equals(phoneNumber, deliveryDetail.phoneNumber) && Objects.equals(remarks, deliveryDetail.remarks) && Objects.equals(status, deliveryDetail.status) && Objects.equals(deliveryDate, deliveryDetail.deliveryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, deliveryAddress, phoneNumber, remarks, status, deliveryDate);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", deliveryAddress='" + getDeliveryAddress() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", status='" + getStatus() + "'" +
            ", deliveryDate='" + getDeliveryDate() + "'" +
            "}";
    }
    
    
}
