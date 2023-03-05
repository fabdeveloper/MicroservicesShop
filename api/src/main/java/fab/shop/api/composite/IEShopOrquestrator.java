package fab.shop.api.composite;

import fab.shop.api.composite.msg.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IEShopOrquestrator {

	@PostMapping(
		value = "/eshop/orquestrator/productconfirm",
		consumes = "application/json",
		produces = "application/json")
    public EShopProductConfirmRS eShopProductConfirm(@RequestBody EShopProductConfirmRQ eShopProductConfirmRQ);

    
		@PostMapping(
			value = "/eshop/orquestrator/purchaseconfirm",
			consumes = "application/json",
			produces = "application/json")
			EShopPurchaseConfirmRS eShopPurchaseConfirm(@RequestBody EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ);


		// @PostMapping(
		// 	value = "/shop/eshoppurchasemodification",
		// 	consumes = "application/json",
		// 	produces = "application/json")
		// 	EShopPurchaseModificationRS eShopPurchaseModification(@RequestBody EShopPurchaseModificationRQ eShopPurchaseModificationRQ);


		// @PostMapping(
		// 	value = "/shop/eshoppurchasecancel",
		// 	consumes = "application/json",
		// 	produces = "application/json")
		// 	EShopPurchaseCancelRS eShopPurchaseCancel(@RequestBody EShopPurchaseCancelRQ eShopPurchaseCancelRQ);
    
}
