package fab.shop.microservices.composite.shop.facade;

import fab.shop.microservices.composite.shop.proxy.cart.*;
import fab.shop.microservices.composite.shop.proxy.valuation.*;
import fab.shop.microservices.composite.shop.proxy.product.*;
import fab.shop.microservices.composite.shop.proxy.purchase.*;


public interface IGereneralExternalServicesFacade {

    public IProxyCartService getCartServiceProxy();

    public IProxyProductService getProductServiceProxy();

    public IProxyPurchaseService getPurchaseServiceProxy();

    public IProxyValuationService getValuationServiceProxy();


    
}
