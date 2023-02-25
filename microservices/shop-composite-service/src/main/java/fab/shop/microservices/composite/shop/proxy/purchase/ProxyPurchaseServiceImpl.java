package fab.shop.microservices.composite.shop.proxy.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import fab.shop.api.core.purchase.msg.*;

@Component
public class ProxyPurchaseServiceImpl implements IProxyPurchaseService{

    
    private final RestTemplate restTemplate;

    private final String purchaseServiceUrl;


    @Autowired
    public ProxyPurchaseServiceImpl(RestTemplate restTemplate,                                    
                                    @Value("${app.purchase-service.host}") String purchaseServiceHost, 
                                    @Value("${app.purchase-service.port}") int purchaseServicePort   ) {
        this.restTemplate = restTemplate;
        this.purchaseServiceUrl = "http://" + purchaseServiceHost + ":" + purchaseServicePort + "/purchase";
    }


    @Override
    public PurchaseModificationRS purchaseModification(PurchaseModificationRQ purchaseModificationRQ) {
        return restTemplate.postForObject(getPurchaseServiceUrl() + "/purchaseModification", purchaseModificationRQ, PurchaseModificationRS.class);
    }

    @Override
    public PurchaseCancelRS purchaseCancel(PurchaseCancelRQ purchaseCancelRQ) {
        return restTemplate.postForObject(getPurchaseServiceUrl() + "/purchaseCancel", purchaseCancelRQ, PurchaseCancelRS.class);
    }

    @Override
    public GetPurchaseRS getPurchase(GetPurchaseRQ getPurchaseRQ) {
        return restTemplate.postForObject(getPurchaseServiceUrl() + "/getPurchase", getPurchaseRQ, GetPurchaseRS.class);
    }
    
    @Override
    public GetPurchaseListRS getPurchaseList(GetPurchaseListRQ getPurchaseListRQ) {
        return restTemplate.postForObject(getPurchaseServiceUrl() + "/getPurchaseList", getPurchaseListRQ, GetPurchaseListRS.class);
    }

    @Override
    public PurchaseConfirmRS purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        return restTemplate.postForObject(getPurchaseServiceUrl() + "/purchaseConfirm", purchaseConfirmRQ, PurchaseConfirmRS.class);
    }


    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }


    public String getPurchaseServiceUrl() {
        return this.purchaseServiceUrl;
    }


    
}
