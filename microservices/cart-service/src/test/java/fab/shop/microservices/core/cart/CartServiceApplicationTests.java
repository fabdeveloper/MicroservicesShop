package fab.shop.microservices.core.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import fab.shop.api.core.cart.AddToCartRQ;
import fab.shop.api.core.cart.AddToCartRS;
import fab.shop.api.core.product.Product;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CartServiceApplicationTests {

	@Autowired
	private WebTestClient client; 

	@Test
	void contextLoads() {
	}

	@Test
	void addToCartTest(){


		Integer cartId = null;
		Product product = new Product(555, "nameProd", 9.99f, "serviceAddressDummy");
		AddToCartRQ addToCart = new AddToCartRQ(product, cartId);


		client.post()
		.uri("/cart/addToCart")
		.accept(MediaType.APPLICATION_JSON)
		.bodyValue(addToCart)
		.exchange()
		.expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON)
		.expectBody(AddToCartRS.class)
		.returnResult().getResponseBody()
		.getCart()
		.getProductList().contains(product)
		//.getTotal().equals(prod1.getPrice()*2)
		;	

	}

}
