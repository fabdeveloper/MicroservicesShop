package fab.shop.api.composite.integrationtester;

import org.springframework.web.bind.annotation.GetMapping;

import fab.shop.api.core.purchase.msg.PurchaseConfirmRS;

public interface IShopIntegrationPurchaseServiceTester {
    
    @GetMapping(
        value = "/shoptester/purchaseservice/testpurchaseconfirm",
        produces = "application/json")
        PurchaseConfirmRS purchaseConfirmTestHelper();
}
