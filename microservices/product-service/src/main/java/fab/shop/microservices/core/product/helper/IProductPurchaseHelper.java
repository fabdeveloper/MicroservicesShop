package fab.shop.microservices.core.product.helper;
 
import java.util.List;

import fab.shop.api.core.product.msg.ProductBookingRQ;
import fab.shop.api.core.product.msg.ProductBookingRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.api.core.product.transfer.OfferPurchase;

public interface IProductPurchaseHelper {
    
    public Boolean checkAvailability(OfferPurchase offerPurchase);
    
    public Boolean decrementStock(OfferPurchase offerPurchase);
    
    public ProductBookingRS bookPurchaseList(ProductBookingRQ productBookingRQ);

    public ProductPurchaseConfirmRS purchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ);


    
}
