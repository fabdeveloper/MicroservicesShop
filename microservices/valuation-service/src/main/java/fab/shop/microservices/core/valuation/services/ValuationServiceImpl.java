package fab.shop.microservices.core.valuation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.valuation.msg.*;
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
        // TODO Auto-generated method stub
        return null;
    }


    // @Override
    // public ValuationRS valuate(ValuationRQ valuationRQ) {

    //     List<Product> productList = valuationRQ.getProductList();

    //     Float total = 0.0f;
    //     Integer itemsCount = 0;
    //     for(Product product : productList){
    //         Float productPrice = product.getPrice();

    //         total += productPrice;
    //         itemsCount++;
    //     }

    //     ValuationRS valuationRs = new ValuationRS(itemsCount, total, productList, getServiceUtil().getServiceAddress());

    //     return valuationRs;
    // }


    // public ServiceUtil getServiceUtil() {
    //     return this.serviceUtil;
    // }


    
}
