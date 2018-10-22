package com.project.backend1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.backend1.domain.Car;
import com.project.backend1.domain.Owner;
import com.project.backend1.domain.User;
import com.project.backend1.repo.CarRepository;
import com.project.backend1.repo.OwnerRepository;
import com.project.backend1.repo.UserRepository;

@SpringBootApplication
public class Backend1Application {
	
	@Autowired	
	private CarRepository repository;

	@Autowired	
	private OwnerRepository orepository;
	@Autowired	

	private UserRepository urepository;

	public static void main(String[] args) {
		SpringApplication.run(Backend1Application.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Owner owner1 = new Owner("John" , "Johnson");
			Owner owner2 = new Owner("Mary" , "Robinson");
			orepository.save(owner1);
			orepository.save(owner2);
			
			repository.save(new Car("Renault", "Clio", "Red", "ADF-1121", 2017, 59000, owner1));
			repository.save(new Car("Nissan", "Micra", "White", "SSJ-3002", 2014, 29000, owner2));
			repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner2));
			
			urepository.save(new User("user", "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER"));

			urepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "ADMIN"));
		};
}
}
