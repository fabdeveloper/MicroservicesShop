package fab.shop.microservices.core.purchase.persistence;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;



@Entity
@Table(name="purchases")
public class PurchaseEntity {

    @Id @GeneratedValue
    private Integer id;

	@Version
    private Integer version;

    private Date confirmationDate;
    private Date modificationDate;

    private String remarks;

    @ManyToOne    
    @JoinColumn(name = "user_id", nullable = false)
    private UserDetailEntity user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id", referencedColumnName = "id", nullable = false)
    private CartDetailEntity cart;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id", referencedColumnName = "id", nullable = false)
    private DeliveryDetailEntity delivery;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id", referencedColumnName = "id", nullable = false)
    private PaymentDetailEntity payment;

    

    public PurchaseEntity() {
    }

    public PurchaseEntity(Integer id, Integer version, Date confirmationDate, Date modificationDate, String remarks, UserDetailEntity user, CartDetailEntity cart, DeliveryDetailEntity delivery, PaymentDetailEntity payment) {
        this.id = id;
        this.version = version;
        this.confirmationDate = confirmationDate;
        this.modificationDate = modificationDate;
        this.remarks = remarks;
        this.user = user;
        this.cart = cart;
        this.delivery = delivery;
        this.payment = payment;
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

    public Date getConfirmationDate() {
        return this.confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public Date getModificationDate() {
        return this.modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public UserDetailEntity getUser() {
        return this.user;
    }

    public void setUser(UserDetailEntity user) {
        this.user = user;
    }

    public CartDetailEntity getCart() {
        return this.cart;
    }

    public void setCart(CartDetailEntity cart) {
        this.cart = cart;
    }

    public DeliveryDetailEntity getDelivery() {
        return this.delivery;
    }

    public void setDelivery(DeliveryDetailEntity delivery) {
        this.delivery = delivery;
    }

    public PaymentDetailEntity getPayment() {
        return this.payment;
    }

    public void setPayment(PaymentDetailEntity payment) {
        this.payment = payment;
    }

    public PurchaseEntity id(Integer id) {
        setId(id);
        return this;
    }

    public PurchaseEntity version(Integer version) {
        setVersion(version);
        return this;
    }

    public PurchaseEntity confirmationDate(Date confirmationDate) {
        setConfirmationDate(confirmationDate);
        return this;
    }

    public PurchaseEntity modificationDate(Date modificationDate) {
        setModificationDate(modificationDate);
        return this;
    }

    public PurchaseEntity remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public PurchaseEntity user(UserDetailEntity user) {
        setUser(user);
        return this;
    }

    public PurchaseEntity cart(CartDetailEntity cart) {
        setCart(cart);
        return this;
    }

    public PurchaseEntity delivery(DeliveryDetailEntity delivery) {
        setDelivery(delivery);
        return this;
    }

    public PurchaseEntity payment(PaymentDetailEntity payment) {
        setPayment(payment);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PurchaseEntity)) {
            return false;
        }
        PurchaseEntity purchaseEntity = (PurchaseEntity) o;
        return Objects.equals(id, purchaseEntity.id) && Objects.equals(version, purchaseEntity.version) && Objects.equals(confirmationDate, purchaseEntity.confirmationDate) && Objects.equals(modificationDate, purchaseEntity.modificationDate) && Objects.equals(remarks, purchaseEntity.remarks) && Objects.equals(user, purchaseEntity.user) && Objects.equals(cart, purchaseEntity.cart) && Objects.equals(delivery, purchaseEntity.delivery) && Objects.equals(payment, purchaseEntity.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, confirmationDate, modificationDate, remarks, user, cart, delivery, payment);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", version='" + getVersion() + "'" +
            ", confirmationDate='" + getConfirmationDate() + "'" +
            ", modificationDate='" + getModificationDate() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", user='" + getUser().toString() + "'" +
            ", cart='" + getCart().toString() + "'" +
            ", delivery='" + getDelivery().toString() + "'" +
            ", payment='" + getPayment().toString() + "'" +
            "}";
    }


    
}
