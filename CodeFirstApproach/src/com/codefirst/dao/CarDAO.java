package com.codefirst.dao;

import java.util.List;
import com.codefirst.dao.Car;

public interface CarDAO {
	public List<Car> getAllCars();
	public Car getCarByID(int id);
	public void createCar(Car c);
	public void deleteCar(int id);
	public void updateCar(Car c);
}
