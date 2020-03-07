package edu.miu.cs.eShopping;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EShoppingApplication.class, args);
	}
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()  
	          .apis(RequestHandlerSelectors.basePackage("edu.miu.cs.eShopping"))             
	          .paths(PathSelectors.any())                          
	          .build()
	          .apiInfo(apiInfo());                                           
	    }
	    
	    private ApiInfo apiInfo() {
	        return new ApiInfo(
	          "Se", 
	          "online shopping , SE ", 
	          "team 4", 
	          "come", 
	          null, 
	          "", 
	          "www.miu.edu", Collections.emptyList());
	    }
	}


