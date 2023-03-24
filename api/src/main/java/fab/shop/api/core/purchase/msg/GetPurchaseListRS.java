package fab.shop.api.core.purchase.msg;

import java.util.ArrayList;
import java.util.List;

import fab.shop.api.core.purchase.transfer.Purchase;

public class GetPurchaseListRS {
    private List<Purchase> purchaseList;

    private List<String> errorList;



    public GetPurchaseListRS() {
    }


    public GetPurchaseListRS(List<Purchase> purchaseList, List<String> errorList) {
        this.purchaseList = purchaseList;
        this.errorList = errorList;
    }


    public List<Purchase> getPurchaseList() {
        return this.purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
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
        String sPurchaseList = "{ ";
        for(Purchase purchase : getPurchaseList()){
            sPurchaseList += purchase.toString();
            sPurchaseList += " ,";        
        }
        sPurchaseList += " }";
        String sErrorList = "{ ";
        for(String sError : getErrorList()){
            sErrorList += sError;
            sErrorList += " ,";        
        }
        sErrorList += " }";
        return "{" +
            " purchaseList='" + sPurchaseList + "'" +
            ", errorList='" + sErrorList + "'" +
            "}";
    }



}
