package fab.shop.microservices.core.valuation;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import fab.shop.api.core.product.Product;
import fab.shop.api.core.valuation.msg.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ValuationServiceApplicationTests {

	@Autowired
	private WebTestClient client; 

	@Test
	void contextLoads() {
	}


	@Test
	void valuateTest() {

		Product prod1 = new Product(1, "nameProd1", 9.99f, "serviceAddressDummy");
		List<Product> productList = new ArrayList<Product>();
		productList.add(prod1);
		productList.add(prod1);
		ValuationRQ valuationRQ = new ValuationRQ(productList, null);

		client.post()
			.uri("/valuation/valuate")
			.accept(MediaType.APPLICATION_JSON)
			.bodyValue(valuationRQ)
			.exchange()
			.expectStatus().isOk()
			.expectHeader().contentType(MediaType.APPLICATION_JSON)
			.expectBody(ValuationRS.class)
			.returnResult().getResponseBody().getTotal().equals(prod1.getPrice()*2);			
	}

}
