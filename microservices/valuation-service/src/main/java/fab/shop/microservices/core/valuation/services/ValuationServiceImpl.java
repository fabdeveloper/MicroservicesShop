package fab.shop.microservices.core.valuation.services;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import fab.shop.api.core.product.Product;
import fab.shop.api.core.valuation.ValuationRQ;
import fab.shop.api.core.valuation.ValuationRS;
import fab.shop.api.core.valuation.ValuationService;

@RestController
public class ValuationServiceImpl implements ValuationService{

    @Override
    public ValuationRS valuate(ValuationRQ valuationRQ) {

        List<Product> productList = valuationRQ.getProductList();

        Float total = 0.0f;
        Integer itemsCount = 0;
        for(Product product : productList){
            Float productPrice = product.getPrice();

            total += productPrice;
            itemsCount++;
        }

        ValuationRS valuationRs = new ValuationRS(itemsCount, total, productList);

        return valuationRs;
    }
    
}
