package com.codefirst.dao.country;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.codefirst.dao.car.Car;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int countryId;
	private String countryName;
	@ManyToMany(mappedBy="countryCollection")
	private Collection<Car> carCollection;
	
	public Country(){
		
	}
	
	public Country(String countryName){
		this.countryName = countryName;
	}
	
	public int getCountryId() {
		return countryId;
	}
	
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName="
				+ countryName + "]";
	}
}
