package fab.shop.microservices.core.valuation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("fab.shop")
public class ValuationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValuationServiceApplication.class, args);
	}

}
