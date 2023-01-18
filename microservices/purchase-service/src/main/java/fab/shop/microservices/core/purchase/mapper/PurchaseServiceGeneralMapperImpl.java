package fab.shop.microservices.core.purchase.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PurchaseServiceGeneralMapperImpl implements IPurchaseServiceGeneralMapper {

    @Autowired
    private PurchaseMapper purchaseMapper;
    @Autowired
    private CartDetailMapper cartDetailMapper;
    @Autowired
    private CartItemMapper cartItemMapper;
    @Autowired
    private DeliveryDetailMapper deliveryDetailMapper;
    @Autowired
    private PaymentDetailMapper paymentDetailMapper;
    private UserDetailMapper userDetailMapper;


    
    @Override
    public PurchaseMapper getPurchaseMapper() {
        return  this.purchaseMapper;
    }

    @Override
    public CartDetailMapper getCartDetailMapper() {
        return this.cartDetailMapper;
    }

    @Override
    public CartItemMapper getCartItemMapper() {
        return this.cartItemMapper;
    }

    @Override
    public DeliveryDetailMapper getDeliveryDetailMapper() {
        return this.deliveryDetailMapper;
    }

    @Override
    public PaymentDetailMapper getPaymentDetailMapper() {
        return this.paymentDetailMapper;
    }

    @Override
    public UserDetailMapper getUserDetailMapper() {
        return this.userDetailMapper;
    }
    
}
