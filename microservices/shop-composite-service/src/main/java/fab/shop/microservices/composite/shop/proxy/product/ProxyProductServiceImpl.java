package fab.shop.microservices.composite.shop.proxy.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.core.product.msg.*;

@Component
public class ProxyProductServiceImpl implements IProxyProductService {

    private final RestTemplate restTemplate;
    private final String productServiceUrl;


    @Autowired
    public ProxyProductServiceImpl(RestTemplate restTemplate, 
                                    @Value("${app.product-service.host}") String productServiceHost, 
                                    @Value("${app.product-service.port}") int productServicePort) {
        this.restTemplate = restTemplate;
        this.productServiceUrl = "http://" + productServiceHost + ":" + productServicePort + "/product";
    }
    

    @Override
    public GetAvailRS getAvail(GetAvailRQ getAvailRQ) {
        return null;
    }

    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        return null;
    }

    @Override
    public ProductConfirmRS productConfirm(ProductConfirmRQ productConfirmRQ) {
        return null;
    }

    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        return null;
    }

    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
        return null;
    }

    @Override
    public ProductCreateNewRS testConfig(GenericProductConfigRQ testConfigRQ) {
        return null;
    }


    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }


    public String getProductServiceUrl() {
        return this.productServiceUrl;
    }


}
