package fab.shop.microservices.core.cart.helper;

import java.util.List;

import org.springframework.stereotype.Component;

import fab.shop.api.core.product.transfer.Offer;

@Component
public class ValuationHelperImpl implements ValuationHelper {

    @Override
    public Float valuate(List<Offer> offerList) {
        Float result = 0.00f;

        if(offerList != null){
            for(Offer offer : offerList){
                result += offer.getPrice();
            }
        }
        return result;
    }
    
}
