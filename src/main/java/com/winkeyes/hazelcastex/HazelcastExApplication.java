package com.winkeyes.hazelcastex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@EnableCaching
@SpringBootApplication
public class HazelcastExApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazelcastExApplication.class, args);
	}

}
