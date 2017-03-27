package com.cedric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurerAdapter() {
	    	@Override
	    	public void addCorsMappings(CorsRegistry registry) {
	    		registry.addMapping("/**")
	    			.allowedOrigins("http://localhost:4200")
	    			.allowedMethods("PUT", "DELETE","POST")
	    			.allowedHeaders("header1", "header2", "header3")
	    			.exposedHeaders("header1", "header2")
	    			.allowCredentials(true).maxAge(3600);
	    	}
	    };
	}
}
