package fab.shop.api.composite.integrationtester;

import org.springframework.web.bind.annotation.GetMapping;

import fab.shop.api.core.purchase.msg.GetPurchaseRS;
import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;

public interface IShopIntegrationPurchaseServiceTester {
    
    @GetMapping(
        value = "/shoptester/purchaseservice/testpurchaseconfirm",
        produces = "application/json")
        PurchaseConfirmRS purchaseConfirmTestHelper();




    @GetMapping(
        value = "/shoptester/purchaseservice/testgetpurchase",
        produces = "application/json")
        GetPurchaseRS getPurchaseTestHelper();
}
