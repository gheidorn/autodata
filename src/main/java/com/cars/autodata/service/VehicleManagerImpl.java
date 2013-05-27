package com.cars.autodata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cars.autodata.dao.VehicleDAO;
import com.cars.autodata.model.Vehicle;

@Service
public class VehicleManagerImpl implements VehicleManager {

	@Autowired
	private VehicleDAO vehicleDAO;

	@Transactional
	public void insertVehicle(Vehicle vehicle) {
		vehicleDAO.insertVehicle(vehicle);
	}

	@Transactional
	public Vehicle getVehicleById(long vehicleId) {
		return vehicleDAO.getVehicleById(vehicleId);
	}

	@Transactional
	public List<Vehicle> getVehicles() {
		return vehicleDAO.getVehicles();
	}

}
