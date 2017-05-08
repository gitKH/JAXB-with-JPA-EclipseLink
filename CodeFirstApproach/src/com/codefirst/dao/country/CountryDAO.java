package com.codefirst.dao.country;

import java.util.List;

public interface CountryDAO {
	public List<Country> getAllCountries();
	public Country getCountryByID(int id);
	public void createCountry(Country c);
	public void deleteCountry(int id);
	public void updateCountry(Country c);
}
