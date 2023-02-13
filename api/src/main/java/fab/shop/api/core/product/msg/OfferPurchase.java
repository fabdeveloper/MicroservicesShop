package fab.shop.api.core.product.msg;

public class OfferPurchase extends OfferDetail {

    public OfferPurchase(){
        super();
    }

    public OfferPurchase(Integer offerId, String offerName, String offerDescription, Float offerUnitPrice, Integer count) {
        super(offerId, offerName, offerDescription, offerUnitPrice, count);
    }
    


    

    
}
