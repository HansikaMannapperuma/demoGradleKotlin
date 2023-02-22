package com.example.demoGradleKotlin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoGradleKotlinApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGradleKotlinApplication.class, args);
	}
		@Bean
		CommandLineRunner commandLineRunner(StudentRepository studentRepository){
			return args -> {
				Student hansika=new Student(
						"Hansika",
						"Mannapperuma",
						"hansikamannapperuma@gmail.com",
						23);

			};

		}
}
