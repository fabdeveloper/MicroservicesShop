package fab.shop.microservices.composite.shop.proxy.valuation;

import fab.shop.api.core.valuation.msg.*;


public interface IProxyValuationService {

    ValuationRS valuate(ValuationRQ valuationRQ);

    
}
