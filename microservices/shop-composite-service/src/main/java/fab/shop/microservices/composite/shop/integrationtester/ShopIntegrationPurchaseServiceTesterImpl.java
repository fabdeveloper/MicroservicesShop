package fab.shop.microservices.composite.shop.integrationtester;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fab.shop.api.composite.integrationtester.IShopIntegrationPurchaseServiceTester;
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
    public PurchaseConfirmRS productPurchaseConfirmTestHelper() {

        UserDetail user = new UserDetail(null, 1, 1, "user@email.com", "55555555555");

        List<CartItem> itemsList = new ArrayList<>();
        CartItem item = new CartItem(null, null, 2, 1, "offer name", "offer description", 4.95f);
        itemsList.add(item);
        CartDetail cart = new CartDetail(null, itemsList, 9.9f, 5, 1);
        DeliveryDetail delivery = new DeliveryDetail(null, "customer name", "delivery address", "5555555555", "delivery remarks", null, null);
        PaymentDetail payment = new PaymentDetail(null, "ok", PaymentTypeEnum.debitcard, new Date(), null);

        Purchase purchase = new Purchase(null, new Date(), null, "purchase remarks", user, cart, delivery, payment);
        PurchaseConfirmRQ rq = new PurchaseConfirmRQ(purchase);
        PurchaseConfirmRS rs = null;

        rs = restTemplate.postForObject(getShopIntegration().getPurchaseServiceUrl() + "/purchase/confirm", rq, PurchaseConfirmRS.class);





        return rs;
    }
    
}
