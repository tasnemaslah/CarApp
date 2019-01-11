package com.packt.CarApp.domain;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarRepository extends PagingAndSortingRepository <Car, Long>{

	// Fetch cars by brand
	  List<Car> findByBrand(String brand);

	  // Fetch cars by color
	  List<Car> findByColor(String color);

	  // Fetch cars by year
	  List<Car> findByYear(int year);


}
