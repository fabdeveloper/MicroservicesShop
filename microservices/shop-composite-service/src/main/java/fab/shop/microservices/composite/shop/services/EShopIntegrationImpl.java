package fab.shop.microservices.composite.shop.services;

import fab.shop.api.composite.IEShopIntegration;
import fab.shop.microservices.composite.shop.facade.IGereneralExternalServicesFacade;


import fab.shop.api.core.purchase.msg.*;
import fab.shop.api.core.product.msg.*;
import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.valuation.msg.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EShopIntegrationImpl implements IEShopIntegration {

    @Autowired
    private IGereneralExternalServicesFacade externalServiceLocator;



    @Override
    public GetCartRS getCart(GetCartRQ getCartRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCart'");
    }

    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cartModification'");
    }

    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToCart'");
    }

    @Override
    public RemoveFromCartRS removeFromCart(RemoveFromCartRQ removeFromCartRq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFromCart'");
    }

    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emptyCart'");
    }

    @Override
    public DeleteCartRS deleteCart(DeleteCartRQ deleteCartRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCart'");
    }

    @Override
    public String getCartApiObject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCartApiObject'");
    }

    @Override
    public String getCartEntityObject() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCartEntityObject'");
    }

    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAvail'");
    }

    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOfferListDetail'");
    }

    @Override
    public ProductConfirmRS productConfirm(ProductConfirmRQ productConfirmRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'productConfirm'");
    }

    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'productPurchaseCancel'");
    }

    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'productCreateNew'");
    }

    @Override
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testConfig'");
    }

    @Override
    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'purchaseModification'");
    }

    @Override
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'purchaseCancel'");
    }

    @Override
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPurchase'");
    }

    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPurchaseList'");
    }

    @Override
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'purchaseConfirm'");
    }

    @Override
    public ValuationRS valuate(ValuationRQ valuationRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valuate'");
    }


    public IGereneralExternalServicesFacade getExternalServiceLocator() {
        return this.externalServiceLocator;
    }

    

    


}
