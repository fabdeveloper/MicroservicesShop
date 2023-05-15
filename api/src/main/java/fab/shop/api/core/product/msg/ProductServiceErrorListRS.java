package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceErrorListRS {
    
    private List<String> errorList;


    public ProductServiceErrorListRS() {
    }

    public ProductServiceErrorListRS(List<String> errorList) {
        this.errorList = errorList;
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

    

    public void addError(String error){
        getErrorList().add(error);
    }



    
    @Override
    public String toString() {
        String errorListString = "{ ";
        for(String error : getErrorList()){
            errorListString += error;
            errorListString += ", ";
        }
        errorListString += " }";

        return "{" +
            " errorList='" + errorListString + "'" +
            "}";
    }

}
