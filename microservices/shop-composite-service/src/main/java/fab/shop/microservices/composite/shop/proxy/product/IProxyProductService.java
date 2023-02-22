package fab.shop.microservices.composite.shop.proxy.product;

import fab.shop.api.core.product.msg.*;


public interface IProxyProductService {

    
    
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ);

    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ);
    
    public ProductConfirmRS productConfirm(ProductConfirmRQ productConfirmRQ);
    
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ);
    
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ);
    
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ);

}