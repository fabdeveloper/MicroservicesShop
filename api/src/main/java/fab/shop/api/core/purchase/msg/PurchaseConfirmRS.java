package fab.shop.api.core.purchase.msg;

import java.util.ArrayList;
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
        if(this.errorList == null){
            this.errorList = new ArrayList<>();
        }
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

    public void addError(String sError){
        getErrorList().add(sError);
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

