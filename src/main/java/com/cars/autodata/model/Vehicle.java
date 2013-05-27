package com.cars.autodata.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

	private long vehicleId;
	private VehicleMake vehicleMake;
	private VehicleModel vehicleModel;
	private VehicleYear vehicleYear;
	private BigDecimal price;

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("vehicleId", vehicleId).append("vehicleMake", vehicleMake).append("vehicleModel", vehicleModel).append("vehicleYear", vehicleYear)
				.append("price", price).toString();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_ID", nullable = false)
	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long id) {
		this.vehicleId = id;
	}

	@ManyToOne
	@JoinColumn(name = "VEHICLE_MAKE_ID")
	public VehicleMake getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(VehicleMake make) {
		this.vehicleMake = make;
	}

	@ManyToOne
	@JoinColumn(name = "VEHICLE_MODEL_ID")
	public VehicleModel getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(VehicleModel model) {
		this.vehicleModel = model;
	}

	@ManyToOne
	@JoinColumn(name = "VEHICLE_YEAR_ID")
	public VehicleYear getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(VehicleYear year) {
		this.vehicleYear = year;
	}

	@Column(name = "VEHICLE_PRICE", nullable = false)
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
