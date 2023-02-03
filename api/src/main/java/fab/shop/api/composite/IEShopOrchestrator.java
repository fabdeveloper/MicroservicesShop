package fab.shop.api.composite;

import fab.shop.api.composite.msg.*;
import org.springframework.web.bind.annotation.RequestBody;

public interface IEShopOrchestrator {

    
		@PostMapping(
			value = "/shop/eshoppurchaseconfirm",
			consumes = "application/json",
			produces = "application/json")
			EShopPurchaseConfirmRS eShopPurchaseConfirm(@RequestBody EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ);
    
}
