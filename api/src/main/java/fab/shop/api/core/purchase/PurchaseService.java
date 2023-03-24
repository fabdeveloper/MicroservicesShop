package fab.shop.api.core.purchase;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import fab.shop.api.core.purchase.msg.*;


public interface PurchaseService {
	
	// @PostMapping(
	// 	value = "/purchase/purchaseConfirm",
	// 	consumes = "application/json",
	// 	produces = "application/json")
	// 	PurchaseConfirmRS createPurchase(@RequestBody PurchaseConfirmRQ purchaseConfirmRQ);

	@PostMapping(
			value = "/purchase/purchaseModification",
			consumes = "application/json",
			produces = "application/json")
		  PurchaseModificationRS purchaseModification(@RequestBody PurchaseModificationRQ purchaseModificationRQ);

	@PostMapping(
			value = "/purchase/purchaseCancel",
			consumes = "application/json",
			produces = "application/json")
		  PurchaseCancelRS purchaseCancel(@RequestBody PurchaseCancelRQ purchaseCancelRQ);

	@PostMapping(
			value = "/purchase/getPurchase",
			consumes = "application/json",
			produces = "application/json")
		  GetPurchaseRS getPurchase(@RequestBody GetPurchaseRQ getPurchaseRQ);

	@PostMapping(
			value = "/purchase/getPurchaseList",
			consumes = "application/json",
			produces = "application/json")
		  GetPurchaseListRS getPurchaseList(@RequestBody GetPurchaseListRQ getPurchaseListRQ);




	@PostMapping(
			value = "/purchase/confirm",
			consumes = "application/json",
			produces = "application/json")
			PurchaseConfirmRS purchaseConfirm(@RequestBody PurchaseConfirmRQ purchaseConfirmRQ);

}
