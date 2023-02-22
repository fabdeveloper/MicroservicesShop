package fab.shop.microservices.composite.shop.proxy.product;

import org.springframework.stereotype.Component;

import fab.shop.api.core.product.msg.*;

@Component
public class ProxyProductServiceImpl implements IProxyProductService {
    

    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
        return null;
    }

    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        return null;
    }

    @Override
    public ProductConfirmRS productConfirm(ProductConfirmRQ productConfirmRQ) {
        return null;
    }

    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        return null;
    }

    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
        return null;
    }

    @Override
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {
        return null;
    }
}
