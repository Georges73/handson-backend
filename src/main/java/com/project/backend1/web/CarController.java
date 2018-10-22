package com.project.backend1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend1.domain.Car;
import com.project.backend1.repo.CarRepository;

@RestController

public class CarController {

	@Autowired

	private CarRepository repository;

	

	@RequestMapping("/cars")
	public Iterable<Car> getCars() {

		return repository.findAll();

	}

}