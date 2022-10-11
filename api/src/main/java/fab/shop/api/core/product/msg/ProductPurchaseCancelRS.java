package fab.shop.api.core.product.msg;

import java.util.List;


public class ProductPurchaseCancelRS extends ProductPurchaseConfirmRS {


    public ProductPurchaseCancelRS() {
        super();
    }

    public ProductPurchaseCancelRS(Integer shopId, List<OfferPurchase> offerPurchaseOKList, List<OfferPurchase> offerPurchaseKOList, List<OfferAvail> offerAvailList, Boolean bConfirmed, String status) {
        super(shopId, offerPurchaseOKList, offerPurchaseKOList, offerAvailList, bConfirmed, status);       
    }
    
}
