package fab.shop.microservices.core.product.helper;



import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import static org.springframework.transaction.annotation.Propagation.NOT_SUPPORTED;


import fab.shop.microservices.core.db.MySqlTestBase;

import fab.shop.microservices.core.product.helper.ProductPurchaseHelperImpl;
import fab.shop.microservices.core.product.facade.PersistenceFacadeImpl;
import fab.shop.microservices.core.mapper.ProductServiceGeneralMapper;
import fab.shop.microservices.core.product.helper.ProductConfigPersistenceHelperImpl;
import fab.shop.microservices.core.product.persistence.ArticleRepository;
import fab.shop.microservices.core.product.persistence.DiscountRepository;
import fab.shop.microservices.core.product.persistence.OfferRepository;
import fab.shop.microservices.core.product.persistence.ProductRepository;
import fab.shop.microservices.core.product.persistence.ShopRepository;
import fab.shop.microservices.core.product.persistence.TaxRepository;
import fab.shop.microservices.core.mapper.*;


import fab.shop.microservices.core.product.persistence.ArticleEntity;
import fab.shop.microservices.core.product.persistence.OfferEntity;
import fab.shop.microservices.core.product.persistence.ProductEntity;
import fab.shop.microservices.core.product.persistence.ProductRepository;
import fab.shop.microservices.core.product.persistence.ShopEntity;
import fab.shop.microservices.core.product.persistence.ShopRepository;






@DataJpaTest
@Transactional(propagation = NOT_SUPPORTED)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductPurchaseHelperTest extends MySqlTestBase {


    // @Autowired
    private ProductPurchaseHelperImpl productPurchaseHelper;


    private ShopEntity savedShopEntity;
    private ProductEntity savedProductEntity;
    private ArticleEntity savedArticleEntity;
    private OfferEntity savedOfferEntity;
    
    private Integer numItemsOK = 2;
    private Integer numItemsKO = 12;
    private Integer maxStock = 3;

    // @BeforeEach
    void setupDb() {

        resetDB();
   
      ShopEntity shopEntity = new ShopEntity(null, null, "shop2 name", "shop2 description", "shop2 remarks", 2);
      savedShopEntity = productPurchaseHelper.getPersistenceFacade().getPersistenceHelper().getShopRepository().save(shopEntity);
      ProductEntity productEntity = new ProductEntity(null, null, "product 100 name", "product 100 description", "product 100 remarks", savedShopEntity, "product type");
      savedProductEntity = productPurchaseHelper.getPersistenceFacade().getPersistenceHelper().getProductRepository().save(productEntity);  
      ArticleEntity articleEntity = new ArticleEntity(null, null, "article name", "article description", "article remarks", savedProductEntity);
      savedArticleEntity = productPurchaseHelper.getPersistenceFacade().getPersistenceHelper().getArticleRepository().save(articleEntity);
      OfferEntity offerEntity = new OfferEntity(null, null, null, null, null, null, savedArticleEntity, null, null, null, null, true, maxStock, maxStock);
      savedOfferEntity = productPurchaseHelper.getPersistenceFacade().getPersistenceHelper().getOfferRepository().save(offerEntity);

      
      assertEqualsOffer(offerEntity, savedOfferEntity);
    }

    private void resetDB(){
        productPurchaseHelper.getPersistenceFacade().getPersistenceHelper().getOfferRepository().deleteAll();
        productPurchaseHelper.getPersistenceFacade().getPersistenceHelper().getArticleRepository().deleteAll();
        productPurchaseHelper.getPersistenceFacade().getPersistenceHelper().getProductRepository().deleteAll();
        productPurchaseHelper.getPersistenceFacade().getPersistenceHelper().getShopRepository().deleteAll();


        savedShopEntity = null;
        savedProductEntity = null;
        savedArticleEntity = null;
        savedOfferEntity = null;

    }

    
    private void assertEqualsOffer(OfferEntity expectedEntity, OfferEntity actualEntity) {
        assertEquals(expectedEntity.getId(),        actualEntity.getId());
        assertEquals(expectedEntity.getVersion(),   actualEntity.getVersion());
        assertEquals(expectedEntity.getName(), actualEntity.getName());
        assertEquals(expectedEntity.getDescription(),  actualEntity.getDescription());
        assertEquals(expectedEntity.getRemarks(),    actualEntity.getRemarks());
        assertEquals(expectedEntity.getAvailCount(),    actualEntity.getAvailCount());
        assertEquals(expectedEntity.getStockMax(),    actualEntity.getStockMax());
      }


    // @Test
    public void checkAvailability() {


        Boolean bCondition = true;
        assertTrue(bCondition, "checkAvailability() NO VA BIEN ---------");
    }

    // @Test
    public void decrementStock() {


        Boolean bCondition = true;
        assertTrue(bCondition, "decrementStock() NO VA BIEN ---------");
    }

    // @Test
    public void bookPurchaseList() {
        Boolean bCondition = true;
        assertTrue(bCondition, "bookPurchaseList() NO VA BIEN ---------");
    }

        // @Test
    public void productPurchaseConfirmTest(){
        Boolean bCondition = true;
        assertTrue(bCondition, "bookPurchaseList() NO VA BIEN ---------");
    }

    // @Test
    public void whenTestContextLoads_thenProductPurchaseHelperISNotNull() {

        assertTrue(productPurchaseHelper != null, "bookPurchaseList() NO VA BIEN ---------");

    }
    
}
