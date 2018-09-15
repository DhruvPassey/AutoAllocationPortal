package com.arcesium.autoallocation.commons;

public class Cab {

	private String licenseNumber;

	private Integer cabId;

	private Integer numberOfSeats;

	private String driverName;

	public Cab(String licenseNumber, Integer cabId, Integer numberOfSeats, String driverName) {
		this.licenseNumber = licenseNumber;
		this.cabId = cabId;
		this.numberOfSeats = numberOfSeats;
		this.driverName = driverName;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Integer getCabId() {
		return cabId;
	}

	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
