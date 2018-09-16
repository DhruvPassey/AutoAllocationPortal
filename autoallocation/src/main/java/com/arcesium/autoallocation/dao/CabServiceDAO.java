package com.arcesium.autoallocation.dao;

import java.util.List;

import com.arcesium.autoallocation.commons.Cab;

public interface CabServiceDAO {

	public List<Cab> getListOfCabs();

	public Integer addCab(Cab cab);

}
