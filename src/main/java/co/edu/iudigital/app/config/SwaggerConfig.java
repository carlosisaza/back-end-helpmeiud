package co.edu.iudigital.app.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuracion de Swagger
 * @author Carlos
 *
 */

@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(
						RequestHandlerSelectors.
						basePackage("co.edu.iudigital.app.controller")
						)
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"API de HelpMeIUD",
				"API para la App de HelpMe IUD",
				"1.0",
				"https://iudigital.edu.co",
				new Contact(
						"Carlos Isaza",
						"https://iudigital.edu.co",
						"carlos.isaza@est.iudigital.edu.co"),
				"Apache 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0.html",
				Collections.emptyList()
				);
	}
}
