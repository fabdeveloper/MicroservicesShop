package fab.shop.microservices.core.product.helper;
 
import java.util.List;

import fab.shop.api.core.product.exception.ProductAvailabilityException;
import fab.shop.api.core.product.exception.ProductBookingException;
import fab.shop.api.core.product.exception.ProductPurchaseConfirmException;
import fab.shop.api.core.product.exception.ProductReduceStockException;
import fab.shop.api.core.product.exception.ProductServiceException;
import fab.shop.api.core.product.msg.ProductBookingRQ;
import fab.shop.api.core.product.msg.ProductBookingRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.api.core.product.transfer.OfferPurchase;

public interface IProductPurchaseHelper {
    
    public Boolean checkAvailability(OfferPurchase offerPurchase) throws ProductAvailabilityException;
    
    public Boolean decrementStock(OfferPurchase offerPurchase) throws ProductReduceStockException;
    
    public ProductBookingRS bookPurchaseList(ProductBookingRQ productBookingRQ) throws ProductBookingException;

    public ProductPurchaseConfirmRS purchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) throws ProductPurchaseConfirmException;


    
}
