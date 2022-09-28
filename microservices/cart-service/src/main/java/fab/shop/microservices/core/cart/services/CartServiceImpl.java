package fab.shop.microservices.core.cart.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;

import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartItem;
import fab.shop.api.core.cart.CartService;
import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.Offer;
import fab.shop.microservices.core.cart.helper.PersistenceHelper;
import fab.shop.microservices.core.cart.helper.PersistenceHelperImpl;
import fab.shop.microservices.core.cart.helper.PersistenceHelperRepositoryImpl;
import fab.shop.microservices.core.cart.helper.ValuationHelper;
import fab.shop.microservices.core.cart.persistence.CartEntity;
import fab.shop.microservices.core.cart.persistence.CartItemEntity;




@RestController
public class CartServiceImpl implements CartService{

    private final ServiceUtil serviceUtil;
    // private final PersistenceHelperRepositoryImpl persistenceHelper;
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


    @Transactional
    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {

        AddToCartRS addToCartRS = null;        
        addToCartRS = new AddToCartRS(null, "CartServiceImpl.AddToCartRS() ... answering !");
        CartEntity cart = null;


        if(addToCartRq != null) {
            Integer cartId = addToCartRq.getCartId();
            if(cartId == null || cartId < 1) { addToCartRS.setStatus("ERROR: mandatory field cart id"); return addToCartRS; }
            CartItem item = addToCartRq.getItem();
            if(item == null || item.getOfferId() == null || item.getCount() == null) { addToCartRS.setStatus("ERROR: mandatory field cart item"); return addToCartRS; }
            
            CartItemEntity itemEntity = getPersistenceHelper().getItemMapper().apiToEntity(item);
            cart = getPersistenceHelper().getRepository().findByCartId(cartId);
            if(cart == null) { addToCartRS.setStatus("ERROR: no cart found with id = " + cartId); return addToCartRS; }
            itemEntity.setCart(cart);
            
            List<CartItemEntity> itemsList = cart.getItemsList();
            if(itemsList == null) { itemsList = new ArrayList<CartItemEntity>(); }
            itemsList.add(itemEntity);
            cart = getPersistenceHelper().getRepository().save(cart); // mergeCart(cart);
            if(cart == null){ addToCartRS.setStatus("ERROR: call technical support");}

            Cart cartTO = getPersistenceHelper().getMapper().entityToApi(cart);
            addToCartRS = new AddToCartRS(cartTO, "OK");
        } else{
            addToCartRS.setStatus("ERROR: reading AddToCartRQ");
        }       
        return addToCartRS;
    }
    
    
    public ServiceUtil getServiceUtil() {
        return this.serviceUtil;
    }


    public PersistenceHelperRepositoryImpl getPersistenceHelper() {
        return this.persistenceHelper;
    }


    public ValuationHelper getValuationHelper() {
        return this.valuationHelper;
    }




    @Override
    public GetCartRS getCart(GetCartRQ getCartRQ) {
        GetCartRS getCartRS = new GetCartRS(null, "not_found_not_created");

        Integer cartId = getCartRQ.getCartId();
        Integer userId = getCartRQ.getUserId();
        Integer shopId = getCartRQ.getShopId();

        Cart cart = null;

        if(cartId != null && cartId > 0){
            cart = getPersistenceHelper().findByCartId(cartId);
        }
        if(cart == null){
            if(userId == null || userId < 1){ getCartRS.setStatus("ERROR : mandatory field user id"); return getCartRS; }
            if(shopId == null || shopId < 1){ getCartRS.setStatus("ERROR : mandatory field shop id"); return getCartRS; }
            cart = getPersistenceHelper().findCartByUserAndShopId(userId, shopId);
        }
        if(cart == null){
            Cart newCart = new Cart(null, null, getServiceUtil().getServiceAddress(), userId, shopId, 0.00f);
            cart = getPersistenceHelper().persistCart(newCart);
        }

        if(cart != null){
            getCartRS.setCart(cart);
            getCartRS.setStatus("ok");
        }

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

        // return "CartServiceImpl - getCartApiObject() - answering ...";
        List<CartItemEntity> itemsList = new ArrayList<CartItemEntity>();

        CartEntity entity = new CartEntity(5, null, itemsList, "serviceAddress", 1, 1, 9.99f, new Date(), new Date());


        CartItemEntity item = new CartItemEntity(3, null, entity, 2, 1, new Date(), new Date());
        itemsList.add(item);

        entity.setItemsList(itemsList);

        Cart cart =  this.getPersistenceHelper().getMapper().entityToApi(entity);
        return cart.toString();
    }


    @Override
    public String getCartEntityObject() {
        // return "CartServiceImpl - getCartEntityObject() - answering ...";

        CartItem item = new CartItem(1, 2, 3, 1);
        List<CartItem> itemsList = new ArrayList<CartItem>();
        itemsList.add(item);
        Cart cart = new Cart(3, itemsList, "serviceAddress", 1, 1, 9.99f);


        CartEntity entity = this.getPersistenceHelper().getMapper().apiToEntity(cart);
        return entity.toString();
    }
     

    
}
