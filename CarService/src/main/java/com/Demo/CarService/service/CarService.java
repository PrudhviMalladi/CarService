package com.Demo.CarService.service;

import java.util.List;

import com.Demo.CarService.model.Car;

public interface CarService {

	Car saveCar(Car car);
	
	List<Car> fetchCarList();
	
	Car updateCar (Car car, int CarId);
	void deleteCarById(int CarId);
	
}
