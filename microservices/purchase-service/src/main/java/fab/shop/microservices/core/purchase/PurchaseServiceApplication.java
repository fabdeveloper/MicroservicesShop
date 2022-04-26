package fab.shop.microservices.core.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("fab.shop")
public class PurchaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseServiceApplication.class, args);
	}

}
