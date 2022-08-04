package fab.shop.microservices.core.cart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;

import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartService;
import fab.shop.api.core.cart.msg.*;




@RestController
public class CartServiceImpl implements CartService{

    private final ServiceUtil serviceUtil;
    private Cart cartMock = null;


    @Autowired
    public CartServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }


    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {

        AddToCartRS addToCartRS = null;
        // Product product = addToCartRq.getProduct();
        // Integer cartId = addToCartRq.getCartId();

        // Cart cart = null;
        // List<Product> products;

        // if(product != null){
        //     if(cartId != null){
        //         cart = getCart(cartId);
        //         products = cart.getProductList();
        //         products.add(product);
        //         //cart = new Cart(cartId, products);
        //         cart = persistCart(cart);

        //     } else{
        //         products = new ArrayList<>();
        //         products.add(product);
        //         cart = new Cart(0, products, getServiceUtil().getServiceAddress());
        //         cart = persistCart(cart);
        //     }
        // }

        // AddToCartRS addToCartRs = new AddToCartRS(cart,  null);
        return addToCartRS;
    }

    // private Cart persistCart(Cart cart) {
        // if(cart.getCartId() == 0){
        //     cartMock = new Cart(-1, cart.getProductList());
        // }else{
        //     cartMock = cart;
        // }
        
        // return cartMock;

    //     return cart;
    // }



    // @Override
    // public Cart updateCart(Cart cart) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }


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
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public CartModificationRS cartModification(CartModificationRQ cartModificationRQ) {
        // TODO Auto-generated method stub
        return null;
    }











    @Override
    public EmptyCartRS emptyCart(EmptyCartRQ emptyCartRQ) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public DeleteCartRS deleteCart(DeleteCartRQ deleteCartRQ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RemoveFromCartRS removeFromCart(RemoveFromCartRQ removeFromCartRq) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
