package fab.shop.api.core.purchase.msg;

public class PurchaseCancelRS {
    private Integer purchaseId;
    private String status;


    public Integer getPurchaseId() {
        return this.purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
