package fab.shop.api.composite.msg;

import java.util.*;

import fab.shop.api.composite.transfer.PurchaseItem;
import fab.shop.api.core.product.transfer.OfferPurchase;
import fab.shop.api.core.purchase.transfer.PaymentStatusTypeEnum;
import fab.shop.api.core.purchase.transfer.PaymentTypeEnum;

public class EShopPurchaseConfirmRQ {
    private Integer shopId;
    private Integer userId;
    private List<OfferPurchase> purchaseList;
    private Integer productBookingNumber;
    private Date productBookingTime;
    private Integer cartId;

    private String customerName;
    private String deliveryAddress;
    private String deliveryPhoneNumber;
    private String userEmail;
    private String deliveryRemarks;
    private String deliveryStatus;

    private PaymentStatusTypeEnum paymentStatus;
    private PaymentTypeEnum paymentType;



    public EShopPurchaseConfirmRQ() {
    }

    public EShopPurchaseConfirmRQ(Integer shopId, Integer userId, List<OfferPurchase> purchaseList, Integer productBookingNumber, Date productBookingTime, Integer cartId, String customerName, String deliveryAddress, String deliveryPhoneNumber, String userEmail, String deliveryRemarks, String deliveryStatus, PaymentStatusTypeEnum paymentStatus, PaymentTypeEnum paymentType) {
        this.shopId = shopId;
        this.userId = userId;
        this.purchaseList = purchaseList;
        this.productBookingNumber = productBookingNumber;
        this.productBookingTime = productBookingTime;
        this.cartId = cartId;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPhoneNumber = deliveryPhoneNumber;
        this.userEmail = userEmail;
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

    public List<OfferPurchase> getPurchaseList() {
        return this.purchaseList;
    }

    public void setPurchaseList(List<OfferPurchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public Integer getProductBookingNumber() {
        return this.productBookingNumber;
    }

    public void setProductBookingNumber(Integer productBookingNumber) {
        this.productBookingNumber = productBookingNumber;
    }

    public Date getProductBookingTime() {
        return this.productBookingTime;
    }

    public void setProductBookingTime(Date productBookingTime) {
        this.productBookingTime = productBookingTime;
    }

    public Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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

    public PaymentStatusTypeEnum getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusTypeEnum paymentStatus) {
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

    public EShopPurchaseConfirmRQ purchaseList(List<OfferPurchase> purchaseList) {
        setPurchaseList(purchaseList);
        return this;
    }

    public EShopPurchaseConfirmRQ productBookingNumber(Integer productBookingNumber) {
        setProductBookingNumber(productBookingNumber);
        return this;
    }

    public EShopPurchaseConfirmRQ productBookingTime(Date productBookingTime) {
        setProductBookingTime(productBookingTime);
        return this;
    }

    public EShopPurchaseConfirmRQ cartId(Integer cartId) {
        setCartId(cartId);
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

    public EShopPurchaseConfirmRQ userEmail(String userEmail) {
        setUserEmail(userEmail);
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

    public EShopPurchaseConfirmRQ paymentStatus(PaymentStatusTypeEnum paymentStatus) {
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
        return Objects.equals(shopId, eShopPurchaseConfirmRQ.shopId) && Objects.equals(userId, eShopPurchaseConfirmRQ.userId) && Objects.equals(purchaseList, eShopPurchaseConfirmRQ.purchaseList) && Objects.equals(productBookingNumber, eShopPurchaseConfirmRQ.productBookingNumber) && Objects.equals(productBookingTime, eShopPurchaseConfirmRQ.productBookingTime) && Objects.equals(cartId, eShopPurchaseConfirmRQ.cartId) && Objects.equals(customerName, eShopPurchaseConfirmRQ.customerName) && Objects.equals(deliveryAddress, eShopPurchaseConfirmRQ.deliveryAddress) && Objects.equals(deliveryPhoneNumber, eShopPurchaseConfirmRQ.deliveryPhoneNumber) && Objects.equals(userEmail, eShopPurchaseConfirmRQ.userEmail) && Objects.equals(deliveryRemarks, eShopPurchaseConfirmRQ.deliveryRemarks) && Objects.equals(deliveryStatus, eShopPurchaseConfirmRQ.deliveryStatus) && Objects.equals(paymentStatus, eShopPurchaseConfirmRQ.paymentStatus) && Objects.equals(paymentType, eShopPurchaseConfirmRQ.paymentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, userId, purchaseList, productBookingNumber, productBookingTime, cartId, customerName, deliveryAddress, deliveryPhoneNumber, userEmail, deliveryRemarks, deliveryStatus, paymentStatus, paymentType);
    }

    @Override
    public String toString() {
        return "{" +
            " shopId='" + getShopId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", purchaseList='" + getPurchaseList() + "'" +
            ", productBookingNumber='" + getProductBookingNumber() + "'" +
            ", productBookingTime='" + getProductBookingTime() + "'" +
            ", cartId='" + getCartId() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", deliveryAddress='" + getDeliveryAddress() + "'" +
            ", deliveryPhoneNumber='" + getDeliveryPhoneNumber() + "'" +
            ", userEmail='" + getUserEmail() + "'" +
            ", deliveryRemarks='" + getDeliveryRemarks() + "'" +
            ", deliveryStatus='" + getDeliveryStatus() + "'" +
            ", paymentStatus='" + getPaymentStatus() + "'" +
            ", paymentType='" + getPaymentType() + "'" +
            "}";
    }


    
}
