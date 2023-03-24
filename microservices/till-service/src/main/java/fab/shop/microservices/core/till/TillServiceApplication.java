package fab.shop.microservices.core.till;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("fab.shop")
public class TillServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TillServiceApplication.class, args);
	}

}
