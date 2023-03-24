package fab.shop.api.core.product.transfer;

import java.util.List;

public class OfferPurchase extends OfferDetail {

    public OfferPurchase(){
        super();
    }

    public OfferPurchase(Integer offerId, String offerName, String offerDescription, Float offerUnitPrice, Integer count, List<Discount> discountList, List<Tax> taxList) {
        super(offerId, offerName, offerDescription, offerUnitPrice, count, discountList, taxList);
    }
    


    

    
}
