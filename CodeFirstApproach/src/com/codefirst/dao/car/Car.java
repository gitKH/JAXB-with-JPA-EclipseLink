package com.codefirst.dao.car;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.codefirst.dao.car.carType.CarType;
import com.codefirst.dao.country.Country;

@Entity()
@Table(name = "CAR")
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CID", nullable = false)
	public int carID;
	@Column(name = "CBRAND")
	private String brand;
	@Column(name = "CMODEL")
	private String model;
	@Transient
	private String year;
	@ManyToOne()
	@JoinColumn(name = "carType_id")
	private CarType carType;
	@ManyToMany
	@JoinTable(name="CarCountry", 
	joinColumns=@JoinColumn(name="CAR_ID",referencedColumnName="CID"),
	inverseJoinColumns=@JoinColumn(name="COUNTRY_ID",referencedColumnName="countryId"))
	private Collection<Country> countryCollection;

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

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Collection<Country> getCountryCollection() {
		return countryCollection;
	}

	public void setCountryCollection(Collection<Country> countryCollection) {
		this.countryCollection = countryCollection;
	}

	@Override
	public String toString() {
		return "Car [carID=" + carID + ", brand=" + brand + ", model=" + model
				+ ", year=" + year + ", carType=" + carType
				+ ", countryCollection=" + countryCollection + "]";
	}
}
