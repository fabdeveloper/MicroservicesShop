package fab.shop.microservices.core.product.services;

import fab.shop.api.core.product.ProductService;
import fab.shop.api.core.product.msg.GenericProductConfigRQ;
import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.msg.ProductConfigBasicRQ;
import fab.shop.api.core.product.msg.ProductCreateNewRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;

public class ProductServiceIntegrationImpl implements ProductService{

    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
