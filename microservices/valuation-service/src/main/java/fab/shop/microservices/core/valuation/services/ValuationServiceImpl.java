package fab.shop.microservices.core.valuation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.valuation.msg.*;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.valuation.ValuationService;

@RestController
public class ValuationServiceImpl implements ValuationService{

    private final ServiceUtil serviceUtil;



    @Autowired
    public ValuationServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }



    @Override
    public ValuationRS valuate(ValuationRQ valuationRQ) {
        Float valuation = 0.00f;

        List<Offer> offerList = valuationRQ.getOfferList();
        for(Offer offer : offerList){
            valuation += offer.getPrice();
        }

        ValuationRS valuationRS = new ValuationRS(offerList, valuation);
        return valuationRS;
    }


    


    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }


    
}
