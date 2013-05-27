package com.cars.autodata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "VEHICLE_MAKE")
public class VehicleMake {

	private long vehicleMakeId;
	private String vehicleMakeName;
	
	public VehicleMake() {
	}
	
	public VehicleMake(long vehicleMakeId, String vehicleMakeName) {
		super();
		this.vehicleMakeId = vehicleMakeId;
		this.vehicleMakeName = vehicleMakeName;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("vehicleMakeId", vehicleMakeId).append("vehicleMakeName", vehicleMakeName).toString();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_MAKE_ID", nullable = false)
	public long getVehicleMakeId() {
		return vehicleMakeId;
	}

	public void setVehicleMakeId(long id) {
		this.vehicleMakeId = id;
	}

	@Column(name = "VEHICLE_MAKE_NAME")
	public String getVehicleMakeName() {
		return vehicleMakeName;
	}

	public void setVehicleMakeName(String name) {
		this.vehicleMakeName = name;
	}
}
