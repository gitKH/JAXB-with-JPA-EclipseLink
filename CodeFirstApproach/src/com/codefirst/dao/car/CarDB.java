package com.codefirst.dao.car;

import java.util.List;
import com.codefirst.EntityManager.*;

import javax.persistence.EntityManager;

import com.codefirst.dao.car.Car;
import com.codefirst.dao.car.carType.CarType;
import com.codefirst.dao.car.carType.CarTypeDB;

public class CarDB implements CarDAO{

	private static EntityManager myEntityManager;

	static {
		myEntityManager = EntityManagerInctance.getMyEntityManager();
	}

	public CarDB() {
		initialize();
	}

	public List<Car> getAllCars() {
		myEntityManager.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<Car> carList = myEntityManager.createQuery("select c from Car c").getResultList();
		myEntityManager.getTransaction().commit();
		return carList;
	}

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

	public void createCar(Car c) {
		myEntityManager.getTransaction().begin();
		myEntityManager.persist(c);
		myEntityManager.getTransaction().commit();
	}

	public void deleteCar(int id) {
		myEntityManager.getTransaction().begin();
		Car tmp = myEntityManager.find(Car.class, id);
		myEntityManager.remove(tmp);
		myEntityManager.getTransaction().commit();
	}

	public void updateCar(Car c) {
		myEntityManager.getTransaction().begin();
		Car tmp = myEntityManager.find(Car.class, c.getCarID());
		myEntityManager.getTransaction().commit();
	}


	private void initialize() {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();

		c1.setBrand("VW");
		c1.setModel("Polo");
		c2.setBrand("Seat");
		c2.setModel("Ibiza");
		c3.setBrand("Toyota");
		c3.setModel("Yaris");

		createCar(c1);
		createCar(c2);
		createCar(c3);
	}
}
