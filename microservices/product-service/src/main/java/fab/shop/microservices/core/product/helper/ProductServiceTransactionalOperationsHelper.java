package fab.shop.microservices.core.product.helper;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;

@Component
public class ProductServiceTransactionalOperationsHelper {

    @Transactional
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ rq){
        ProductPurchaseConfirmRS rs = new ProductPurchaseConfirmRS();





        return rs;
    }
    
}
