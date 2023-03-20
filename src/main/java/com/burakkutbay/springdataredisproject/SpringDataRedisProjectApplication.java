package com.burakkutbay.springdataredisproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringDataRedisProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisProjectApplication.class, args);
	}

}
