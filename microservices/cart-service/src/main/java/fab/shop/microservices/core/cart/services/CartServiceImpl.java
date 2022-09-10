package fab.shop.microservices.core.cart.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;

import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartItem;
import fab.shop.api.core.cart.CartService;
import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.Offer;
import fab.shop.microservices.core.cart.helper.PersistenceHelper;
import fab.shop.microservices.core.cart.helper.PersistenceHelperRepositoryImpl;
import fab.shop.microservices.core.cart.helper.ValuationHelper;
import fab.shop.microservices.core.cart.persistence.CartEntity;
import fab.shop.microservices.core.cart.persistence.CartItemEntity;




@RestController
public class CartServiceImpl implements CartService{

    private final ServiceUtil serviceUtil;
    private final PersistenceHelperRepositoryImpl persistenceHelper;
    private final ValuationHelper valuationHelper;


    @Autowired
    public CartServiceImpl(ServiceUtil serviceUtil, PersistenceHelperRepositoryImpl persistenceHelper, ValuationHelper valuationHelper) {
        this.serviceUtil = serviceUtil;
        this.persistenceHelper = persistenceHelper;
        this.valuationHelper = valuationHelper;
    }    


    private Float valuate(List<Offer> offerList){
        return getValuationHelper().valuate(offerList);
    }


    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {

        AddToCartRS addToCartRS = null;

        // if(addToCartRq != null) {
        //     Integer cartId = addToCartRq.getCartId();
        //     Integer userId = addToCartRq.getUserId();
        //     Integer shopId = addToCartRq.getShopId();
        //     Offer offer = addToCartRq.getOffer();

        //     Cart cart = getPersistenceHelper().findCart(cartId, userId, shopId);
        //     cart.getProductList().add(offer);

        //     cart = getPersistenceHelper().persistCart(cart);

        //     addToCartRS = new AddToCartRS(cart, "OK");
        // }        
        return addToCartRS;
    }
    
    
    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }


    public PersistenceHelper getPersistenceHelper() {
        return this.persistenceHelper;
    }


    public ValuationHelper getValuationHelper() {
        return this.valuationHelper;
    }




    @Override
    public GetCartRS getCart(GetCartRQ getCartRQ) {
        GetCartRS getCartRS = null;
        // Integer cartId = getCartRQ.getCartId();
        // Integer userId = getCartRQ.getUserId();
        // Integer shopId = getCartRQ.getShopId();

        // Cart cart = getPersistenceHelper().findCart(cartId, userId, shopId);

        // GetCartRS getCartRS = new GetCartRS(cart.getCartId(), cart.getProductList(), cart.getValuation());
        return getCartRS;
    }


    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {

        CartModificationRS cartModificationRS = null;

        // // delete cart by id
        // Integer cartId = cartModificationRQ.getCartId();
        // getPersistenceHelper().deleteCartFromDBById(cartId);

        // // create new cart
        //         // add offer list and valuation

        // Integer userId = cartModificationRQ.getUserId();
        // Integer shopId = cartModificationRQ.getShopId();
        // String serviceAddress = getServiceUtil().getServiceAddress();
        // List<Offer> offerList = cartModificationRQ.getOfferList();
        // Float valuation = valuate(offerList);


        // Cart newCart = new Cart(null, offerList, userId, shopId, valuation, serviceAddress);


        // // persist cart
        // Cart persistedCart = getPersistenceHelper().persistCart(newCart);


        // // return cart to client
        // CartModificationRS cartModificationRS = new CartModificationRS(persistedCart.getCartId(), 
        //                                                                 persistedCart.getProductList(), 
        //                                                                 persistedCart.getValuation(), 
        //                                                                 persistedCart.getUserId(), 
        //                                                                 persistedCart.getShopId());



        return cartModificationRS;
    }


    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {

        // delete cart from DB
        getPersistenceHelper().deleteCartFromDBById(emptyCartRQ.getCartId());

        // create a new empty cart
        EmptyCartRS emptyCartRS = new EmptyCartRS();

        return emptyCartRS;
    }


    @Override
    public DeleteCartRS deleteCart(DeleteCartRQ deleteCartRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RemoveFromCartRS removeFromCart(RemoveFromCartRQ removeFromCartRq) {

        removeFromCartRq.getCartId();
        removeFromCartRq.getOfferId();

        return null;
    }


    @Override
    public String getCartApiObject() {
        List<CartItemEntity> itemsList = new ArrayList<CartItemEntity>();
        CartItemEntity item = new CartItemEntity(3, null, 1, 2, 1);
        itemsList.add(item);
        CartEntity entity = new CartEntity(5, null, itemsList, "serviceAddress", 1, 1, 9.99f);

        PersistenceHelperRepositoryImpl helper = new PersistenceHelperRepositoryImpl();

        Cart cart = helper.getMapper().entityToApi(entity);

        return cart.toString();
    }


    @Override
    public String getCartEntityObject() {

        CartItem item = new CartItem(1, 2, 3, 1);
        List<CartItem> itemsList = new ArrayList<CartItem>();
        itemsList.add(item);
        Cart cart = new Cart(3, itemsList, "serviceAddress", 1, 1, 9.99f);

        PersistenceHelperRepositoryImpl helper = new PersistenceHelperRepositoryImpl();


        CartEntity entity = helper.getMapper().apiToEntity(cart);
        return entity.toString();
    }

    
}
