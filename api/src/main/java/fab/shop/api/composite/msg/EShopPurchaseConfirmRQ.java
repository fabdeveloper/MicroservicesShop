package fab.shop.api.composite.msg;

import java.util.*;

import fab.shop.api.composite.transfer.PurchaseItem;
import fab.shop.api.core.purchase.transfer.PaymentTypeEnum;

public class EShopPurchaseConfirmRQ {

    private Integer shopId;
    private Integer userId;
    private String userEmail;
    private List<PurchaseItem> purchaseList;

    private String customerName;
    private String deliveryAddress;
    private String deliveryPhoneNumber;

    private String deliveryRemarks;
    private String deliveryStatus;

    private String paymentStatus;
    private PaymentTypeEnum paymentType;



    public EShopPurchaseConfirmRQ() {
    }

    public EShopPurchaseConfirmRQ(Integer shopId, Integer userId, String userEmail, List<PurchaseItem> purchaseList, String customerName, String deliveryAddress, String deliveryPhoneNumber, String deliveryRemarks, String deliveryStatus, String paymentStatus, PaymentTypeEnum paymentType) {
        this.shopId = shopId;
        this.userId = userId;
        this.userEmail = userEmail;
        this.purchaseList = purchaseList;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPhoneNumber = deliveryPhoneNumber;
        this.deliveryRemarks = deliveryRemarks;
        this.deliveryStatus = deliveryStatus;
        this.paymentStatus = paymentStatus;
        this.paymentType = paymentType;
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

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public List<PurchaseItem> getPurchaseList() {
        return this.purchaseList;
    }

    public void setPurchaseList(List<PurchaseItem> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryPhoneNumber() {
        return this.deliveryPhoneNumber;
    }

    public void setDeliveryPhoneNumber(String deliveryPhoneNumber) {
        this.deliveryPhoneNumber = deliveryPhoneNumber;
    }

    public String getDeliveryRemarks() {
        return this.deliveryRemarks;
    }

    public void setDeliveryRemarks(String deliveryRemarks) {
        this.deliveryRemarks = deliveryRemarks;
    }

    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentTypeEnum getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(PaymentTypeEnum paymentType) {
        this.paymentType = paymentType;
    }

    public EShopPurchaseConfirmRQ shopId(Integer shopId) {
        setShopId(shopId);
        return this;
    }

    public EShopPurchaseConfirmRQ userId(Integer userId) {
        setUserId(userId);
        return this;
    }

    public EShopPurchaseConfirmRQ userEmail(String userEmail) {
        setUserEmail(userEmail);
        return this;
    }

    public EShopPurchaseConfirmRQ purchaseList(List<PurchaseItem> purchaseList) {
        setPurchaseList(purchaseList);
        return this;
    }

    public EShopPurchaseConfirmRQ customerName(String customerName) {
        setCustomerName(customerName);
        return this;
    }

    public EShopPurchaseConfirmRQ deliveryAddress(String deliveryAddress) {
        setDeliveryAddress(deliveryAddress);
        return this;
    }

    public EShopPurchaseConfirmRQ deliveryPhoneNumber(String deliveryPhoneNumber) {
        setDeliveryPhoneNumber(deliveryPhoneNumber);
        return this;
    }

    public EShopPurchaseConfirmRQ deliveryRemarks(String deliveryRemarks) {
        setDeliveryRemarks(deliveryRemarks);
        return this;
    }

    public EShopPurchaseConfirmRQ deliveryStatus(String deliveryStatus) {
        setDeliveryStatus(deliveryStatus);
        return this;
    }

    public EShopPurchaseConfirmRQ paymentStatus(String paymentStatus) {
        setPaymentStatus(paymentStatus);
        return this;
    }

    public EShopPurchaseConfirmRQ paymentType(PaymentTypeEnum paymentType) {
        setPaymentType(paymentType);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EShopPurchaseConfirmRQ)) {
            return false;
        }
        EShopPurchaseConfirmRQ eShopPurchaseConfirmRQ = (EShopPurchaseConfirmRQ) o;
        return Objects.equals(shopId, eShopPurchaseConfirmRQ.shopId) && Objects.equals(userId, eShopPurchaseConfirmRQ.userId) && Objects.equals(userEmail, eShopPurchaseConfirmRQ.userEmail) && Objects.equals(purchaseList, eShopPurchaseConfirmRQ.purchaseList) && Objects.equals(customerName, eShopPurchaseConfirmRQ.customerName) && Objects.equals(deliveryAddress, eShopPurchaseConfirmRQ.deliveryAddress) && Objects.equals(deliveryPhoneNumber, eShopPurchaseConfirmRQ.deliveryPhoneNumber) && Objects.equals(deliveryRemarks, eShopPurchaseConfirmRQ.deliveryRemarks) && Objects.equals(deliveryStatus, eShopPurchaseConfirmRQ.deliveryStatus) && Objects.equals(paymentStatus, eShopPurchaseConfirmRQ.paymentStatus) && Objects.equals(paymentType, eShopPurchaseConfirmRQ.paymentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, userId, userEmail, purchaseList, customerName, deliveryAddress, deliveryPhoneNumber, deliveryRemarks, deliveryStatus, paymentStatus, paymentType);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", userEmail='" + getUserEmail() + "'" +
            ", purchaseList='" + getPurchaseList() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", deliveryAddress='" + getDeliveryAddress() + "'" +
            ", deliveryPhoneNumber='" + getDeliveryPhoneNumber() + "'" +
            ", deliveryRemarks='" + getDeliveryRemarks() + "'" +
            ", deliveryStatus='" + getDeliveryStatus() + "'" +
            ", paymentStatus='" + getPaymentStatus() + "'" +
            ", paymentType='" + getPaymentType() + "'" +
            "}";
    }

    
}
