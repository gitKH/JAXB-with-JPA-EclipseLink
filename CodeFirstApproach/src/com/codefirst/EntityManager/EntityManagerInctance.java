package com.codefirst.EntityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerInctance {
	private static final EntityManagerFactory emfactory;
	
	static{
		try {
			emfactory = Persistence.createEntityManagerFactory("CodeFirstApproach");
		} catch (Throwable e) {
			System.err.println(e.toString());
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static EntityManager getMyEntityManager(){
		return emfactory.createEntityManager();
	}
}
