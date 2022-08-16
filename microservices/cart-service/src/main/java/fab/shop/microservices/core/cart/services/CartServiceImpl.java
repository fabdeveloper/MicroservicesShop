package fab.shop.microservices.core.cart.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;

import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartService;
import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.Offer;




@RestController
public class CartServiceImpl implements CartService{

    private final ServiceUtil serviceUtil;
    private Cart cartMock = null;


    @Autowired
    public CartServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    private Cart findCart(Integer cartId, Integer userId, Integer shopId){
        Cart cart = null;
        String serviceAddress= getServiceUtil().getServiceAddress();

        //cart = cartRepository.findById(cartId);

        if(getCartMock() != null && cartId == getCartMock().getCartId()){ // ENCONTRADO 
            cart = getCartMock();

        } else{ 
            Float valuation = 0.0f;
            cart = new Cart(cartId, new ArrayList<Offer>(), userId, shopId, valuation, serviceAddress);
        }

        return cart;
    }

    private Cart persistCart(Cart cart){

        setCartMock(cart);

        return cart;
    }
    
    
    private Boolean deleteCartFromDBById(Integer cartId){
        Boolean bOk = true;

        if(cartId != null && getCartMock() != null && cartId.compareTo(getCartMock().getCartId()) == 0){
            setCartMock(null);
        }

        return bOk;
    }

    private Float valuate(List<Offer> offers){

        Float result = null;


        return result;
    }




    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {

        AddToCartRS addToCartRS = null;

        if(addToCartRq != null) {
            Integer cartId = addToCartRq.getCartId();
            Integer userId = addToCartRq.getUserId();
            Integer shopId = addToCartRq.getShopId();
            Offer offer = addToCartRq.getProduct();

            Cart cart = findCart(cartId, userId, shopId);
            cart.getProductList().add(offer);

            cart = persistCart(cart);


            addToCartRS = new AddToCartRS(cart, "OK");



        }
        
        return addToCartRS;
    }

    
    
    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }


    public Cart getCartMock() {
        return this.cartMock;
    }

    public void setCartMock(Cart cartMock) {
        this.cartMock = cartMock;
    }



    @Override
    public GetCartRS getCart(GetCartRQ getCartRQ) {

        Integer cartId = getCartRQ.getCartId();
        Integer userId = getCartRQ.getUserId();
        Integer shopId = getCartRQ.getShopId();

        Cart cart = findCart(cartId, userId, shopId);

        GetCartRS getCartRS = new GetCartRS(cart.getCartId(), cart.getProductList(), cart.getValuation());
        return getCartRS;
    }


    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {

        // delete cart by id
        Integer cartId = cartModificationRQ.getCartId();
        Boolean bCartWasDeletedSuccessfully = deleteCartFromDBById(cartId);

        // create new cart
                // add offer list and valuation

        Integer userId = cartModificationRQ.getUserId();
        Integer shopId = cartModificationRQ.getShopId();
        String serviceAddress = getServiceUtil().getServiceAddress();
        List<Offer> offerList = cartModificationRQ.getOfferList();
        Float valuation = valuate(offerList);


        Cart newCart = new Cart(null, offerList, userId, shopId, valuation, serviceAddress);


        // persist cart
        Cart persistedCart = persistCart(newCart);


        // return cart to client
        CartModificationRS cartModificationRS = new CartModificationRS(persistedCart.getCartId(), 
                                                                        persistedCart.getProductList(), 
                                                                        persistedCart.getValuation(), 
                                                                        persistedCart.getUserId(), 
                                                                        persistedCart.getShopId());



        return cartModificationRS;
    }


    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {

        // delete cart from DB
        Boolean bOk = deleteCartFromDBById(emptyCartRQ.getCartId());

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

    
}
