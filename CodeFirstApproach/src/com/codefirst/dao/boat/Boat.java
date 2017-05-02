package com.codefirst.dao.boat;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Boat {
	@EmbeddedId
	private BoatID boadId;
	private String brand;
	private String model;
	private int year;
	
	public BoatID getBoadId() {
		return boadId;
	}
	public void setBoadId(BoatID boadId) {
		this.boadId = boadId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
