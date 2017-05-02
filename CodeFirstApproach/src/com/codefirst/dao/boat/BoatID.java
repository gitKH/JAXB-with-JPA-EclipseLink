package com.codefirst.dao.boat;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BoatID implements Serializable {

	private static final long serialVersionUID = 96639154590001884L;
	private int serialNumber;
	private String countryCode;

	public BoatID() {

	}

	public BoatID(int serialNumber, String countryCode) {
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
		if (obj instanceof Boat) {
			BoatID id = (BoatID) obj;
			return id.getSerialNumber() == this.getSerialNumber() && id.getCountryCode() == this.getCountryCode();
		}

		return false;
	}
}
