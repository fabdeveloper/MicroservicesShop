package fab.shop.microservices.core.purchase;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import fab.shop.microservices.core.purchase.db.MySqlTestBase;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PurchaseServiceApplicationTests extends MySqlTestBase {

	@Test
	void contextLoads() {
	}

	// @Test
	// public void purchaseModificationTest(){

	// }

	// @Test
	// public void purchaseCancelTest(){

	// }

	// @Test
	// public void getPurchaseTest(){

	// }

	// @Test
	// public void getPurchaseListTest(){

	// }

	// @Test
	// public void purchaseConfirmTest(){

	// }

}
