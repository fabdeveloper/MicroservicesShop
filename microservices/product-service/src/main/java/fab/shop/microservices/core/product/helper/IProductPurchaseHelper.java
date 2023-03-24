package fab.shop.microservices.core.product.helper;
 
import java.util.List;

import fab.shop.api.core.product.msg.ProductConfirmRQ;
import fab.shop.api.core.product.msg.ProductConfirmRS;
import fab.shop.api.core.product.transfer.OfferPurchase;

public interface IProductPurchaseHelper {
    
    public Boolean checkAvailability(OfferPurchase offerPurchase);
    
    public Boolean decrementStock(OfferPurchase offerPurchase);
    
    public ProductConfirmRS bookPurchaseList(ProductConfirmRQ productPurchaseConfirmRQ);

    // public Integer bookPurchaseList(List<OfferPurchase> purchaseList);
    
}
