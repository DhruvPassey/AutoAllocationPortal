package com.arcesium.autoallocation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.arcesium.autoallocation.commons.CRMSRequest;
import com.arcesium.autoallocation.commons.Cab;
import com.arcesium.autoallocation.dao.CRMSRequestDAO;
import com.arcesium.autoallocation.dao.CRMSRequestDAOImpl;
import com.arcesium.autoallocation.dao.CabServiceDAO;
import com.arcesium.autoallocation.dao.CabServiceDAOImpl;

public class App {
	public static void main(String[] args) {
		CabServiceDAO cabServiceDao = new CabServiceDAOImpl();
		CRMSRequestDAO requestDao = new CRMSRequestDAOImpl();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("List of Cabs: " + cabServiceDao.getListOfCabs());
		System.out.println("Insertion: " + cabServiceDao.addCab(new Cab("CH02S1678", 6, "vera")));
		try {
			System.out.println("List of requests: "
					+ requestDao.selectRequestsForDateAndTimeSlot(sdf.parse("09-09-2018"), "20:00"));
			System.out.println("Insertion: " + requestDao.insertRequest(
					new CRMSRequest("Home drop", sdf.parse("16-09-2018"), "21:30", "Other", "Madhapur")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
