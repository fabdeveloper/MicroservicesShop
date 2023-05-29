package fab.shop.microservices.core.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
@ComponentScan("fab.shop")
public class ProductServiceApplication {

	@Value("${api.common.version}") String apiVersion;
	@Value("${api.common.title}") String apiTitle;
	@Value("${api.common.description}") String apiDescription;
	@Value("${api.common.termsOfService}") String apiTermsOfService;
	@Value("${api.common.license}") String apiLicense;
	@Value("${api.common.licenseUrl}") String apiLicenseUrl;
	@Value("${api.common.externalDocDesc}") String apiExternalDocDesc;
	@Value("${api.common.externalDocUrl}") String apiExternalDocUrl;
	@Value("${api.common.contact.name}") String apiContactName;
	@Value("${api.common.contact.url}") String apiContactUrl;
	@Value("${api.common.contact.email}") String apiContactEmail;

	

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}


	@Bean
	public OpenAPI getOpenApiDocumentation() {
		return new OpenAPI()
		.info(new Info().title(apiTitle)
		.description(apiDescription)
		.version(apiVersion)
		.contact(new Contact()
		.name(apiContactName)
		.url(apiContactUrl)
		.email(apiContactEmail))
		.termsOfService(apiTermsOfService)
		.license(new License()
		.name(apiLicense)
		.url(apiLicenseUrl)))
		.externalDocs(new ExternalDocumentation()
		.description(apiExternalDocDesc)
		.url(apiExternalDocUrl));
	}

}
