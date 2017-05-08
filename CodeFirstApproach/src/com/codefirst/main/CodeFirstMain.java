package com.codefirst.main;

import java.util.List;
import com.codefirst.dao.boat.*;
import com.codefirst.dao.car.*;
import com.codefirst.dao.car.carType.CarType;
import com.codefirst.dao.car.carType.CarTypeDAO;
import com.codefirst.dao.car.carType.CarTypeDB;
import com.codefirst.dao.country.CountryDAO;
import com.codefirst.dao.country.CountryDB;
import com.codefirst.dao.motor.*;

public class CodeFirstMain {
	static CarDAO carDB = new CarDB();
	static MotorDAO motorDB = new MotorDB();
	static BoatDAO boatDB = new BoatDB();
	static CarTypeDAO carTypeDB = new CarTypeDB();
	static CountryDAO countryDB = new CountryDB();

	public static void main(String[] args) {
		System.out.println("JPA test cases...");
		
		
		System.out.println("End");
	}

}
