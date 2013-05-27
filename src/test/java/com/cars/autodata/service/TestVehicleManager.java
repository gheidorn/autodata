package com.cars.autodata.service;

import java.math.BigDecimal;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cars.autodata.model.Vehicle;
import com.cars.autodata.model.VehicleMake;
import com.cars.autodata.model.VehicleModel;
import com.cars.autodata.model.VehicleYear;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml" })
@Transactional
public class TestVehicleManager extends TestCase {

	@Autowired
	VehicleManager vehicleManager;
	
	@Test
	public void testGetVehicle() {
		Vehicle vehicle = vehicleManager.getVehicleById(2);
		assertEquals("expected Honda", "Honda", vehicle.getVehicleMake().getVehicleMakeName());
	}
	
	@Test
	public void testGetVehicles() {
		List<Vehicle> vehicles = vehicleManager.getVehicles();
		assertEquals("expected more than one vehicle returned", true, vehicles.size() > 1);
	}
	
	@Test
	public void testInsertVehicle() {
		Vehicle v = new Vehicle();
		v.setPrice(new BigDecimal(9999.99));
		v.setVehicleMake(new VehicleMake(1, "Honda"));
		v.setVehicleModel(new VehicleModel(1, "Accord"));
		v.setVehicleYear(new VehicleYear(1, 2010));
		vehicleManager.insertVehicle(v);
	}
}
