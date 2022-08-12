package fab.shop.microservices.composite.shop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.purchase.msg.*;
import fab.shop.api.composite.ShopService;
import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.api.core.purchase.Purchase;
import fab.shop.api.core.valuation.msg.*;

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
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRQ) {
        return getShopIntegration().addToCart(addToCartRQ);
    }


    @Override
    public Purchase purchaseConfirm(PurchaseConfirmRQ purchaseConfirmRQ) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Product getPurchase(int purchaseId) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public ValuationRS getValuation(ValuationRQ body) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Purchase purchaseConfirmTestHelper() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public ValuationRS valuationTestHelper() {
        // TODO Auto-generated method stub
        return null;
    }



    // @Override
    // public List<Product> getAvail() {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    // @Override
    // public Product getProduct(int productId) {
    //     return shopIntegration.getProduct(productId);
    // }

    // @Override
    // public AddToCartRS addToCart(AddToCartRQ addToCartRq) {
    //     return shopIntegration.addToCart(addToCartRq);
    // }

    // @Override
    // public Purchase purchaseConfirm(PurchaseConfirmRQ purchaseConfirmR) {
    //     return shopIntegration.purchaseConfirm(purchaseConfirmR);
    // }

    // @Override
    // public ValuationRS getValuation(ValuationRQ valuationRQ) {
    //     return shopIntegration.valuate(valuationRQ);
    // }

    // @Override
    // public Product getPurchase(int purchaseId) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }



    @Override
    public AddToCartRS cartTestHelper() {

        
		Integer cartId = 999;
        Integer userId = 999;
		Integer shopId = 999;

		Product product = new Product(7, "product name", "product description", "product remarks", "product type", "serviceAddressDummy");
		Article article = new Article(303, "article name", "article description", "article remarks", product);
		Offer offer = new Offer(555, "oferta test name", "oferta test description", "oferta test remarks", 9.99f, article);
		AddToCartRQ addToCart = new AddToCartRQ(offer, cartId, userId, shopId);

        return shopIntegration.addToCart(addToCart);
    }


    

    // @Override
    // public Purchase purchaseConfirmTestHelper() {

    //     Ca`rt cart = cartTestHelper().getCart();
    //     Integer userId = 111;
    //     String shipmentAddress = "mi casa 1";
    //     String paymentMethod = "credit card";
    //     Float valuation = (float) 99.99;

    //     PurchaseConfirmRQ purchaseConfirmRQ = new PurchaseConfirmRQ(cart, userId, shipmentAddress, paymentMethod, valuation);

    //     return purchaseConfirm(purchaseConfirmRQ);
    // }



    // @Override
    // public ValuationRS valuationTestHelper() {

    //     Product product = shopIntegration.getProduct(6);
    //     AddToCartRQ addToCartRQ1 = new AddToCartRQ(product, -2);

    //     Cart cart1 =  shopIntegration.addToCart(addToCartRQ1).getCart();
    //     AddToCartRQ addToCartRQ2 = new AddToCartRQ(product, cart1.getCartId());
    //     Cart cart2 = shopIntegration.addToCart(addToCartRQ2).getCart();

    //     ValuationRQ valuationRQ = new ValuationRQ(cart2.getProductList(), null);
    //     ValuationRS valuationRS = shopIntegration.valuate(valuationRQ);


    //     return valuationRS;
    // }


    public ShopCompositeIntegration getShopIntegration(){
        return this.shopIntegration;
    }

    public ServiceUtil getServiceUtil(){
        return this.serviceUtil;
    }


    
}
