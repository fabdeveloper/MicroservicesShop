package fab.shop.microservices.composite.shop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.composite.PurchaseConfirmRQ;
import fab.shop.api.composite.ShopService;
import fab.shop.api.core.cart.AddToCartRQ;
import fab.shop.api.core.cart.AddToCartRS;
import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.purchase.Purchase;
import fab.shop.api.core.valuation.ValuationRQ;
import fab.shop.api.core.valuation.ValuationRS;

@RestController
public class ShopCompositeServiceImpl implements ShopService {

    private final ShopCompositeIntegration shopIntegration;
    private final ServiceUtil serviceUtil;


    @Autowired
    public ShopCompositeServiceImpl(ShopCompositeIntegration shopIntegration, ServiceUtil serviceUtil) {
        this.shopIntegration = shopIntegration;
        this.serviceUtil = serviceUtil;
    }



    @Override
    public List<Product> getAvail() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product getProduct(int productId) {
        return shopIntegration.getProduct(productId);
    }

    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {
        return shopIntegration.addToCart(addToCartRq);
    }

    @Override
    public Purchase purchaseConfirm(PurchaseConfirmRQ purchaseConfirmR) {
        return shopIntegration.purchaseConfirm(purchaseConfirmR);
    }

    @Override
    public ValuationRS getValuation(ValuationRQ valuationRQ) {
        return shopIntegration.valuate(valuationRQ);
    }

    @Override
    public Product getPurchase(int purchaseId) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public AddToCartRS cartTestHelper() {
        //System.out.println("cartTestHelper() llamando a cart-service con producto : " + getProduct(6));
        //return addToCart(getProduct(6), 0);

        Product product = shopIntegration.getProduct(6);
        AddToCartRQ addToCart = new AddToCartRQ(product, -2);

        return shopIntegration.addToCart(addToCart);
    }


    

    @Override
    public Purchase purchaseConfirmTestHelper() {

        Cart cart = cartTestHelper().getCart();
        Integer userId = 111;
        String shipmentAddress = "mi casa 1";
        String paymentMethod = "credit card";
        Float valuation = (float) 99.99;

        PurchaseConfirmRQ purchaseConfirmRQ = new PurchaseConfirmRQ(cart, userId, shipmentAddress, paymentMethod, valuation);

        return purchaseConfirm(purchaseConfirmRQ);
    }



    @Override
    public ValuationRS valuationTestHelper() {

        Product product = shopIntegration.getProduct(6);
        AddToCartRQ addToCartRQ1 = new AddToCartRQ(product, -2);

        Cart cart1 =  shopIntegration.addToCart(addToCartRQ1).getCart();
        AddToCartRQ addToCartRQ2 = new AddToCartRQ(product, cart1.getCartId());
        Cart cart2 = shopIntegration.addToCart(addToCartRQ2).getCart();

        ValuationRQ valuationRQ = new ValuationRQ(cart2.getProductList(), null);
        ValuationRS valuationRS = shopIntegration.valuate(valuationRQ);


        return valuationRS;
    }




    
}
