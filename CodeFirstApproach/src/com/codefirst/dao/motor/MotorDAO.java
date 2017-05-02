package com.codefirst.dao.motor;

import java.util.List;

import com.codefirst.dao.car.Car;

public interface MotorDAO {
	public List<Motor> getAllMotor();
	public Motor getMotorByID(MotorID id);
	public void createMotor(Motor motor);
	public void deleteMotor(MotorID id);
	public void updateMotor(MotorID id);
}
