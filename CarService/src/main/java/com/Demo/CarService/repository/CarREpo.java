package com.Demo.CarService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Demo.CarService.model.Car;

@Repository
public interface CarREpo extends JpaRepository<Car, Integer> {
	

}
