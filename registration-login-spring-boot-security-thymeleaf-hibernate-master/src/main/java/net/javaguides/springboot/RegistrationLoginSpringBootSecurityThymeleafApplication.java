package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RegistrationLoginSpringBootSecurityThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginSpringBootSecurityThymeleafApplication.class, args);
	}
//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
}
