package com.codefirst.dao.motor;

import java.util.List;

import javax.persistence.EntityManager;

import com.codefirst.EntityManager.*;

public class MotorDB implements MotorDAO {

	private static EntityManager myEntityManager;

	static {
		myEntityManager = EntityManagerInctance.getMyEntityManager();
	}

	public List<Motor> getAllMotor() {
		List<Motor> listMotor;
		listMotor = myEntityManager.createQuery("select m from Motor m").getResultList();
		return listMotor;
	}

	public Motor getMotorByID(MotorID id) {
		
		Motor m = null;
		for (Motor tmp : this.getAllMotor()) {
			if(tmp.getSerialNumber() == id.getSerialNumber() 
					&& tmp.getCountryCode() == id.getCountryCode()){
				m = tmp;
			}
		}
		return m;
	}

	public void createMotor(Motor motor) {
		myEntityManager.getTransaction().begin();
		myEntityManager.merge(motor);
		myEntityManager.getTransaction().commit();
	}

	public void deleteMotor(MotorID id) {
		myEntityManager.getTransaction().begin();
		Motor tmp = myEntityManager.find(Motor.class, id);
		myEntityManager.remove(tmp);
		myEntityManager.getTransaction().commit();
	}

	public void updateMotor(MotorID id) {
		myEntityManager.find(Motor.class, id);
	}

}
