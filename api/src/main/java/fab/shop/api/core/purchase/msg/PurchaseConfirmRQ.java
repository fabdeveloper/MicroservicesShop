package fab.shop.api.core.purchase.msg;

import java.util.List;
import java.util.Objects;

import fab.shop.api.core.product.Product;
import fab.shop.api.core.purchase.transfer.Purchase;

public class PurchaseConfirmRQ {

    private Purchase purchase;


    public PurchaseConfirmRQ() {
    }

    public PurchaseConfirmRQ(Purchase purchase) {
        this.purchase = purchase;
    }

    public Purchase getPurchase() {
        return this.purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public PurchaseConfirmRQ purchase(Purchase purchase) {
        setPurchase(purchase);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PurchaseConfirmRQ)) {
            return false;
        }
        PurchaseConfirmRQ purchaseConfirmRQ = (PurchaseConfirmRQ) o;
        return Objects.equals(purchase, purchaseConfirmRQ.purchase);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(purchase);
    }

    @Override
    public String toString() {
        return "{" +
            " purchase='" + getPurchase() + "'" +
            "}";
    }

 
 
 /**********************************
  * 

    private List<Product> productList;
    private Float valuation;
    private Integer userId;
    private String userName;
    private String userEmail;
    private String shipmentType;
    private String shipmentAddress;
    private String paymentType;
    private String paymentStatus;
    


    public List<Product> getProductList() {
        return this.productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Float getValuation() {
        return this.valuation;
    }

    public void setValuation(Float valuation) {
        this.valuation = valuation;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getShipmentType() {
        return this.shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public String getShipmentAddress() {
        return this.shipmentAddress;
    }

    public void setShipmentAddress(String shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    ****************************************** */

}
