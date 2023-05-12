package fab.shop.microservices.composite.shop.proxy.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.transaction.annotation.Transactional;
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
        return restTemplate.postForObject(getProductServiceUrl() + "/getAvail", getAvailRQ, GetAvailRS.class);
    }

    @Override
    public GetOfferListDetailRS getOfferListDetail(GetOfferListDetailRQ getOfferListDetailRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/getOfferListDetail", getOfferListDetailRQ, GetOfferListDetailRS.class);
    }

    @Override
    public ProductBookingRS productConfirm(ProductBookingRQ productConfirmRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/productConfirm", productConfirmRQ, ProductBookingRS.class);
    }

    @Override
    public ProductPurchaseConfirmRS productPurchaseConfirm(ProductPurchaseConfirmRQ productPurchaseConfirmRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/productPurchaseConfirm", productPurchaseConfirmRQ, ProductPurchaseConfirmRS.class);
    }

    @Override
    public ProductPurchaseCancelRS productPurchaseCancel(ProductPurchaseCancelRQ productPurchaseCancelRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/productPurchaseCancel", productPurchaseCancelRQ, ProductPurchaseCancelRS.class);
    }

    @Override
    public ProductCreateNewRS productCreateNew(ProductConfigBasicRQ productCreateNewRQ) {
        return restTemplate.postForObject(getProductServiceUrl() + "/productCreateNew", productCreateNewRQ, ProductCreateNewRS.class);
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
