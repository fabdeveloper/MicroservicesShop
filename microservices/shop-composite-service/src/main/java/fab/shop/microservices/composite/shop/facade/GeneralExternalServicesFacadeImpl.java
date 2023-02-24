package fab.shop.microservices.composite.shop.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import fab.shop.microservices.composite.shop.proxy.cart.*;
import fab.shop.microservices.composite.shop.proxy.valuation.*;
import fab.shop.microservices.composite.shop.proxy.product.*;
import fab.shop.microservices.composite.shop.proxy.purchase.*;


@Component
public class GeneralExternalServicesFacadeImpl implements IGereneralExternalServicesFacade {
    
    @Autowired
    private IProxyProductService productServiceProxy;
    @Autowired
    private IProxyPurchaseService purchaseServiceProxy;
    @Autowired
    private IProxyCartService cartServiceProxy;
    @Autowired
    private IProxyValuationService valuationServiceProxy;


    @Override
    public IProxyCartService getCartServiceProxy() {
        return this.cartServiceProxy;
    }

    @Override
    public IProxyProductService getProductServiceProxy() {
        return this.productServiceProxy;
    }

    @Override
    public IProxyPurchaseService getPurchaseServiceProxy() {
        return this.purchaseServiceProxy;
    }

    @Override
    public IProxyValuationService getValuationServiceProxy() {
        return this.valuationServiceProxy;
    }


}
