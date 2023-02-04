package fab.shop.api.composite.msg;

import java.util.*;
import java.io.Serializable;


public class EShopPurchaseConfirmRS implements Serializable{

    private Integer shopId;
    private Integer userId;
    private Integer confirmationCode;
    private List<String> errorList;
    

    public EShopPurchaseConfirmRS() {
    }

    public EShopPurchaseConfirmRS(Integer shopId, Integer userId, Integer confirmationCode, List<String> errorList) {
        this.shopId = shopId;
        this.userId = userId;
        this.confirmationCode = confirmationCode;
        this.errorList = errorList;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getConfirmationCode() {
        return this.confirmationCode;
    }

    public void setConfirmationCode(Integer confirmationCode) {
        this.confirmationCode = confirmationCode;
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

    public EShopPurchaseConfirmRS shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public EShopPurchaseConfirmRS userId(Integer userId) {
        setUserId(userId);
        return this;
    }

    public EShopPurchaseConfirmRS confirmationCode(Integer confirmationCode) {
        setConfirmationCode(confirmationCode);
        return this;
    }

    public EShopPurchaseConfirmRS errorList(List<String> errorList) {
        setErrorList(errorList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EShopPurchaseConfirmRS)) {
            return false;
        }
        EShopPurchaseConfirmRS eShopPurchaseConfirmRS = (EShopPurchaseConfirmRS) o;
        return Objects.equals(shopId, eShopPurchaseConfirmRS.shopId) && Objects.equals(userId, eShopPurchaseConfirmRS.userId) && Objects.equals(confirmationCode, eShopPurchaseConfirmRS.confirmationCode) && Objects.equals(errorList, eShopPurchaseConfirmRS.errorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, userId, confirmationCode, errorList);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", confirmationCode='" + getConfirmationCode() + "'" +
            ", errorList='" + getErrorList() + "'" +
            "}";
    }


}
