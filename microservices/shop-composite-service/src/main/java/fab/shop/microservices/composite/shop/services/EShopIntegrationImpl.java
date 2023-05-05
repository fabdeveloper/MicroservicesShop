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
        return getExternalServiceLocator().getCartServiceProxy().getCart(getCartRQ);
    }

    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {
        return getExternalServiceLocator().getCartServiceProxy().cartModification(cartModificationRQ);
    }

    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {
        return getExternalServiceLocator().getCartServiceProxy().addToCart(addToCartRq);
    }

    @Override
    public RemoveFromCartRS removeFromCart(RemoveFromCartRQ removeFromCartRq) {
        return getExternalServiceLocator().getCartServiceProxy().removeFromCart(removeFromCartRq);
    }

    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {
        return getExternalServiceLocator().getCartServiceProxy().emptyCart(emptyCartRQ);
    }

    @Override
    public DeleteCartRS deleteCart(DeleteCartRQ deleteCartRQ) {
        return getExternalServiceLocator().getCartServiceProxy().deleteCart(deleteCartRQ);
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
        return getExternalServiceLocator().getProductServiceProxy().getAvail(getAvailRQ);
    }

    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        return getExternalServiceLocator().getProductServiceProxy().getOfferListDetail(getOfferListDetailRQ);
    }

    @Override
    public ProductConfirmRS productConfirm(ProductConfirmRQ productConfirmRQ) {
        return getExternalServiceLocator().getProductServiceProxy().productConfirm(productConfirmRQ);
    }

    @Override
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {
        return getExternalServiceLocator().getProductServiceProxy().productPurchaseConfirm(productPurchaseConfirmRQ);
    }

    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        return getExternalServiceLocator().getProductServiceProxy().productPurchaseCancel(productPurchaseCancelRQ);
    }

    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
        return getExternalServiceLocator().getProductServiceProxy().productCreateNew(productCreateNewRQ);
    }

    @Override
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testConfig'");
    }

    @Override
    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {
        return getExternalServiceLocator().getPurchaseServiceProxy().purchaseModification(purchaseModificationRQ);
    }

    @Override
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {
        return getExternalServiceLocator().getPurchaseServiceProxy().purchaseCancel(purchaseCancelRQ);
    }

    @Override
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {
        return getExternalServiceLocator().getPurchaseServiceProxy().getPurchase(getPurchaseRQ);
    }

    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        return getExternalServiceLocator().getPurchaseServiceProxy().getPurchaseList(getPurchaseListRQ);
    }

    @Override
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        return getExternalServiceLocator().getPurchaseServiceProxy().purchaseConfirm(purchaseConfirmRQ);
    }

    @Override
    public ValuationRS valuate(ValuationRQ valuationRQ) {
        return getExternalServiceLocator().getValuationServiceProxy().valuate(valuationRQ);
    }


    public IGereneralExternalServicesFacade getExternalServiceLocator() {
        return this.externalServiceLocator;
    }



    

    


}
