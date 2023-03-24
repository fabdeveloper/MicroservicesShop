package fab.shop.microservices.core.purchase.mapper;

public interface IPurchaseServiceGeneralMapper {

    public PurchaseMapper getPurchaseMapper();
    public CartDetailMapper getCartDetailMapper();
    public CartItemMapper getCartItemMapper();
    public DeliveryDetailMapper getDeliveryDetailMapper();
    public PaymentDetailMapper getPaymentDetailMapper();
    public UserDetailMapper getUserDetailMapper();
    
}
