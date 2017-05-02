package com.codefirst.dao.motor;

import java.io.Serializable;

import javax.persistence.Id;

public class MotorID implements Serializable{
	private int serialNumber;
	private String countryCode;
	
	public MotorID() {
		
	}
	
	public MotorID(int serialNumber, String countryCode) {
		this.serialNumber = serialNumber;
		this.countryCode = countryCode;
	}
	
	
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	@Override
	public int hashCode() {
		return serialNumber + countryCode.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MotorID){
			MotorID id = (MotorID) obj;
			return id.serialNumber == this.serialNumber && id.countryCode.equals(this.countryCode);
		}
		return false;
	}
}
