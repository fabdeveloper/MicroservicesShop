package fab.shop.api.core.product.msg;

import java.util.List;

public class ProductPurchaseCancelRQ extends ProductConfirmRQ {


    public ProductPurchaseCancelRQ() {
        super();
    }


    public ProductPurchaseCancelRQ(Integer shopId, List<OfferPurchase> offerPurchaseList) {
        super(shopId, offerPurchaseList);
    }


    

    
}
