package com.codefirst.main;

import java.util.List;

import com.codefirst.dao.*;

public class CodeFirstMain {
	static CarDAO carDB = new CarDB();

	public static void main(String[] args) {
		System.out.println("JPA test cases...");
		printDB();
		Car tmp = carDB.getCarByID(1);
		tmp.setModel("Golf");
		carDB.updateCar(tmp);
		printDB();
		carDB.deleteCar(2);
		printDB();
	}

	public static void printDB() {
		List<Car> list = carDB.getAllCars();

		for (Car c : list) {
			System.out.println(c.getCarID() + " " + c.getBrand() 
					+ " " + c.getModel());
		}
	}
}
