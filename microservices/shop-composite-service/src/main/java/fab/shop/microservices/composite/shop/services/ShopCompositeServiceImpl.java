package fab.shop.microservices.composite.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.purchase.msg.*;
import fab.shop.api.composite.ShopService;
import fab.shop.api.composite.msg.*;

import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.msg.GetAvailRQ;
import fab.shop.api.core.product.msg.GetAvailRS;
import fab.shop.api.core.product.msg.GetOfferListDetailRQ;
import fab.shop.api.core.product.msg.GetOfferListDetailRS;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRQ;
import fab.shop.api.core.product.msg.ProductPurchaseCancelRS;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRQ;
import fab.shop.api.core.product.msg.ProductPurchaseConfirmRS;
import fab.shop.api.core.valuation.msg.*;

@RestController
public class ShopCompositeServiceImpl implements ShopService {

    private final ShopCompositeIntegration shopIntegration;
    private final ServiceUtil serviceUtil;


    @Autowired
    public ShopCompositeServiceImpl(ShopCompositeIntegration shopIntegration, ServiceUtil serviceUtil) {
        this.shopIntegration = shopIntegration;
        this.serviceUtil = serviceUtil;
    }

 

    public ShopCompositeIntegration getShopIntegration(){
        return this.shopIntegration;
    }

    public ServiceUtil getServiceUtil(){
        return this.serviceUtil;
    }


    // CartService

    @Override
    public GetCartRS getCart(GetCartRQ getCartRQ) {
        return getShopIntegration().getCart(getCartRQ);
    }

    
    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRQ) {
        return getShopIntegration().addToCart(addToCartRQ);
    }


    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {
        return getShopIntegration().emptyCart(emptyCartRQ);
    }


    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {
        return getShopIntegration().cartModification(cartModificationRQ);
    }




    // ProductService


    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
        return getShopIntegration().getAvail(getAvailRQ);
    }


    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        return getShopIntegration().getOfferListDetail(getOfferListDetailRQ);
    }




    @Override
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {
        return getShopIntegration().productPurchaseConfirm(productPurchaseConfirmRQ);
    }




    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        return getShopIntegration().productPurchaseCancel(productPurchaseCancelRQ);
    }


    // PurchaseService
    
    @Override
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        return getShopIntegration().purchaseConfirm(purchaseConfirmRQ);
    }



    // ValuationService

    @Override
    public ValuationRS getValuation(ValuationRQ valuationRQ) {
        return getShopIntegration().valuate(valuationRQ);
    }


    // Orchestrator 

    @Override
    public EShopPurchaseConfirmRS eShopPurchaseConfirm(EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ){
        return getShopIntegration().eShopPurchaseConfirm(eShopPurchaseConfirmRQ);
    }


    // test

    
    @Override
    public String apiObject() {
        return getShopIntegration().getCartApiObject();
    }


    @Override
    public String entityObject() {
        return getShopIntegration().getCartEntityObject();
    }


    
}
