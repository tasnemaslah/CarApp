package com.packt.CarApp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.packt.CarApp.domain.Car;
import com.packt.CarApp.domain.CarRepository;
import com.packt.CarApp.domain.Owner;
import com.packt.CarApp.domain.OwnerRepository;
import com.packt.CarApp.domain.Trip;
import com.packt.CarApp.domain.TripRepository;




	@SpringBootApplication
	public class CarAppApplication {

		@Autowired 
	    private CarRepository repository;
		
		@Autowired 
	    private OwnerRepository orepository;

		@Autowired 
	    private TripRepository trepository;
		
		public static void main(String[] args) {
			SpringApplication.run(CarAppApplication.class, args);
		
			System.out.println("Test");
		}
		
		@Bean
	    CommandLineRunner runner(){
	      return args -> {
	    	// Add owner objects and save these to db
	          Owner owner1 = new Owner("John" , "Johnson");
	          Owner owner2 = new Owner("Mary" , "Robinson");
	          orepository.save(owner1);
	          orepository.save(owner2);
	          
	          //Add trip objects
	          Trip trip1 = new Trip("Trip A");
	          Trip trip2 = new Trip("Trip B");
	          trepository.save(trip1);
	          trepository.save(trip2);



	          // Add car object with link to owners and save these to db.
	          
	          Set<Trip> trips1= new HashSet<Trip>();
	          trips1.add(trip1);
	          trips1.add(trip2);
	          
	          Set<Trip> trips2= new HashSet<Trip>();
	          trips2.add(trip1);
	          
	          Set<Trip> trips3= new HashSet<Trip>();
	          trips3.add(trip2);
	          
	          Car car = new Car("Ford", "Mustang", "Red", 
	              "ADF-1121", 2017, 59000, owner1,trips1);
	          repository.save(car);
	          car = new Car("Nissan", "Leaf", "White",
	              "SSJ-3002", 2014, 29000, owner2,trips2);
	          repository.save(car);
	          car = new Car("Toyota", "Prius", "Silver",
	              "KKO-0212", 2018, 39000, owner2, trips3);
	          repository.save(car);

	      };
	    } 


	}



