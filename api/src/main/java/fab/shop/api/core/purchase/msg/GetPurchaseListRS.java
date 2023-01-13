package fab.shop.api.core.purchase.msg;

import java.util.List;

import fab.shop.api.core.purchase.transfer.Purchase;

public class GetPurchaseListRS {
    private List<Purchase> purchaseList;

    private List<String> errorList;




    public List<Purchase> getPurchaseList() {
        return this.purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
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
            " purchaseList='" + getPurchaseList() + "'" +
            ", errorList='" + getErrorList() + "'" +
            "}";
    }



}
