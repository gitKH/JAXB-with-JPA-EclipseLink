package com.codefirst.dao.car.carType;

import java.util.List;

import javax.persistence.EntityManager;

import com.codefirst.EntityManager.EntityManagerInctance;


public class CarTypeDB implements CarTypeDAO{
	
	private static EntityManager myEntityManager;
	
	static{
		myEntityManager = EntityManagerInctance.getMyEntityManager();
	}
	
	public CarTypeDB(){
		//initilizeCarType();
	}

	public List<CarType> getAllCarTypes() {
		List<CarType> listCarTypes = myEntityManager.createQuery("select c from CarType c").getResultList();
		return listCarTypes;
	}

	public CarType getCarTypeByID(int id) {
		CarType tmp = myEntityManager.find(CarType.class, id);
		return tmp;
	}

	public void createCarType(CarType ct) {
		myEntityManager.getTransaction().begin();
		myEntityManager.persist(ct);
		myEntityManager.getTransaction().commit();
	}

	public void deleteCarType(int id) {
		myEntityManager.getTransaction().begin();
		CarType tmp = myEntityManager.find(CarType.class, id);
		myEntityManager.remove(tmp);
		myEntityManager.getTransaction().commit();
	}

	public void updateCarType(CarType ct) {
		myEntityManager.getTransaction().begin();
		myEntityManager.find(CarType.class, ct);
		myEntityManager.getTransaction().commit();
	}
	
	private void initilizeCarType(){
		CarType ct1 = new CarType("Jeep");
		CarType ct2 = new CarType("SUV");
		CarType ct3 = new CarType("Sedan");
		CarType ct4 = new CarType("Cabrio");
		
		myEntityManager.getTransaction().begin();
		myEntityManager.persist(ct1);
		myEntityManager.persist(ct2);
		myEntityManager.persist(ct3);
		myEntityManager.persist(ct4);
		myEntityManager.getTransaction().commit();
	}

}
