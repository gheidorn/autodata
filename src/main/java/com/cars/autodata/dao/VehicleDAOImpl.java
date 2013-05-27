package com.cars.autodata.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.autodata.model.Vehicle;

@Service
public class VehicleDAOImpl implements VehicleDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void insertVehicle(Vehicle vehicle) {
		sessionFactory.getCurrentSession().save(vehicle);
	}

	public Vehicle getVehicleById(long vehicleId) {
		return (Vehicle) sessionFactory.getCurrentSession().get(Vehicle.class, vehicleId);
	}

	@SuppressWarnings("unchecked")
	public List<Vehicle> getVehicles() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Vehicle.class);
		return criteria.list();
	}

}
