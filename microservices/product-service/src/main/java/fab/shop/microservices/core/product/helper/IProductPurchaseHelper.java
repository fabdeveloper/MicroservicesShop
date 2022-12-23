package fab.shop.microservices.core.product.helper;
 
import java.util.List;

import fab.shop.api.core.product.msg.OfferPurchase;

public interface IProductPurchaseHelper {
    
    public Boolean checkAvailability(List<OfferPurchase> purchaseList);
    
    public Boolean decrementStock(List<OfferPurchase> purchaseList);
    
    public Integer bookPurchaseList(List<OfferPurchase> purchaseList);
    
}
