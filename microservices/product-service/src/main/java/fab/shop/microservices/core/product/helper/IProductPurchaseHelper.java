package fab.shop.microservices.core.product.helper;
 
import java.util.List;

import fab.shop.api.core.product.msg.OfferPurchase;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;

public interface IProductPurchaseHelper {
    
    public Boolean checkAvailability(OfferPurchase offerPurchase);
    
    public Boolean decrementStock(OfferPurchase offerPurchase);
    
    public ProductPurchaseConfirmRS bookPurchaseList(ProductPurchaseConfirmRQ productPurchaseConfirmRQ);

    // public Integer bookPurchaseList(List<OfferPurchase> purchaseList);
    
}
