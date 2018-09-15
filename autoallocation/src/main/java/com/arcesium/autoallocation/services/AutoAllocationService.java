package com.arcesium.autoallocation.services;

public interface AutoAllocationService {
	
	Boolean addNewCab(String licenseNumber, Integer cabId, Integer numberOfSeats, String driverName);

}
