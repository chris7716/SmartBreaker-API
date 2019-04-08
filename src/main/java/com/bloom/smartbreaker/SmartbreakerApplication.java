package com.bloom.smartbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SmartbreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartbreakerApplication.class, args);
	}

}
