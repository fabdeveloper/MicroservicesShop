package fab.shop.microservices.core.purchase.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PurchaseServiceGeneralRepositoryImpl implements IPurchaseServiceGeneralRepository {

    @Autowired
    private PurchaseRepository purchaseRepository;
    @Autowired
    private CartDetailRepository cartDetailRepository;
    @Autowired
    private DeliveryDetailRepository deliveryDetailRepository;
    @Autowired
    private PaymentDetailRepository paymentDetailRepository;
    @Autowired
    private UserDetailRepository userDetailRepository;

    @Override
    public PurchaseRepository getPurchaseRepository() {
        return this.purchaseRepository;
    }

    @Override
    public CartDetailRepository getCartDetailRepository() {
        return this.cartDetailRepository;
    }

    @Override
    public DeliveryDetailRepository getDeliveryDetailRepository() {
        return this.deliveryDetailRepository;
    }

    @Override
    public PaymentDetailRepository getPaymentDetailRepository() {
        return this.paymentDetailRepository;
    }

    @Override
    public UserDetailRepository getUserDetailRepository() {
        return this.userDetailRepository;
    }
    
}
