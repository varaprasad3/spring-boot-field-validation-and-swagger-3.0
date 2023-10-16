package com.datavalidator.datavalidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication(scanBasePackages = "com.datavalidator")
@EnableJpaRepositories(basePackages = "com.datavalidator")
@EntityScan(basePackages = "com.datavalidator")      
@OpenAPIDefinition(info = @Info(title = "implementing swagger api", version = "1.0.0", description = "this is just a demo application used to implement swagger", termsOfService = "runcodenow", contact = @Contact(name = "varaprasad", email = "varaprasad0855@gmail.com"), license = @License(name = "varaprasad", url = "www.leetcode.com"))

)
public class DatavalidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatavalidatorApplication.class, args);
	}

}
       