package com.codefirst.dao.car;

import java.util.List;
import com.codefirst.EntityManager.*;

import javax.persistence.EntityManager;

import com.codefirst.dao.car.Car;

public class CarDB implements CarDAO {

	private static EntityManager myEntityManager;

	static {
		myEntityManager = EntityManagerInctance.getMyEntityManager();
	}

	public CarDB() {
		initialize();
	}

	@Override
	public List<Car> getAllCars() {
		myEntityManager.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Car> carList = myEntityManager.createQuery("select c from Car c").getResultList();
		myEntityManager.getTransaction().commit();
		return carList;
	}

	@Override
	public Car getCarByID(int id) {
		Car c = null;
		for (Car tmp : this.getAllCars()) {
			if (tmp.getCarID() == id) {
				c = tmp;
				break;
			}
		}
		return c;
	}

	@Override
	public void createCar(Car c) {
		myEntityManager.getTransaction().begin();
		myEntityManager.merge(c);
		myEntityManager.getTransaction().commit();
	}

	@Override
	public void deleteCar(int id) {
		myEntityManager.getTransaction().begin();
		Car tmp = myEntityManager.find(Car.class, id);
		myEntityManager.remove(tmp);
		myEntityManager.getTransaction().commit();
	}

	@Override
	public void updateCar(Car c) {
		myEntityManager.getTransaction().begin();
		Car tmp = myEntityManager.find(Car.class, c.getCarID());
		myEntityManager.getTransaction().commit();
	}


	private void initialize() {
		Car c1 = new Car();
		Car c2 = new Car();

		c1.setBrand("VW");
		c1.setModel("Polo");
		c2.setBrand("Seat");
		c2.setModel("Ibiza");

		createCar(c1);
		createCar(c2);
	}
}
