package fab.shop.api.core.purchase.transfer;

import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;


public class Purchase {

    private Integer id;


	@NotNull
    private Date confirmationDate;
    private Date modificationDate;

    private String remarks;

	@NotNull
    private UserDetail user;

	@NotNull
    private CartDetail cart;

	@NotNull
    private DeliveryDetail delivery;

	@NotNull
    private PaymentDetail payment;



	public Purchase() {
	}

	public Purchase(Integer id, Date confirmationDate, Date modificationDate, String remarks, UserDetail user, CartDetail cart, DeliveryDetail delivery, PaymentDetail payment) {
		this.id = id;
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

	public UserDetail getUser() {
		return this.user;
	}

	public void setUser(UserDetail user) {
		this.user = user;
	}

	public CartDetail getCart() {
		return this.cart;
	}

	public void setCart(CartDetail cart) {
		this.cart = cart;
	}

	public DeliveryDetail getDelivery() {
		return this.delivery;
	}

	public void setDelivery(DeliveryDetail delivery) {
		this.delivery = delivery;
	}

	public PaymentDetail getPayment() {
		return this.payment;
	}

	public void setPayment(PaymentDetail payment) {
		this.payment = payment;
	}

	public Purchase id(Integer id) {
		setId(id);
		return this;
	}

	public Purchase confirmationDate(Date confirmationDate) {
		setConfirmationDate(confirmationDate);
		return this;
	}

	public Purchase modificationDate(Date modificationDate) {
		setModificationDate(modificationDate);
		return this;
	}

	public Purchase remarks(String remarks) {
		setRemarks(remarks);
		return this;
	}

	public Purchase user(UserDetail user) {
		setUser(user);
		return this;
	}

	public Purchase cart(CartDetail cart) {
		setCart(cart);
		return this;
	}

	public Purchase delivery(DeliveryDetail delivery) {
		setDelivery(delivery);
		return this;
	}

	public Purchase payment(PaymentDetail payment) {
		setPayment(payment);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Purchase)) {
			return false;
		}
		Purchase purchase = (Purchase) o;
		return Objects.equals(id, purchase.id) && Objects.equals(confirmationDate, purchase.confirmationDate) && Objects.equals(modificationDate, purchase.modificationDate) && Objects.equals(remarks, purchase.remarks) && Objects.equals(user, purchase.user) && Objects.equals(cart, purchase.cart) && Objects.equals(delivery, purchase.delivery) && Objects.equals(payment, purchase.payment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, confirmationDate, modificationDate, remarks, user, cart, delivery, payment);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", confirmationDate='" + getConfirmationDate() + "'" +
			", modificationDate='" + getModificationDate() + "'" +
			", remarks='" + getRemarks() + "'" +
			", user='" + getUser() + "'" +
			", cart='" + getCart() + "'" +
			", delivery='" + getDelivery() + "'" +
			", payment='" + getPayment() + "'" +
			"}";
	}

	
}
