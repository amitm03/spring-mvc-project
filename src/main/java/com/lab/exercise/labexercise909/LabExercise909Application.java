package com.lab.exercise.labexercise909;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
public class LabExercise909Application {

	public static void main(String[] args) {
		SpringApplication.run(LabExercise909Application.class, args);
	}

}
