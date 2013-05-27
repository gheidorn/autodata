package com.cars.autodata.dao;

import java.util.List;

import com.cars.autodata.model.Vehicle;

public interface VehicleDAO {
	void insertVehicle(Vehicle vehicle);
	Vehicle getVehicleById(long vehicleId);
	List<Vehicle> getVehicles();
}
