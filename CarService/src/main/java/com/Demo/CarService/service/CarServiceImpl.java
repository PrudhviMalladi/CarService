package com.Demo.CarService.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.CarService.model.Car;
import com.Demo.CarService.repository.CarREpo;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarREpo carRepo;
	

	@Override
	public Car saveCar(Car car) {
		// TODO Auto-generated method stub
		return carRepo.save(car);
	}

	@Override
	public List<Car> fetchCarList() {
		// TODO Auto-generated method stub
		return (List<Car>)
				carRepo.findAll();
	}

	@Override
	public Car updateCar(Car car, int CarId)
	{
		Car carcr =carRepo.findById(CarId).get();
		if(Objects.nonNull(car.getName())
				&& !"" .equalsIgnoreCase(
						car.getName())) {
			carcr.setName(car.getName());
			
		}
		if(Objects.nonNull(car.getModule())
				&& !"" .equalsIgnoreCase(car.getModule())) {
			carcr.setModule(car.getModule());
		}
		if(Objects.nonNull(car.getBrand())
				&& !"" .equalsIgnoreCase(car.getBrand())) {
			carcr.setBrand(car.getBrand());
		}
		return carRepo.save(carcr);
	}

	@Override
	public void deleteCarById(int CarId) {
		// TODO Auto-generated method stub
		carRepo.deleteById(CarId);
	}
	

	
}
