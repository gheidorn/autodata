package com.cars.autodata.service;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cars.autodata.model.VehicleMake;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml" })
@Transactional
public class TestVehicleMakeManager extends TestCase {

	@Autowired
	VehicleMakeManager vehicleMakeManager;

	@Test
	public void testGetVehicleMake() {
		VehicleMake vm = vehicleMakeManager.getVehicleMakeById(2);
		assertEquals("expected Toyota", "Toyota", vm.getVehicleMakeName());
	}

	@Test
	public void testGetVehicles() {
		List<VehicleMake> vms = vehicleMakeManager.getVehicleMakes();
		assertEquals("expected more than one vehicle make returned", true, vms.size() > 1);
	}

	@Test
	public void testInsertVehicle() {
		VehicleMake vm = new VehicleMake();
		vm.setVehicleMakeName("Mercedes");
		vehicleMakeManager.insertVehicleMake(vm);
	}
}
