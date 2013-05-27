package com.cars.autodata.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.autodata.model.VehicleMake;

@Service
public class VehicleMakeDAOImpl implements VehicleMakeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public VehicleMake getVehicleMakeById(long vehicleMakeId) {
		return (VehicleMake) sessionFactory.getCurrentSession().get(VehicleMake.class, vehicleMakeId);
	}

	@SuppressWarnings("unchecked")
	public List<VehicleMake> getVehicleMakes() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(VehicleMake.class);
		return criteria.list();
	}

	public void insertVehicleMake(VehicleMake vehicleMake) {
		sessionFactory.getCurrentSession().save(vehicleMake);
	};
}
