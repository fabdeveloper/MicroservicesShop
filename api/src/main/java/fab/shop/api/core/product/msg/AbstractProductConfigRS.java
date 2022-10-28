package fab.shop.api.core.product.msg;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProductConfigRS {
    
    private List<String> errorList = new ArrayList<>();


    public AbstractProductConfigRS() {
    }

    public AbstractProductConfigRS(List<String> errorList) {
        this.errorList = errorList;
    }

    public List<String> getErrorList() {
        return this.errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    public AbstractProductConfigRS errorList(List<String> errorList) {
        setErrorList(errorList);
        return this;
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
