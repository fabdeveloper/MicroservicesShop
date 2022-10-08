package fab.shop.microservices.core.valuation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.valuation.msg.*;
import fab.shop.api.core.product.AbstractExtraValuableItem;
import fab.shop.api.core.product.Discount;
import fab.shop.api.core.product.EnumSign;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Tax;
import fab.shop.api.core.valuation.ValuableItem;
import fab.shop.api.core.valuation.ValuatedItem;
import fab.shop.api.core.valuation.ValuationService;

@RestController
public class ValuationServiceImpl implements ValuationService{

    Logger logger = Logger.getLogger("ValuationServiceImpl");

    private final ServiceUtil serviceUtil;



    @Autowired
    public ValuationServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }



    @Override
    public ValuationRS valuate(ValuationRQ valuationRQ) {

        String msg = "valuate() - ValuationRQ= " + valuationRQ.toString();
        getLogger().log(Level.ALL, msg);

        ValuationRS valuationRS = null;

        List<ValuatedItem> valuatedItemsList = new ArrayList<ValuatedItem>();
        ValuatedItem valuated;
        Float tempVal = 0.00f;
        for(ValuableItem valuable : valuationRQ.getValuableItemsList()){
            valuated = valuateItem(valuable);
            valuatedItemsList.add(valuated);
            tempVal += valuated.getValuation();
        }

        valuationRS = new ValuationRS(valuatedItemsList, tempVal);

     
        String response = "valuate() - ValuationRS= " + valuationRS.toString();
        getLogger().log(Level.ALL, response);

        return valuationRS;
    }



    public Logger getLogger() {
        return this.logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    


    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }


    private ValuatedItem valuateItem(ValuableItem valuableItem){
        ValuatedItem valuation = null;

        List<Discount> discountList    = valuableItem.getDiscountList();
        List<Tax> taxList    = valuableItem.getTaxList();

        Float price = valuableItem.getPrice();

        Float tempPrice = price;
        tempPrice = applyExtraList(price, discountList);
        tempPrice = applyExtraList(tempPrice, taxList);

        valuation = new ValuatedItem(valuableItem.getOfferId(), valuableItem.getShopId(), valuableItem.getPrice(), valuableItem.getDiscountList(), valuableItem.getTaxList(), tempPrice);

        return valuation;
    }

    private Float applyExtraList(Float intiValue, List<? extends AbstractExtraValuableItem> extraList){
        Float result = intiValue;
        final Float price = intiValue;
        Float extraVal = 0.00f;

        for(AbstractExtraValuableItem extra : extraList){
            Float percentValue = extra.getPercentValue();
            Float fixedValue = extra.getFixedValue();
            if(percentValue !=  null){
                extraVal = (price * percentValue)/100;
            }
            if(fixedValue != null){
                extraVal = fixedValue;
            }
            EnumSign sign = extra.getIncrement();
            switch(sign){
                case increment:
                    break;
                case decrement:
                    extraVal = extraVal * (-1);
                    break;
                    default:;
            }
            result += extraVal;
        }
        return result;
    }
    


    
}
