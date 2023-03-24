package fab.shop.api.core.purchase.transfer;

import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;



public class PaymentDetail {

    private Integer id;
    @NotNull
    private PaymentStatusTypeEnum paymentStatus;
    @NotNull
    private PaymentTypeEnum paymentType;    
    private Date paymentDate;
    private Date paymentModificationDate;



    public PaymentDetail() {
    }

    public PaymentDetail(Integer id, PaymentStatusTypeEnum paymentStatus, PaymentTypeEnum paymentType, Date paymentDate, Date paymentModificationDate) {
        this.id = id;
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

    public PaymentStatusTypeEnum getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusTypeEnum paymentStatus) {
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

    public PaymentDetail id(Integer id) {
        setId(id);
        return this;
    }

    public PaymentDetail paymentStatus(PaymentStatusTypeEnum paymentStatus) {
        setPaymentStatus(paymentStatus);
        return this;
    }

    public PaymentDetail paymentType(PaymentTypeEnum paymentType) {
        setPaymentType(paymentType);
        return this;
    }

    public PaymentDetail paymentDate(Date paymentDate) {
        setPaymentDate(paymentDate);
        return this;
    }

    public PaymentDetail paymentModificationDate(Date paymentModificationDate) {
        setPaymentModificationDate(paymentModificationDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PaymentDetail)) {
            return false;
        }
        PaymentDetail paymentDetail = (PaymentDetail) o;
        return Objects.equals(id, paymentDetail.id) && Objects.equals(paymentStatus, paymentDetail.paymentStatus) && Objects.equals(paymentType, paymentDetail.paymentType) && Objects.equals(paymentDate, paymentDetail.paymentDate) && Objects.equals(paymentModificationDate, paymentDetail.paymentModificationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paymentStatus, paymentType, paymentDate, paymentModificationDate);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", paymentStatus='" + getPaymentStatus() + "'" +
            ", paymentType='" + getPaymentType() + "'" +
            ", paymentDate='" + getPaymentDate() + "'" +
            ", paymentModificationDate='" + getPaymentModificationDate() + "'" +
            "}";
    }

}
