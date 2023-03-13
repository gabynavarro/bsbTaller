package com.bsb.taller.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.Contact;
import java.util.Collections;

public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())

                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Bootcamp de Gabriel Navarro",
                "APIs realizadas by Gabriel Navarro",
                "V1",
                "URL de termino y servicios",
                new Contact("ce: 2615983473", "www.tagssoltions.net", "alt64b@mail.com"),
                "Licencia API",
                "URL LICENCIA API",
                Collections.emptyList()
        );
    }
}
