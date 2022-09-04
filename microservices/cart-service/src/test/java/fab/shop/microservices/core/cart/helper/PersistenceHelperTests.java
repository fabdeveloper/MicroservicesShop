package fab.shop.microservices.core.cart.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import static org.springframework.transaction.annotation.Propagation.NOT_SUPPORTED;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import fab.shop.api.core.cart.Cart;
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

    @Autowired
    private PersistenceHelperRepositoryImpl persistenceHelper;

    @BeforeEach
    void setupDb() {
    //     getPersistenceHelper().getRepository().deleteAll();

    //     Float valuation = 9.99f;
    //     Product product = new Product(4, "name product", "description product", "remarks product", "type product", "serviceAddress product");
    //     Article article = new Article(2, "article name test", "article description test", "article remarks test", product);
    //     Offer offer = new Offer(3, "offer name test", "offer description test", "offer remarks test", valuation, article);
    //     List<Offer> offerList = new ArrayList<Offer>();
    //     offerList.add(offer);

    //     Cart newcart = new Cart(null, offerList, 5, 1, valuation, "service address test");
    //     Cart persistedCart = getPersistenceHelper().persistCart(newcart);
        
  
    //   assertEqualsEntity(newcart, persistedCart);
    }



    private void assertEqualsEntity(Cart expected, Cart actual) {

        // assertEquals(expected.getValuation(), actual.getValuation());

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

    @Test
    public void persistCartTest() {

        
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
