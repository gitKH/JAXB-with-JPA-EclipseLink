package com.codefirst.dao.car;

import java.util.List;

import com.codefirst.dao.car.Car;
import com.codefirst.dao.car.carType.CarType;

public interface CarDAO {
	public List<Car> getAllCars();
	public Car getCarByID(int id);
	public void createCar(Car c, CarType ct);
	public void deleteCar(int id);
	public void updateCar(Car c);
}
