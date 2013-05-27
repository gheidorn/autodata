package com.cars.autodata.dao;

import java.util.List;

import com.cars.autodata.model.VehicleMake;

public interface VehicleMakeDAO {
	void insertVehicleMake(VehicleMake vehicleMake);
	VehicleMake getVehicleMakeById(long vehicleMakeId);
	List<VehicleMake> getVehicleMakes();
}
