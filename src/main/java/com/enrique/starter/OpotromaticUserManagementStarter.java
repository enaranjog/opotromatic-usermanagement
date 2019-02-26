package com.enrique.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableJpaRepositories(basePackages = { "com.enrique.repositories" })
@SpringBootApplication(scanBasePackages = { "com.enrique.managers", "com.enrique.controller", "com.enrique.services" })
@EntityScan(basePackages = { "com.enrique.entities" })
public class OpotromaticUserManagementStarter implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("*").allowedHeaders("*").allowCredentials(false)
				.maxAge(4800);
	}

	public static void main(String[] args) {
		SpringApplication.run(OpotromaticUserManagementStarter.class, args);
	}
}
