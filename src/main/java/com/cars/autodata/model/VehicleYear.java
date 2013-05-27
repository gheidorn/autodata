package com.cars.autodata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "VEHICLE_YEAR")
public class VehicleYear {

	private long vehicleYearId;
	private int vehicleYearValue;

	public VehicleYear() {
	}

	public VehicleYear(long vehicleYearId, int vehicleYearValue) {
		super();
		this.vehicleYearId = vehicleYearId;
		this.vehicleYearValue = vehicleYearValue;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("vehicleYearId", vehicleYearId).append("vehicleYearValue", vehicleYearValue).toString();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_YEAR_ID", nullable = false)
	public long getVehicleYearId() {
		return vehicleYearId;
	}

	public void setVehicleYearId(long id) {
		this.vehicleYearId = id;
	}

	@Column(name = "VEHICLE_YEAR_VALUE")
	public int getVehicleYearValue() {
		return vehicleYearValue;
	}

	public void setVehicleYearValue(int value) {
		this.vehicleYearValue = value;
	}

}
