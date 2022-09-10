package fab.shop.microservices.core.cart.helper;


import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.*;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import static org.springframework.transaction.annotation.Propagation.NOT_SUPPORTED;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import fab.shop.api.core.cart.Cart;
import fab.shop.api.core.cart.CartItem;
import fab.shop.api.core.product.Article;
import fab.shop.api.core.product.Offer;
import fab.shop.api.core.product.Product;
import fab.shop.microservices.core.cart.db.MySqlTestBase;
import fab.shop.microservices.core.cart.helper.PersistenceHelper;



// @SpringBootTest
// @Testcontainers


@DataJpaTest
@Transactional(propagation = NOT_SUPPORTED)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PersistenceHelperTests extends MySqlTestBase {

    private static final Logger LOG = LoggerFactory.getLogger(PersistenceHelperTests.class);


    @Autowired
    private PersistenceHelperRepositoryImpl persistenceHelper;

    // @BeforeEach
    void setupDb() {
        
        System.out.println(" setupDb() ... trying ...");

        getPersistenceHelper().getRepository().deleteAll();

        Float valuation = 9.99f;
        Integer offer_id = 3;
        Integer count = 1;

        Cart emptyCart = getPersistenceHelper().persistCart(new Cart(null, null, "serviceAddress string", 1, 1, 0.00f));

        // throw new RuntimeException("emptyCart= " + emptyCart.toString());
        // if(emptyCart != null){

        
        //     System.out.println("PersistentHelperTests.setupDb() - emptyCart = " + emptyCart.toString());
        // }else{
        //     System.out.println("PersistentHelperTests.setupDb() - emptyCart = is null");

        // }

        List<CartItem> cartItemsList = new ArrayList<CartItem>();
        CartItem cartItem = new CartItem(null, emptyCart.getCartId(), offer_id, count);
        cartItemsList.add(cartItem);
        
        Cart newcart = new Cart(emptyCart.getCartId(), cartItemsList, "serviceAddress string", 1, 1, valuation);
        System.out.println("PersistentHelperTests.setupDb() - newCart = " + newcart.toString());

        Cart persistedCart = getPersistenceHelper().mergeCart(newcart);
        throw new RuntimeException("persistedCart= " + persistedCart.toString());

  
    //   assertEqualsEntity(newcart, persistedCart);
    }

    // @AfterClass
    void cleanDb(){
            getPersistenceHelper().getRepository().deleteAll();
    }



    private void assertEqualsEntity(Cart expected, Cart actual) {
        System.out.println(" assertEqualsEntity() ... trying ...");

        assertEquals(expected.getValuation(), actual.getValuation());

        Integer expectedLenght = expected.getCartItemsList().size();
        Integer actualLenght = actual.getCartItemsList().size();

        assertEquals(expectedLenght, actualLenght);

        for (int i = 0; i < expectedLenght; i++) {
            Integer expectedOfferId = expected.getCartItemsList().get(i).getOfferId();
            Integer actualOfferId = actual.getCartItemsList().get(i).getOfferId();

            assertEquals(expectedOfferId, actualOfferId);
            
        }

        // Integer numOffersExpected = expected.getProductList().size();
        // Integer numOffersActual = actual.getProductList().size();

        // assertEquals(numOffersExpected, numOffersActual);

        // for (int i = 0; i < numOffersExpected ; i++) {

        //     Integer idOfferExpected = expected.getProductList().get(i).getId();
        //     Integer  idOfferActual = actual.getProductList().get(i).getId();

        //     assertEquals(idOfferExpected, idOfferActual);
            
        // }


    }



    // @Test
    // public Cart findCartTest(Integer cartId, Integer userId, Integer shopId) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    // @Test
    public void persistCartTest() {

        System.out.println(" persistCartTest() ... trying ...");
        
    //     Float valuation = 9.99f;
    //     Product product = new Product(4, "name product", "description product", "remarks product", "type product", "serviceAddress product");
    //     Article article = new Article(2, "article name test", "article description test", "article remarks test", product);
    //     Offer offer = new Offer(3, "offer name test", "offer description test", "offer remarks test", valuation, article);
    //     List<Offer> offerList = new ArrayList<Offer>();
    //     offerList.add(offer);

    //     Cart newcart = new Cart(null, offerList, 5, 1, valuation, "service address test");
    //     Cart persistedCart = getPersistenceHelper().persistCart(newcart);
        
  
    //   assertEqualsEntity(newcart, persistedCart);

    //   long numRegsExpected = 2;
    //   long numRegsActual = getPersistenceHelper().getRepository().count();

    //   assertEquals(numRegsExpected, numRegsActual);

    assertTrue(true, "ha ido muy mal");



    }

    // @Test
    // public void deleteCartFromDBByIdTest(Integer cartId) {
    //     // TODO Auto-generated method stub
        
    // }

    public PersistenceHelperRepositoryImpl getPersistenceHelper() {
        return this.persistenceHelper;
    }

    public void setPersistenceHelper(PersistenceHelperRepositoryImpl persistenceHelper) {
        this.persistenceHelper = persistenceHelper;
    }


    
}
