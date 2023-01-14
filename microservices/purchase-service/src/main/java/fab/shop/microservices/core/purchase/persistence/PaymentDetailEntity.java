package fab.shop.microservices.core.purchase.persistence;




import java.util.Date;
import java.util.Objects;

import javax.persistence.*;


import fab.shop.api.core.purchase.transfer.PaymentTypeEnum;



@Entity
@Table(name="payments")
public class PaymentDetailEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;

    private String paymentStatus;
    private PaymentTypeEnum paymentType;
    
    private Date paymentDate;
    private Date paymentModificationDate;


    public PaymentDetailEntity() {
    }

    public PaymentDetailEntity(Integer id, Integer version, String paymentStatus, PaymentTypeEnum paymentType, Date paymentDate, Date paymentModificationDate) {
        this.id = id;
        this.version = version;
        this.paymentStatus = paymentStatus;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.paymentModificationDate = paymentModificationDate;
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

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentTypeEnum getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(PaymentTypeEnum paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getPaymentModificationDate() {
        return this.paymentModificationDate;
    }

    public void setPaymentModificationDate(Date paymentModificationDate) {
        this.paymentModificationDate = paymentModificationDate;
    }

    public PaymentDetailEntity id(Integer id) {
        setId(id);
        return this;
    }

    public PaymentDetailEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public PaymentDetailEntity paymentStatus(String paymentStatus) {
        setPaymentStatus(paymentStatus);
        return this;
    }

    public PaymentDetailEntity paymentType(PaymentTypeEnum paymentType) {
        setPaymentType(paymentType);
        return this;
    }

    public PaymentDetailEntity paymentDate(Date paymentDate) {
        setPaymentDate(paymentDate);
        return this;
    }

    public PaymentDetailEntity paymentModificationDate(Date paymentModificationDate) {
        setPaymentModificationDate(paymentModificationDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PaymentDetailEntity)) {
            return false;
        }
        PaymentDetailEntity paymentDetailEntity = (PaymentDetailEntity) o;
        return Objects.equals(id, paymentDetailEntity.id) && Objects.equals(version, paymentDetailEntity.version) && Objects.equals(paymentStatus, paymentDetailEntity.paymentStatus) && Objects.equals(paymentType, paymentDetailEntity.paymentType) && Objects.equals(paymentDate, paymentDetailEntity.paymentDate) && Objects.equals(paymentModificationDate, paymentDetailEntity.paymentModificationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, paymentStatus, paymentType, paymentDate, paymentModificationDate);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", paymentStatus='" + getPaymentStatus() + "'" +
            ", paymentType='" + getPaymentType() + "'" +
            ", paymentDate='" + getPaymentDate() + "'" +
            ", paymentModificationDate='" + getPaymentModificationDate() + "'" +
            "}";
    }

    
}
