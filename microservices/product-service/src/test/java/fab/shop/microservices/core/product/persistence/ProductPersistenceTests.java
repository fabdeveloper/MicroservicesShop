package fab.shop.microservices.core.product.persistence;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


import fab.shop.microservices.core.product.persistence.ProductEntity;
import fab.shop.microservices.core.product.persistence.ShopEntity;

import fab.shop.microservices.core.db.MySqlTestBase;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import static org.springframework.transaction.annotation.Propagation.NOT_SUPPORTED;
import org.springframework.beans.factory.annotation.Autowired;





@DataJpaTest
@Transactional(propagation = NOT_SUPPORTED)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductPersistenceTests extends MySqlTestBase {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ShopRepository ShopRepository;


    private ShopEntity savedShopEntity;
    private ProductEntity savedEntity;


    @BeforeEach
    void setupDb() {
      repository.deleteAll();
  
      ShopEntity shopEntity = new ShopEntity(null, null, "shop2 name", "shop2 description", "shop2 remarks", 2);
      savedShopEntity = ShopRepository.save(shopEntity);
      ProductEntity entity = new ProductEntity(null, null, "product 100 name", "product 100 description", "product 100 remarks", savedShopEntity, "product type");
      savedEntity = repository.save(entity);
  
      assertEqualsProduct(entity, savedEntity);
    }

    // @Test
    void create() {
  
      // ShopEntity shopEntity = new ShopEntity(null, null, "shop2 name", "shop2 description", "shop2 remarks", 2);

      ProductEntity newEntity = new ProductEntity(null, null, "product name", "product description", "product remarks", savedShopEntity, "product type");      
      repository.save(newEntity);
  
      ProductEntity foundEntity = repository.findById(newEntity.getId()).get();
      assertEqualsProduct(newEntity, foundEntity);
  
      assertEquals(2, repository.count());
    }

////////////////////////////////////////////////////


// @Test
void update() {
  savedEntity.setType("a2");
  repository.save(savedEntity);

  ProductEntity foundEntity = repository.findById(savedEntity.getId()).get();
  assertEquals(1, (long)foundEntity.getVersion());
  assertEquals("a2", foundEntity.getType());
}

// @Test
void delete() {
  repository.delete(savedEntity);
  assertFalse(repository.existsById(savedEntity.getId()));
}

// @Test
// void getByShopId() {
//   List<ProductEntity> entityList = repository.findByShopId(savedEntity.getShop().getId());

//   assertThat(entityList, hasSize(1));
//   assertEqualsReview(savedEntity, entityList.get(0));
// }

// @Test
// void duplicateError() {
//   assertThrows(DataIntegrityViolationException.class, () -> {
//     ReviewEntity entity = new ReviewEntity(1, 2, "a", "s", "c");
//     repository.save(entity);
//   });

// }

// @Test
// void optimisticLockError() {

//   // Store the saved entity in two separate entity objects
//   ReviewEntity entity1 = repository.findById(savedEntity.getId()).get();
//   ReviewEntity entity2 = repository.findById(savedEntity.getId()).get();

//   // Update the entity using the first entity object
//   entity1.setAuthor("a1");
//   repository.save(entity1);

//   // Update the entity using the second entity object.
//   // This should fail since the second entity now holds an old version number, i.e. an Optimistic Lock Error
//   assertThrows(OptimisticLockingFailureException.class, () -> {
//     entity2.setAuthor("a2");
//     repository.save(entity2);
//   });

//   // 
//   Get the updated entity from the database and verify its new sate
//   ReviewEntity updatedEntity = repository.findById(savedEntity.getId()).get();
//   assertEquals(1, (int)updatedEntity.getVersion());
//   assertEquals("a1", updatedEntity.getAuthor());
// }

////////////////////////////////////////////////////

    private void assertEqualsProduct(ProductEntity expectedEntity, ProductEntity actualEntity) {
        assertEquals(expectedEntity.getId(),        actualEntity.getId());
        assertEquals(expectedEntity.getVersion(),   actualEntity.getVersion());
        assertEquals(expectedEntity.getName(), actualEntity.getName());
        assertEquals(expectedEntity.getDescription(),  actualEntity.getDescription());
        assertEquals(expectedEntity.getRemarks(),    actualEntity.getRemarks());
        assertEquals(expectedEntity.getType(),   actualEntity.getType());
      }

    
}
