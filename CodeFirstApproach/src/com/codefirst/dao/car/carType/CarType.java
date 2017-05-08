package com.codefirst.dao.car.carType;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.codefirst.dao.car.Car;

@Entity
public class CarType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carTypeId;
	private String carType;
	
	//@OneToMany(mappedBy = "carType")
	//private List<Car> cars;

	public CarType() {

	}

	public CarType(String carType) {
		this.carType = carType;
	}

	public String getCarType() {
		return carType;
	}

	public int getCarTypeId() {
		return carTypeId;
	}

	@Override
	public String toString() {
		return "CarType [carTypeId=" + carTypeId + ", carType=" + carType + ", cars=" + "Change me" + "]";
	}
	

}
