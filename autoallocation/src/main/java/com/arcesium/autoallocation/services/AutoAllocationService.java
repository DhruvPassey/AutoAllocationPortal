package com.arcesium.autoallocation.services;

import java.util.List;
import java.util.Map;

import com.arcesium.autoallocation.commons.Cab;
import com.arcesium.autoallocation.commons.GPSCoordinates;

public interface AutoAllocationService {
	
	Boolean addNewCab(String licenseNumber, Integer cabId, Integer numberOfSeats, String driverName);
	
	List<Cab> getAllCabs();
	
	Map<Integer,Integer> getSeatCountToCabCountMap();
	
	GPSCoordinates getGPSCoordinatesFromAddress(String address);

}
