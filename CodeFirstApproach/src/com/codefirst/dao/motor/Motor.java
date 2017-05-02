package com.codefirst.dao.motor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity()
@IdClass(MotorID.class)
public class Motor {
	@Id
	private int serialNumber;
	@Id
	private String countryCode;
	private String brand;
	private String model;
	private String year;
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Motor [serialNumber=" + serialNumber + ", countryCode=" + countryCode + ", brand=" + brand + ", model="
				+ model + ", year=" + year + "]";
	}
}
