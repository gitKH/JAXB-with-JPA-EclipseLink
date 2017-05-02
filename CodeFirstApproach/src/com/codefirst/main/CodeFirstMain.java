package com.codefirst.main;

import java.util.Arrays;
import java.util.List;
import com.codefirst.dao.boat.*;
import com.codefirst.dao.car.*;
import com.codefirst.dao.motor.*;

public class CodeFirstMain {
	static CarDAO carDB = new CarDB();
	static MotorDAO motorDB = new MotorDB();
	static BoatDAO boatDB = new BoatDB();


	public static void main(String[] args) {
		System.out.println("JPA test cases...");
		
		Boat b = new Boat();
		b.setBrand("Wellcraft");
		b.setModel("dolphin 100");
		b.setBoadId(new BoatID(1001,"GR"));
		
		boatDB.createBoat(b);
		
		Boat tmp = boatDB.getBoatByID(b.getBoadId());
		tmp.setYear(2010);
		boatDB.updateBoat(tmp.getBoadId());
		
		boatDB.deleteBoat(b.getBoadId());
		
		System.out.println("End");
	}

}
