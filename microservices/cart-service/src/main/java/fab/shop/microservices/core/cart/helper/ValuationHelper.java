package fab.shop.microservices.core.cart.helper;

import java.util.List;

import fab.shop.api.core.product.transfer.Offer;

public interface ValuationHelper {

    public Float valuate(List<Offer> offerList);
    
}
