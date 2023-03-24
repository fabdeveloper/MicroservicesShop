package fab.shop.microservices.core.product;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import fab.shop.microservices.core.product.helper.*;
import fab.shop.microservices.core.product.facade.*;
import fab.shop.microservices.core.product.persistence.*;
import fab.shop.microservices.core.db.MySqlTestBase;
import fab.shop.microservices.core.mapper.*;



// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
// @RunWith(SpringRunner.class)
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// @ContextConfiguration(
//     classes = {ProductPurchaseHelperImpl.class,
// 				PersistenceFacade.class,
//         		PersistenceFacadeImpl.class,
//         		ProductServiceGeneralMapper.class,
//         		ProductConfigPersistenceHelperImpl.class,
// 				// ShopRepository.class,
// 				// ProductRepository.class,
//         		// ArticleRepository.class,
//         		// OfferRepository.class,
// 				// DiscountRepository.class,
//         		// TaxRepository.class,

//         		// ShopMapper.class,
//         		// ProductMapper.class,
//         		// ArticleMapper.class,
//         		// OfferMapper.class,
//         		// DiscountMapper.class,
//          		TaxMapper.class
// })
class ProductServiceApplicationTests extends MySqlTestBase {

	// @Autowired private WebTestClient client;

	// @Autowired
    // private ProductPurchaseHelper productPurchaseHelper;

	// @Test
	void contextLoads() {
	}

	
	// @Test
    // public void whenTestContextLoads_thenProductPurchaseHelperISNull() {
    //     assertTrue(productPurchaseHelper == null, "EURETRA! - productPurchaseHelper CREADO DIVINAMENTE ...");
    // }

	// @Test
    // public void whenTestContextLoads_thenProductPurchaseHelperISNotNull() {
    //     assertTrue(productPurchaseHelper != null, "productPurchaseHelper NO CREADO ...");
    // }


	// @Test
	// void getProductById() {

	// 	assertTrue(false, "getProductById() NO VA MUY BIEN ................");
  
	//   int productId = 1;
  
	//   client.get()
	// 	.uri("/product/" + productId)
	// 	.accept(MediaType.APPLICATION_JSON)
	// 	.exchange()
	// 	.expectStatus().isOk()
	// 	.expectHeader().contentType(MediaType.APPLICATION_JSON)
	// 	.expectBody()
	// 	  .jsonPath("$.productId").isEqualTo(productId);


	// }
  
	// @Test
	// void getProductInvalidParameterString() {
  
	//   client.get()
	// 	.uri("/product/no-integer")
	// 	.accept(MediaType.APPLICATION_JSON)
	// 	.exchange()
	// 	.expectStatus().isEqualTo(BAD_REQUEST)
	// 	.expectHeader().contentType(MediaType.APPLICATION_JSON)
	// 	.expectBody()
	// 	  .jsonPath("$.path").isEqualTo("/product/no-integer")
	// 	  .jsonPath("$.message").isEqualTo("Type mismatch.");
	// }
  
	// @Test
	// void getProductNotFound() {
  
	//   int productIdNotFound = 13;
  
	//   client.get()
	// 	.uri("/product/" + productIdNotFound)
	// 	.accept(MediaType.APPLICATION_JSON)
	// 	.exchange()
	// 	.expectStatus().isNotFound()
	// 	.expectHeader().contentType(MediaType.APPLICATION_JSON)
	// 	.expectBody()
	// 	  .jsonPath("$.path").isEqualTo("/product/" + productIdNotFound)
	// 	  .jsonPath("$.message").isEqualTo("No product found for productId: " + productIdNotFound);
	// }
  
	// @Test
	// void getProductInvalidParameterNegativeValue() {
  
	//   int productIdInvalid = -1;
  
	//   client.get()
	// 	.uri("/product/" + productIdInvalid)
	// 	.accept(MediaType.APPLICATION_JSON)
	// 	.exchange()
	// 	.expectStatus().isEqualTo(UNPROCESSABLE_ENTITY)
	// 	.expectHeader().contentType(MediaType.APPLICATION_JSON)
	// 	.expectBody()
	// 	  .jsonPath("$.path").isEqualTo("/product/" + productIdInvalid)
	// 	  .jsonPath("$.message").isEqualTo("Invalid productId: " + productIdInvalid);
	// }

}
