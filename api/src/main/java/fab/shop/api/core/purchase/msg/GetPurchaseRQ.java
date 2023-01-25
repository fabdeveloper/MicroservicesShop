package fab.shop.api.core.purchase.msg;

import java.util.Objects;

public class GetPurchaseRQ {
    
    private Integer purchaseId;


    public Integer getPurchaseId() {
        return this.purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }



    public GetPurchaseRQ() {
    }

    public GetPurchaseRQ(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public GetPurchaseRQ purchaseId(Integer purchaseId) {
        setPurchaseId(purchaseId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GetPurchaseRQ)) {
            return false;
        }
        GetPurchaseRQ getPurchaseRQ = (GetPurchaseRQ) o;
        return Objects.equals(purchaseId, getPurchaseRQ.purchaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(purchaseId);
    }

    @Override
    public String toString() {
        return "{" +
            " purchaseId='" + getPurchaseId() + "'" +
            "}";
    }


}


