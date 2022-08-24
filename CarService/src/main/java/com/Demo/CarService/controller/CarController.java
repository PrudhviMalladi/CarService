package com.Demo.CarService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.CarService.exception.ResourceNotFoundException;
import com.Demo.CarService.model.Car;
import com.Demo.CarService.repository.CarREpo;
import com.Demo.CarService.service.CarService;

@RestController

public class CarController {
	@Autowired
	private CarService carService;
	
	@PostMapping("/Cars")
	public Car saveCar(
		 @RequestBody Car car) {
		return carService.saveCar(car);
	}
	
	@GetMapping("Cars")
	public List<Car> fetchCarList(){
		return carService.fetchCarList();
		
	}
	@PutMapping("/Cars/{id}")
	public Car
	updateCar(@RequestBody Car car, @PathVariable("id") int CarId) {
		return carService.updateCar(car, CarId);
		
	}
	@DeleteMapping("/Cars/{id}")
		public String deleteCarById(@PathVariable("id") int CarId) 
	{
		carService.deleteCarById(CarId);
			return "	Deleted Successfully";
		
	}
	}
	
	



