package com.cars.autodata.service;

import java.util.List;

import com.cars.autodata.model.Vehicle;

public interface VehicleManager {
	void insertVehicle(Vehicle vehicle);
	Vehicle getVehicleById(long vehicleId);
	List<Vehicle> getVehicles();
}
