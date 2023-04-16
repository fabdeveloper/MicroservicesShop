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


    public EShopProductConfirmRS eShopProductConfirm(EShopProductConfirmRQ eShopProductConfirmRQ){
        EShopProductConfirmRS rs = new EShopProductConfirmRS(eShopProductConfirmRQ.getShopId(), false, null, null, null, null, null);
        // ProductService tasks
        ProductConfirmRQ productConfirmRQ = new ProductConfirmRQ(eShopProductConfirmRQ.getShopId(), eShopProductConfirmRQ.getOfferPurchaseList());
        ProductConfirmRS productConfirmRS;
        try {
            productConfirmRS = getShopIntegration().productConfirm(productConfirmRQ);
            if(!productConfirmRS.getBConfirmed()){
                throw new Exception("not confirmed");
            }

        } catch (Exception e) {
            String sError = "ERROR - ProductServer - msg = " + e.getMessage();
            rs.addError(sError);
            return rs;
        }
        
        List<ValuableItem> valuableItemsList = new ArrayList<>();
        ValuableItem valitem;
        for(OfferPurchase ofpur : productConfirmRS.getProductPurchaseList()){
            valitem = new ValuableItem(ofpur.getOfferId(), productConfirmRS.getShopId(), ofpur.getOfferUnitPrice(), ofpur.getCount(), ofpur.getDiscountList(), ofpur.getTaxList());
            valuableItemsList.add(valitem);
        }
            
        // ValuationService tasks
        ValuationRQ valuationRQ = new ValuationRQ(valuableItemsList);
        ValuationRS valuationRS;
        try {
            valuationRS = getShopIntegration().valuate(valuationRQ);
        } catch (Exception e) {
            String sError = "ERROR - ValuationServer - msg = " + e.getMessage();
            rs.addError(sError);
        }

        rs.setBConfirmed(productConfirmRS.getBConfirmed());
        rs.setProductBookingNumber(productConfirmRS.getProductBookingNumber());
        rs.setProductBookingTime(productConfirmRS.getProductBookingTime());
        rs.setProductPurchaseList(productConfirmRS.getProductPurchaseList());
        rs.setValuation(valuationRS.getTotalValuation());
        rs.setShopId(productConfirmRS.getShopId());

        return rs;
    }

    
    public EShopPurchaseConfirmRS eShopPurchaseConfirm(@RequestBody EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ){
        EShopPurchaseConfirmRS eShopPurchaseConfirmRS = null;


        UserDetail user = new UserDetail(null, eShopPurchaseConfirmRQ.getUserId(), eShopPurchaseConfirmRQ.getShopId(), eShopPurchaseConfirmRQ.getUserEmail(), eShopPurchaseConfirmRQ.getDeliveryPhoneNumber());
        DeliveryDetail delivery = new DeliveryDetail(null, eShopPurchaseConfirmRQ.getCustomerName(), eShopPurchaseConfirmRQ.getDeliveryAddress(), eShopPurchaseConfirmRQ.getDeliveryPhoneNumber(), eShopPurchaseConfirmRQ.getDeliveryRemarks(), null, null);
        pppppppppppppp
        // purchaseList contiene OfferPurchase = OfferDetail 
        // OfferDetail debe mapearse a CartItem
        // CartDetail contiene una lista de CartItem
        CartDetail cart = new CartDetail(null, eShopPurchaseConfirmRQ.getPurchaseList(), null, null, null);
        PaymentDetail payment = new PaymentDetail(null, PaymentStatusTypeEnum.PAYED, null, null, null);
        Purchase purchase = new Purchase(null, eShopPurchaseConfirmRQ.getShopId(), eShopPurchaseConfirmRQ.getProductBookingNumber(), new Date(), null, null, user, cart, delivery, payment);
        PurchaseConfirmRQ purchaseConfirmRQ = new PurchaseConfirmRQ(purchase);

        DeleteCartRQ deleteCartRQ;



        return eShopPurchaseConfirmRS;
    }

    public IEShopIntegration getShopIntegration(){
        return this.shopIntegration;
    }
    
}
