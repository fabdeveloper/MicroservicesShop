package fab.shop.microservices.core.cart.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fab.shop.util.http.ServiceUtil;
import fab.shop.api.core.cart.AddToCartRQ;
import fab.shop.api.core.cart.AddToCartRS;
import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartService;
import fab.shop.api.core.product.Product;

@RestController
public class CartServiceImpl implements CartService{

    private final ServiceUtil serviceUtil;

    @Autowired
    public CartServiceImpl(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }


    private Cart cartMock = null;



    @Override
    public Cart getCart(int cartId) {
        Cart cart = null;
        if(cartId == -1){
            cart = cartMock;
        }else if(cartId == -2){
            cart = new Cart(-1, new ArrayList<Product>(), getServiceUtil().getServiceAddress());
            cartMock = cart;
        }else if(cartId == 0){
            cart = new Cart(cartId, new ArrayList<Product>(), getServiceUtil().getServiceAddress());
        }


        return cart;
    }



    @Override
    public Cart removeFromCart(Integer productId, Integer cartId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteCart(int userId) {
        // TODO Auto-generated method stub
        
    }



    @Override
    public AddToCartRS addToCart(AddToCartRQ addToCartRq) {

        Product product = addToCartRq.getProduct();
        Integer cartId = addToCartRq.getCartId();

        Cart cart = null;
        List<Product> products;

        if(product != null){
            if(cartId != null){
                cart = getCart(cartId);
                products = cart.getProductList();
                products.add(product);
                //cart = new Cart(cartId, products);
                cart = persistCart(cart);

            } else{
                products = new ArrayList<>();
                products.add(product);
                cart = new Cart(0, products, getServiceUtil().getServiceAddress());
                cart = persistCart(cart);
            }
        }

        AddToCartRS addToCartRs = new AddToCartRS(cart,  null);
        return addToCartRs;
    }

    private Cart persistCart(Cart cart) {
        // if(cart.getCartId() == 0){
        //     cartMock = new Cart(-1, cart.getProductList());
        // }else{
        //     cartMock = cart;
        // }
        
        // return cartMock;

        return cart;
    }



    @Override
    public Cart updateCart(Cart cart) {
        // TODO Auto-generated method stub
        return null;
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

    
}
