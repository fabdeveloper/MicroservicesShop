package fab.shop.api.composite;

import fab.shop.api.core.cart.Cart;

public class PurchaseConfirmRQ {

    private final Cart cart;
    private final Integer userId;
    private final String shipmentAddress;
    private final String paymentMethod;
    private final Float valuation;



    public PurchaseConfirmRQ(Cart cart, Integer userId, String shipmentAddress, String paymentMethod, Float valuation) {
        this.cart = cart;
        this.userId = userId;
        this.shipmentAddress = shipmentAddress;
        this.paymentMethod = paymentMethod;
        this.valuation = valuation;
    }



    public PurchaseConfirmRQ() {
        this.cart = null;
        this.userId = null;
        this.shipmentAddress = null;
        this.paymentMethod = null;
        this.valuation = null;

    }


    public Cart getCart() {
        return this.cart;
    }


    public Integer getUserId() {
        return this.userId;
    }


    public String getShipmentAddress() {
        return this.shipmentAddress;
    }


    public String getPaymentMethod() {
        return this.paymentMethod;
    }


    public Float getValuation() {
        return this.valuation;
    }



    
}
