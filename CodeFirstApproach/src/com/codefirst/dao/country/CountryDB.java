package com.codefirst.dao.country;

import java.util.List;

import javax.persistence.EntityManager;

import com.codefirst.EntityManager.EntityManagerInctance;
import com.codefirst.dao.car.carType.CarType;

public class CountryDB implements CountryDAO {
	private static EntityManager myEntityManager;

	static {
		myEntityManager = EntityManagerInctance.getMyEntityManager();
	}
	
	public CountryDB(){
		initialize();
	}

	public List<Country> getAllCountries() {
		List<Country> listCountry = myEntityManager.createQuery(
				"select c from Country c").getResultList();
		return listCountry;
	}

	public Country getCountryByID(int id) {
		Country tmp = myEntityManager.find(Country.class, id);
		return tmp;
	}

	public void createCountry(Country c) {
		myEntityManager.getTransaction().begin();
		myEntityManager.persist(c);
		myEntityManager.getTransaction().commit();
	}

	public void deleteCountry(int id) {
		myEntityManager.getTransaction().begin();
		Country tmp = myEntityManager.find(Country.class, id);
		myEntityManager.remove(tmp);
		myEntityManager.getTransaction().commit();
	}

	public void updateCountry(Country c) {
		myEntityManager.getTransaction().begin();
		myEntityManager.find(CarType.class, c);
		myEntityManager.getTransaction().commit();
	}
	
	public void initialize(){
		Country c1 = new Country("Germany");
		Country c2 = new Country("Italy");
		Country c3 = new Country("Japan");
		
		createCountry(c1);
		createCountry(c2);
		createCountry(c3);
	}
}
