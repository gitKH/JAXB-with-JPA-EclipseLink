package com.codefirst.dao.car;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity()
@Table(name="CAR")
public class Car implements Serializable {
	@Id
	/*
	 * Identity id generation is supported on MySQL and the database takes the control 
	 * and JPA does not act.  
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CID")
	public int carID;
	@Column(name="CBRAND")
	private String brand;
	@Column(name="CMODEL")
	private String model;
	@Transient 
	private String year;
	
	public int getCarID() {
		return carID;
	}
	public void setCarID(int carID) {
		this.carID = carID;
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
}
