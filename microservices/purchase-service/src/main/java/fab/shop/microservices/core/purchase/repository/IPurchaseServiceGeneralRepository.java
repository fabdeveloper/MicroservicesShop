package fab.shop.microservices.core.purchase.repository;

public interface IPurchaseServiceGeneralRepository {
    
    public PurchaseRepository getPurchaseRepository();
    public CartDetailRepository getCartDetailRepository();
    public DeliveryDetailRepository getDeliveryDetailRepository();
    public PaymentDetailRepository getPaymentDetailRepository();
    public UserDetailRepository getUserDetailRepository();

}
