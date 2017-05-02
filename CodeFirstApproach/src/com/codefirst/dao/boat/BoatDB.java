package com.codefirst.dao.boat;

import java.util.List;

import javax.persistence.EntityManager;
import com.codefirst.EntityManager.*;

public class BoatDB implements BoatDAO{
	
	private static EntityManager myEntityManager;
	
	static{
		myEntityManager = EntityManagerInctance.getMyEntityManager();
	}

	@Override
	public List<Boat> getAllBoats() {
		List<Boat> listBoats = myEntityManager.createQuery("select b from BOAT b").getResultList();
		return listBoats;
	}

	@Override
	public Boat getBoatByID(BoatID id) {
		Boat tmp = myEntityManager.find(Boat.class, id);
		return tmp;
	}

	@Override
	public void createBoat(Boat b) {
		myEntityManager.getTransaction().begin();
		myEntityManager.merge(b);
		myEntityManager.getTransaction().commit();
	}

	@Override
	public void deleteBoat(BoatID id) {
		myEntityManager.getTransaction().begin();
		Boat tmp = myEntityManager.find(Boat.class, id);
		myEntityManager.remove(tmp);
		myEntityManager.getTransaction().commit();
	}

	@Override
	public void updateBoat(BoatID id) {
		myEntityManager.getTransaction().begin();
		myEntityManager.find(Boat.class, id);
		myEntityManager.getTransaction().commit();
	}

}
