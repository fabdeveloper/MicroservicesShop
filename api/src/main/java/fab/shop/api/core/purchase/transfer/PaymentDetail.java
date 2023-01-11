package fab.shop.api.core.purchase.transfer;

import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;



public class PaymentDetail {

    private Integer cartId;

    @NotNull
    private String paymentStatus;
    @NotNull
    private PaymentTypeEnum paymentType;
    
    private Date paymentDate;
    private Date paymentModificationDate;



    public PaymentDetail() {
    }

    public PaymentDetail(Integer cartId, String paymentStatus, PaymentTypeEnum paymentType, Date paymentDate, Date paymentModificationDate) {
        this.cartId = cartId;
        this.paymentStatus = paymentStatus;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.paymentModificationDate = paymentModificationDate;
    }

    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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

    public PaymentDetail cartId(Integer cartId) {
        setCartId(cartId);
        return this;
    }

    public PaymentDetail paymentStatus(String paymentStatus) {
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
        return Objects.equals(cartId, paymentDetail.cartId) && Objects.equals(paymentStatus, paymentDetail.paymentStatus) && Objects.equals(paymentType, paymentDetail.paymentType) && Objects.equals(paymentDate, paymentDetail.paymentDate) && Objects.equals(paymentModificationDate, paymentDetail.paymentModificationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartId, paymentStatus, paymentType, paymentDate, paymentModificationDate);
    }

    @Override
    public String toString() {
        return "{" +
            " cartId='" + getCartId() + "'" +
            ", paymentStatus='" + getPaymentStatus() + "'" +
            ", paymentType='" + getPaymentType() + "'" +
            ", paymentDate='" + getPaymentDate() + "'" +
            ", paymentModificationDate='" + getPaymentModificationDate() + "'" +
            "}";
    }



    
}
