package com.packt.CarApp.domain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OwnerRepository extends PagingAndSortingRepository <Owner, Long>{

	

}
