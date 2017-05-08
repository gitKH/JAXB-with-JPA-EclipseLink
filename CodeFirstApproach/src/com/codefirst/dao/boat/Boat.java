package com.codefirst.dao.boat;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Boat {
	@EmbeddedId
	private BoatID boadId;
	private String brand;
	private String model;
	private int year;
	@Temporal(TemporalType.TIMESTAMP)
	private Date boughtDate;

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

	public Date getBoughtDate() {
		return boughtDate;
	}

	public void setBoughtDate(Date boughtDate) {
		this.boughtDate = boughtDate;
	}

	@Override
	public String toString() {
		return "Boat [boadId=" + boadId + ", brand=" + brand + ", model=" + model + ", year=" + year + ", boughtDate="
				+ boughtDate + "]";
	}

}
