package fab.shop.api.core.purchase.msg;

import java.util.List;

public class PurchaseConfirmRS {
    private Integer purchaseId;
    private List<String> errorList;

    public Integer getPurchaseId() {
        return this.purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }


    public List<String> getErrorList() {
        return this.errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }



    @Override
    public String toString() {
        return "{" +
            " purchaseId='" + getPurchaseId() + "'" +
            ", errorList='" + getErrorList() + "'" +
            "}";
    }



}

