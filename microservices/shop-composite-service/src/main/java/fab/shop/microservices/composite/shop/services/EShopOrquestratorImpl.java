package fab.shop.microservices.composite.shop.services;

import fab.shop.api.core.valuation.transfer.ValuableItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


import fab.shop.api.composite.IEShopOrquestrator;
import fab.shop.api.composite.IEShopIntegration;

import fab.shop.api.composite.msg.*;

import fab.shop.api.core.product.msg.*;
import fab.shop.api.core.product.transfer.OfferPurchase;
import fab.shop.api.core.valuation.msg.*;
import fab.shop.api.core.purchase.msg.*;
import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.api.core.purchase.transfer.DeliveryDetail;
import fab.shop.api.core.purchase.transfer.PaymentDetail;
import fab.shop.api.core.purchase.transfer.Purchase;
import fab.shop.api.core.purchase.transfer.UserDetail;
import fab.shop.api.core.purchase.transfer.PaymentStatusTypeEnum;

import fab.shop.api.core.cart.msg.*;





@RestController
public class EShopOrquestratorImpl implements IEShopOrquestrator {

    @Autowired
    private EShopIntegrationImpl shopIntegration;


    @Override
    public EShopProductBookingRS eShopProductBooking(EShopProductBookingRQ eShopProductBookingRQ){
        EShopProductBookingRS rs = new EShopProductBookingRS(eShopProductBookingRQ.getShopId(), false, null, null, null, null, null);
        // ProductService tasks
        ProductBookingRQ productBookingRQ = new ProductBookingRQ(eShopProductBookingRQ.getShopId(), eShopProductBookingRQ.getOfferPurchaseList());
        ProductBookingRS productBookingRS;
        try {
            productBookingRS = getShopIntegration().productBooking(productBookingRQ);
            if(!productBookingRS.getBConfirmed()){
                throw new Exception("not confirmed");
            }

        } catch (Exception e) {
            String sError = "ERROR - ProductServer - msg = " + e.getMessage();
            rs.addError(sError);
            return rs;
        }
        
        List<ValuableItem> valuableItemsList = new ArrayList<>();
        ValuableItem valitem;
        for(OfferPurchase ofpur : productBookingRS.getProductPurchaseList()){
            valitem = new ValuableItem(ofpur.getOfferId(), productBookingRS.getShopId(), ofpur.getOfferUnitPrice(), ofpur.getCount(), ofpur.getDiscountList(), ofpur.getTaxList());
            valuableItemsList.add(valitem);
        }
            
        // ValuationService tasks
        ValuationRQ valuationRQ = new ValuationRQ(valuableItemsList);
        ValuationRS valuationRS = null;
        try {
            valuationRS = getShopIntegration().valuate(valuationRQ);
        } catch (Exception e) {
            String sError = "ERROR - ValuationServer - msg = " + e.getMessage();
            rs.addError(sError);
        }

        rs.setBConfirmed(productBookingRS.getBConfirmed());
        rs.setProductBookingNumber(productBookingRS.getProductBookingNumber());
        rs.setProductBookingTime(productBookingRS.getProductBookingTime());
        rs.setProductPurchaseList(productBookingRS.getProductPurchaseList());
        if(valuationRS != null) rs.setValuation(valuationRS.getTotalValuation());
        rs.setShopId(productBookingRS.getShopId());

        return rs;
    }

    @Override
    public EShopPurchaseConfirmRS eShopPurchaseConfirm(EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ){
        EShopPurchaseConfirmRS eShopPurchaseConfirmRS = null;

        // confirm product at ProductService
        ProductPurchaseConfirmRQ productPurchaseConfirmRQ = new ProductPurchaseConfirmRQ(null, null, null, null);
        ProductPurchaseConfirmRS productPurchaseConfirmRS = getShopIntegration().productPurchaseConfirm(productPurchaseConfirmRQ);
        // pay at CheckOutService


        // record purchase at PurchaseService        
        Purchase purchase = eShopPurchaseConfirmRQ.getPurchase();
        PurchaseConfirmRQ purchaseConfirmRQ = new PurchaseConfirmRQ(purchase);
        PurchaseConfirmRS purchaseConfirmRS = getShopIntegration().purchaseConfirm(purchaseConfirmRQ);


        // delete cart at CartService
        DeleteCartRQ deleteCartRQ = new DeleteCartRQ(null) ;
        DeleteCartRS deleteCartRS = getShopIntegration().deleteCart(deleteCartRQ);



        return eShopPurchaseConfirmRS;
    }

    public IEShopIntegration getShopIntegration(){
        return this.shopIntegration;
    }
    
}
