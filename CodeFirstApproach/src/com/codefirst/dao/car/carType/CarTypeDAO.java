package com.codefirst.dao.car.carType;

import java.util.List;

public interface CarTypeDAO {
	public List<CarType> getAllCarTypes();
	public CarType getCarTypeByID(int id);
	public void createCarType(CarType ct);
	public void deleteCarType(int id);
	public void updateCarType(CarType ct);
}
