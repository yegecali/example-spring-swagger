package com.yegecali.swagerui.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
  @Bean
  public OpenAPI customOpenApi() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Prueba de Open Api")
                .version("1.0.0")
                .contact(
                    new Contact()
                        .name("yegecali")
                        .url("http://yegecali.com")
                        .email("yegecali@gmail.com"))
                .description("ejemplo de configuracion de Open Api")
                .termsOfService("https://swagger.io/terms/")
                .license(new License().name("Apache 2.0").url("https://springdoc.org")));
  }
}
