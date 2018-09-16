package com.arcesium.autoallocation;

import com.arcesium.autoallocation.commons.Cab;
import com.arcesium.autoallocation.dao.CabServiceDAO;
import com.arcesium.autoallocation.dao.CabServiceDAOImpl;

public class App {
	public static void main(String[] args) {
		CabServiceDAO cabServiceDao = new CabServiceDAOImpl();
		System.out.println("List of Cabs: " + cabServiceDao.getListOfCabs());
		System.out.println("Insertion: " + cabServiceDao.addCab(new Cab("CH02S1678", 6, "vera")));
	}
}
