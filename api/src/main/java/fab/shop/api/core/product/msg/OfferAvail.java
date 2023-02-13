package fab.shop.api.core.product.msg;


public class OfferAvail extends OfferDetail {

    
    public OfferAvail(){
        super();
    }

    public OfferAvail(Integer offerId, String offerName, String offerDescription, Float offerUnitPrice, Integer count) {
        super(offerId, offerName, offerDescription, offerUnitPrice, count);
    }

    
}
