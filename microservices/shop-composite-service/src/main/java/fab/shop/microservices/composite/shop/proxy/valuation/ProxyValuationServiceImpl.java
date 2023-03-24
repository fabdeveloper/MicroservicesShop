package fab.shop.microservices.composite.shop.proxy.valuation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import fab.shop.api.core.valuation.msg.*;

@Component
public class ProxyValuationServiceImpl implements IProxyValuationService {
    
    private final RestTemplate restTemplate;

    private final String valuationServiceUrl;


    @Autowired
    public ProxyValuationServiceImpl(RestTemplate restTemplate,
                                    @Value("${app.valuation-service.host}") String valuationServiceHost, 
                                    @Value("${app.valuation-service.port}") int valuationServicePort) {
        this.restTemplate = restTemplate;
        this.valuationServiceUrl = "http://" + valuationServiceHost + ":" + valuationServicePort + "/valuation";
    }




    @Override
    public ValuationRS valuate(ValuationRQ valuationRQ){
        return restTemplate.postForObject(getValuationServiceUrl() + "/valuate", valuationRQ, ValuationRS.class);
    }


    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }


    public String getValuationServiceUrl() {
        return this.valuationServiceUrl;
    }



    
}
