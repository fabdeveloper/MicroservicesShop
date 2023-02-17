package fab.shop.microservices.core.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import fab.shop.api.core.cart.msg.*;
import fab.shop.api.core.product.transfer.Article;
import fab.shop.api.core.product.transfer.Offer;
import fab.shop.api.core.product.transfer.Product;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CartServiceApplicationTests {

	@Autowired
	private WebTestClient client; 

	// @Test
	void contextLoads() {
	}



	// @Test
	void addToCartTest(){


		// Integer cartId = 999;
		// Integer userId = 999;
		// Integer shopId = 999;

		// Product product = new Product(7, "product name", "product description", "product remarks", "product type", "serviceAddressDummy");
		// Article article = new Article(303, "article name", "article description", "article remarks", product);
		// Offer offer = new Offer(555, "oferta test name", "oferta test description", "oferta test remarks", 9.99f, article);
		// AddToCartRQ addToCart = new AddToCartRQ(offer, cartId, userId, shopId);


		// AddToCartRS addToCartRS = client.post()
		// .uri("/cart/addToCart")
		// .accept(MediaType.APPLICATION_JSON)
		// .bodyValue(addToCart)
		// .exchange()
		// .expectStatus().isOk()
		// .expectHeader().contentType(MediaType.APPLICATION_JSON)
		// .expectBody(AddToCartRS.class)
		// .returnResult().getResponseBody();

		// System.out.println("" + new java.util.Date().toString() + ",   AddToCartRS = " + addToCartRS.toString());


		// client.post()
		// .uri("/cart/addToCart")
		// .accept(MediaType.APPLICATION_JSON)
		// .bodyValue(addToCart)
		// .exchange()
		// .expectStatus().isOk()
		// .expectHeader().contentType(MediaType.APPLICATION_JSON)
		// .expectBody(AddToCartRS.class)
		// .returnResult().getResponseBody()
		// .getCart()
		// .getProductList().contains(offer);


		// //.getTotal().equals(prod1.getPrice()*2)
		// // ;	

	}

	// @Test
	public void getCartTest(){

		Integer cartId = 999;
		Integer userId = 999;
		Integer shopId = 999;

		GetCartRQ getCartRQ = new GetCartRQ(cartId, userId, shopId);


		client.post()
		.uri("/cart/addToCart")
		.accept(MediaType.APPLICATION_JSON)
		.bodyValue(getCartRQ)
		.exchange()
		.expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON)
		.expectBody(GetCartRS.class);

	}

	// @Test
	public void cartModificationTest(){

	}

	// @Test
	public void removeFromCartTest(){

	}

	// @Test
	public void emptyCartTest(){

		// Integer cartId = 999;

		// EmptyCartRQ emptyCartRQ = new EmptyCartRQ(cartId);


		// client.post()
		// .uri("/cart/emptyCart")
		// .accept(MediaType.APPLICATION_JSON)
		// .bodyValue(emptyCartRQ)
		// .exchange()
		// .expectStatus().isOk()
		// .expectHeader().contentType(MediaType.APPLICATION_JSON)
		// .expectBody(EmptyCartRS.class)
		// .returnResult().getResponseBody()
		// .getProductList().isEmpty();



	}

	// @Test
	public void deleteCartTest(){

	}


}
