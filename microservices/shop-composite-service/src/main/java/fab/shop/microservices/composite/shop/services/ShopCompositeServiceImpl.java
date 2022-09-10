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
    public ValuationRS getValuation(ValuationRQ valuationRQ) {
        return getShopIntegration().valuate(valuationRQ);
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



    @Override
    public AddToCartRS addToCartTestHelper() {

        
		Integer cartId = 999;
        Integer userId = 999;
		Integer shopId = 999;

		Product product = new Product(7, "product name", "product description", "product remarks", "product type", "serviceAddressDummy");
		Article article = new Article(303, "article name", "article description", "article remarks", product);
		Offer offer = new Offer(555, "oferta test name", "oferta test description", "oferta test remarks", 9.99f, article);
		AddToCartRQ addToCart = new AddToCartRQ(offer, cartId, userId, shopId);

        return shopIntegration.addToCart(addToCart);
    }


    

    public ShopCompositeIntegration getShopIntegration(){
        return this.shopIntegration;
    }

    public ServiceUtil getServiceUtil(){
        return this.serviceUtil;
    }


    @Override
    public GetCartRS getCartTestHelper() {
        Integer cartId = 333;
        Integer userId = 333;
		Integer shopId = 333;

        GetCartRQ getCartRQ = new GetCartRQ(cartId, userId, shopId);
        GetCartRS getCartRS = getCart(getCartRQ);

        return getCartRS;
    }


    @Override
    public GetCartRS getCart(GetCartRQ getCartRQ) {
        return getShopIntegration().getCart(getCartRQ);
    }


    @Override
    public EmptyCartRS emptyCartTestHelper() {
        Integer cartId = 999;
        EmptyCartRQ emptyCartRQ = new EmptyCartRQ(cartId);

        return emptyCart(emptyCartRQ);
    }


    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {
        return getShopIntegration().emptyCart(emptyCartRQ);
    }


    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {
        return getShopIntegration().cartModification(cartModificationRQ);
    }


    @Override
    public String apiObject() {
        return getShopIntegration().getCartApiObject();
    }


    @Override
    public String entityObject() {
        return getShopIntegration().getCartEntityObject();
    }


    
}
