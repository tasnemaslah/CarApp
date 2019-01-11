package com.packt.CarApp.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TripRepository extends PagingAndSortingRepository <Trip, Long>{

	
}
