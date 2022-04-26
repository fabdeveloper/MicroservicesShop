package fab.shop.api.core.valuation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ValuationService {

    @PostMapping(
        value = "/valuation/valuate",
        consumes = "application/json",
        produces = "application/json")
        ValuationRS valuate(@RequestBody ValuationRQ valuationRQ);
    
}
