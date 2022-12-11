package fab.shop.microservices.core.product.helper;

import java.util.List;

import fab.shop.api.core.product.msg.OfferPurchase;

public interface ProductPurchaseHelper {
    
    public Boolean checkAvailability(Integer offerId, Integer count);
    
    public Boolean decrementStock(Integer offerId, Integer count);
    
    public Boolean bookPurchaseList(List<OfferPurchase> purchaseList);
    
}
