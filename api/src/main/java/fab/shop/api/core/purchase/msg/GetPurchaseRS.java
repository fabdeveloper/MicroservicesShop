package fab.shop.api.core.purchase.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.purchase.transfer.Purchase;

public class GetPurchaseRS {
 
    private Purchase purchase;

    private List<String> errorList;


    public GetPurchaseRS() {
    }


    public GetPurchaseRS(Purchase purchase, List<String> errorList) {
        this.purchase = purchase;
        this.errorList = errorList;
    }



    public Purchase getPurchase() {
        return this.purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
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

    public void addError(String sError){
        getErrorList().add(sError);
    }



    @Override
    public String toString() {
        return "{" +
            " purchase='" + getPurchase() + "'" +
            ", errorList='" + getErrorList() + "'" +
            "}";
    }


}
