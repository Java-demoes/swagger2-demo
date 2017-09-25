package com.demo.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by Preetham on 26/09/17.
 * @author Preetham
 * @version 1
 * this class contains is the primary interface for swagger-springmvc framework
 * contains sensible defaults and convenience methods
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.demo.controllers"))
                .paths(regex("/product.*"))
                .build();
    }
}
