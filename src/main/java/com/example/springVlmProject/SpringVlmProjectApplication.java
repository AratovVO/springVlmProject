package com.example.springVlmProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories

public class SpringVlmProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringVlmProjectApplication.class, args);
	}

}
