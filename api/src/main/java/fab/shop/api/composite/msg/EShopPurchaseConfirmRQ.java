package fab.shop.api.composite.msg;

import java.util.*;

import fab.shop.api.composite.transfer.PurchaseItem;
import fab.shop.api.core.product.transfer.OfferPurchase;
import fab.shop.api.core.purchase.transfer.PaymentStatusTypeEnum;
import fab.shop.api.core.purchase.transfer.PaymentTypeEnum;
import fab.shop.api.core.purchase.transfer.Purchase;

public class EShopPurchaseConfirmRQ {
	
	private Purchase purchase;

	public EShopPurchaseConfirmRQ() {
		super();
	}

	public EShopPurchaseConfirmRQ(Purchase purchase) {
		super();
		this.purchase = purchase;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	@Override
	public String toString() {
		return "EShopPurchaseConfirmRQ [purchase=" + purchase.toString() + "]";
	}
	
	
	


    
}
