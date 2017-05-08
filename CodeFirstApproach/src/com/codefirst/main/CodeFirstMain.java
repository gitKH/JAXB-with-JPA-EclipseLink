package com.codefirst.main;

import java.util.Date;
import com.codefirst.dao.boat.*;
import com.codefirst.dao.car.*;
import com.codefirst.dao.car.carType.CarType;
import com.codefirst.dao.car.carType.CarTypeDAO;
import com.codefirst.dao.car.carType.CarTypeDB;
import com.codefirst.dao.motor.*;

public class CodeFirstMain {
	static CarDAO carDB = new CarDB();
	static MotorDAO motorDB = new MotorDB();
	static BoatDAO boatDB = new BoatDB();
	static CarTypeDAO carTypeDB = new CarTypeDB();

	public static void main(String[] args) {
		System.out.println("JPA test cases...");
		
		CarType ct = new CarType("Jeep");
		
		Car c = new Car();
		c.setBrand("VW");
		c.setModel("EOS");
		c.setCarType(ct);
		
		carTypeDB.createCarType(ct);
		carDB.createCar(c,null);
		
		System.out.println("End");
	}

}
