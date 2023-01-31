package fab.shop.microservices.composite.shop.integrationtester;

import fab.shop.api.core.purchase.msg.GetPurchaseListRQ;
import fab.shop.api.core.purchase.msg.GetPurchaseListRS;
import fab.shop.api.core.purchase.msg.GetPurchaseRQ;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.composite.integrationtester.IShopIntegrationPurchaseServiceTester;
import fab.shop.api.core.purchase.msg.GetPurchaseRS;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRQ;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;
import fab.shop.api.core.purchase.transfer.CartDetail;
import fab.shop.api.core.purchase.transfer.CartItem;
import fab.shop.api.core.purchase.transfer.DeliveryDetail;
import fab.shop.api.core.purchase.transfer.PaymentDetail;
import fab.shop.api.core.purchase.transfer.PaymentTypeEnum;
import fab.shop.api.core.purchase.transfer.Purchase;
import fab.shop.api.core.purchase.transfer.UserDetail;
import fab.shop.microservices.composite.shop.services.ShopCompositeIntegration;



@RestController
public class ShopIntegrationPurchaseServiceTesterImpl implements IShopIntegrationPurchaseServiceTester {

    private static final Logger logger = LoggerFactory.getLogger(ShopIntegrationPurchaseServiceTesterImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ShopCompositeIntegration shopIntegration;




    public RestTemplate getRestTemplate() {
        return this.restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ShopCompositeIntegration getShopIntegration() {
        return this.shopIntegration;
    }

    public void setShopIntegration(ShopCompositeIntegration shopIntegration) {
        this.shopIntegration = shopIntegration;
    }


    @Override
    public PurchaseConfirmRS purchaseConfirmTestHelper() {

        String sLogMsg = "confirmando purchase ...*************************";
        logger.info(sLogMsg);
        System.out.println(sLogMsg);

        UserDetail user = new UserDetail(null, 1, 1, "user@email.com", "55555555555");

        List<CartItem> itemsList = new ArrayList<>();
        CartItem item = new CartItem(null, null, 2, 1, "offer name", "offer description", 4.95f);
        itemsList.add(item);
        CartDetail cart = new CartDetail(null, itemsList, 9.9f, 5, 1);
        DeliveryDetail delivery = new DeliveryDetail(null, "customer name", "delivery address", "5555555555", "delivery remarks", null, null);
        PaymentDetail payment = new PaymentDetail(null, "ok", PaymentTypeEnum.debitcard, new Date(), null);

        Purchase purchase = new Purchase(null, 1, 5, new Date(), null, "purchase remarks", user, cart, delivery, payment);
        PurchaseConfirmRQ rq = new PurchaseConfirmRQ(purchase);
        PurchaseConfirmRS rs = null;

        rs = restTemplate.postForObject(getShopIntegration().getPurchaseServiceUrl() + "/confirm", rq, PurchaseConfirmRS.class);





        return rs;
    }

    @Override
    public GetPurchaseRS getPurchaseTestHelper() {
        GetPurchaseRS rs = null;
        Integer purchaseId = 6;
        GetPurchaseRQ rq = new GetPurchaseRQ(purchaseId);
        rs = restTemplate.postForObject(getShopIntegration().getPurchaseServiceUrl() + "/getPurchase", rq, GetPurchaseRS.class);

        return rs;
    }

    @Override
    public GetPurchaseListRS getPurchaseListTestHelper() {
        GetPurchaseListRS rs = null;
        Integer userId = 1;
        Integer shopId = 1;

        GetPurchaseListRQ rq = new GetPurchaseListRQ(userId, shopId);
        rs = restTemplate.postForObject(getShopIntegration().getPurchaseServiceUrl() + "/getPurchaseList", rq, GetPurchaseListRS.class);

        return rs;
    }
    
}
