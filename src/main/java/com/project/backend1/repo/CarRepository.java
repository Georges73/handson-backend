package com.project.backend1.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.backend1.domain.Car;

public interface CarRepository extends CrudRepository <Car, Long> {
	// Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(String brand);
}