package fab.shop.api.core.product.msg;

import java.util.List;
import java.util.Objects;

import fab.shop.api.composite.transfer.PurchaseItem;
import fab.shop.api.core.product.transfer.OfferPurchase;

public class ProductConfirmRQ {
    
    private Integer shopId;
    private List<OfferPurchase> offerPurchaseList;



    public ProductConfirmRQ() {
    }



    public ProductConfirmRQ(Integer shopId, List<OfferPurchase> offerPurchaseList) {
		super();
		this.shopId = shopId;
		this.offerPurchaseList = offerPurchaseList;
	}



	public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }



    public List<OfferPurchase> getOfferPurchaseList() {
		return offerPurchaseList;
	}



	public void setOfferPurchaseList(List<OfferPurchase> offerPurchaseList) {
		this.offerPurchaseList = offerPurchaseList;
	}



    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", purchaseItemsList='" + getOfferPurchaseList() + "'" +
            "}";
    }

    
    
}
