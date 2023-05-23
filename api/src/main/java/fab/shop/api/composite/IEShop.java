package fab.shop.api.composite;

import org.springframework.web.bind.annotation.PostMapping;

import fab.shop.api.composite.msg.EShopProductBookingRQ;
import fab.shop.api.composite.msg.EShopProductBookingRS;
import fab.shop.api.composite.msg.EShopPurchaseConfirmRQ;
import fab.shop.api.composite.msg.EShopPurchaseConfirmRS;

public interface IEShop {
    
    @PostMapping(
		value = "/eshop/productBooking",
		consumes = "application/json",
		produces = "application/json")
    public EShopProductBookingRS eShopProductBooking(EShopProductBookingRQ eShopProductBookingRQ);

    @PostMapping(
		value = "/eshop/purchaseConfirm",
		consumes = "application/json",
		produces = "application/json")
    public EShopPurchaseConfirmRS eShopPurchaseConfirm(EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ);
}
