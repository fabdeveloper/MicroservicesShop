package fab.shop.microservices.core.product.helper;

import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;

public interface IProductAvailabilityHelper {

    public	GetAvailRS getAvail(GetAvailRQ getAvailRQ);

    public	GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ);


    
}
