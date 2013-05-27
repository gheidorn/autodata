package com.cars.autodata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "VEHICLE_MODEL")
public class VehicleModel {

	private long vehicleModelId;
	private String vehicleModelName;

	public VehicleModel() {
	}
	
	public VehicleModel(long vehicleModelId, String vehicleModelName) {
		super();
		this.vehicleModelId = vehicleModelId;
		this.vehicleModelName = vehicleModelName;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("vehicleModelId", vehicleModelId).append("vehicleModelName", vehicleModelName).toString();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_MODEL_ID", nullable = false)
	public long getVehicleModelId() {
		return vehicleModelId;
	}

	public void setVehicleModelId(long id) {
		this.vehicleModelId = id;
	}

	@Column(name = "VEHICLE_MODEL_NAME")
	public String getVehicleModelName() {
		return vehicleModelName;
	}

	public void setVehicleModelName(String name) {
		this.vehicleModelName = name;
	}

}
