package com.perscholas.springdatajpa;

import com.perscholas.springdatajpa.data.EmployeeRepository;
import com.perscholas.springdatajpa.models.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeRepository repository) {
		return (args -> {
			insertJavaAdvocates(repository);
			System.out.println(repository.findAll());
		});
	}

	private void insertJavaAdvocates(EmployeeRepository repo) {
		repo.save(new Employee("Dalia", "Abo Sheasha"));
		repo.save(new Employee("Trisha", "Gee"));
		repo.save(new Employee("Helen", "Scott"));
		repo.save(new Employee("Mala", "Gupta"));
	}

}
