package fab.shop.api.composite;

import org.springframework.web.bind.annotation.PostMapping;

import fab.shop.api.composite.msg.EShopProductConfirmRQ;
import fab.shop.api.composite.msg.EShopProductConfirmRS;
import fab.shop.api.composite.msg.EShopPurchaseConfirmRQ;
import fab.shop.api.composite.msg.EShopPurchaseConfirmRS;

public interface IEShop {
    
    @PostMapping(
		value = "/eshop/productconfirm",
		consumes = "application/json",
		produces = "application/json")
    public EShopProductConfirmRS eShopProductConfirm(EShopProductConfirmRQ eShopProductConfirmRQ);

    @PostMapping(
		value = "/eshop/purchaseconfirm",
		consumes = "application/json",
		produces = "application/json")
    public EShopPurchaseConfirmRS eShopPurchaseConfirm(EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ);
}
