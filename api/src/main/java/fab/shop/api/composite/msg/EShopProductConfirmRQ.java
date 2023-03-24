package fab.shop.api.composite.msg;

import java.util.List;
import java.util.Objects;

import fab.shop.api.composite.transfer.PurchaseItem;
import fab.shop.api.core.product.transfer.OfferPurchase;

public class EShopProductConfirmRQ {
    private Integer shopId;
    private Integer userId;
    private List<OfferPurchase> offerPurchaseList;


    public EShopProductConfirmRQ() {
    }


    public EShopProductConfirmRQ(Integer shopId, Integer userId, List<OfferPurchase> offerPurchaseList) {
		super();
		this.shopId = shopId;
		this.userId = userId;
		this.offerPurchaseList = offerPurchaseList;
	}
    
    


	public Integer getShopId() {
		return shopId;
	}


	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public List<OfferPurchase> getOfferPurchaseList() {
		return offerPurchaseList;
	}


	public void setOfferPurchaseList(List<OfferPurchase> offerPurchaseList) {
		this.offerPurchaseList = offerPurchaseList;
	}


	@Override
	public String toString() {
		return "EShopProductConfirmRQ [shopId=" + shopId + ", userId=" + userId + ", offerPurchaseList="
				+ offerPurchaseList + "]";
	}



	
	

}
