package fab.shop.api.core.purchase.msg;

import java.util.List;

public class PurchaseConfirmRS {
    private Integer purchaseId;
    private List<String> errorList;
    private String status;

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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
            " purchaseId='" + getPurchaseId() + "'" +
            ", errorList='" + getErrorList() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }






}

