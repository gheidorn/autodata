package com.cars.autodata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cars.autodata.dao.VehicleMakeDAO;
import com.cars.autodata.model.VehicleMake;

@Service
public class VehicleMakeManagerImpl implements VehicleMakeManager {

	@Autowired
	private VehicleMakeDAO vehicleMakeDAO;

	@Transactional
	public void insertVehicleMake(VehicleMake vehicleMake) {
		vehicleMakeDAO.insertVehicleMake(vehicleMake);
	}

	@Transactional
	public VehicleMake getVehicleMakeById(long vehicleMakeId) {
		return vehicleMakeDAO.getVehicleMakeById(vehicleMakeId);
	}

	@Transactional
	public List<VehicleMake> getVehicleMakes() {
		return vehicleMakeDAO.getVehicleMakes();
	}

}
