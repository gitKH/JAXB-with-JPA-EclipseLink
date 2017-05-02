package com.codefirst.dao.boat;

import java.util.List;

public interface BoatDAO {
	public List<Boat> getAllBoats();
	public Boat getBoatByID(BoatID id);
	public void createBoat(Boat b);
	public void deleteBoat(BoatID id);
	public void updateBoat(BoatID b);
}
