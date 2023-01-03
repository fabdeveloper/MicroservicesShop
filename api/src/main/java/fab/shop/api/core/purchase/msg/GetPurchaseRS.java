package fab.shop.api.core.purchase.msg;

import java.util.List;

import fab.shop.api.core.purchase.Purchase;

public class GetPurchaseRS {
 
    private Purchase purchase;

    private List<String> errorList;


    public Purchase getPurchase() {
        return this.purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
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
            " purchase='" + getPurchase() + "'" +
            ", errorList='" + getErrorList() + "'" +
            "}";
    }


}
