package fab.shop.microservices.core.product.helper;
 
import java.util.List;

import fab.shop.api.core.product.msg.OfferPurchase;
import fab.shop.api.core.product.msg.ProductConfirmRQ;
import fab.shop.api.core.product.msg.ProductConfirmRS;

public interface IProductPurchaseHelper {
    
    public Boolean checkAvailability(OfferPurchase offerPurchase);
    
    public Boolean decrementStock(OfferPurchase offerPurchase);
    
    public ProductConfirmRS bookPurchaseList(ProductConfirmRQ productPurchaseConfirmRQ);

    // public Integer bookPurchaseList(List<OfferPurchase> purchaseList);
    
}
