package com.arcesium.autoallocation.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.json.simple.parser.ParseException;
import org.apache.commons.httpclient.util.URIUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.arcesium.autoallocation.commons.Cab;
import com.arcesium.autoallocation.commons.GPSCoordinates;
import com.arcesium.autoallocation.commons.GeoCodeData;
import com.arcesium.autoallocation.dao.CabServiceDAO;
import com.google.gson.Gson;

public class AutoAllocationServiceImpl implements AutoAllocationService {

	public Boolean addNewCab(String licenseNumber, Integer cabId, Integer numberOfSeats, String driverName) {
		// TODO Auto-generated method stub

		CabServiceDAO cabServiceDAO = new CabServiceDAO();

		Cab cab = new Cab(licenseNumber, cabId, numberOfSeats, driverName);

		return null;
	}

	public List<Cab> getAllCabs() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public Map<Integer, Integer> getSeatCountToCabCountMap() {
		Map<Integer, Integer> seatCountToCabCountMap = new HashMap<>();
		getAllCabs().forEach(e -> {
			if (seatCountToCabCountMap.get(e.getNumberOfSeats()) == null) {
				seatCountToCabCountMap.put(e.getNumberOfSeats(), Integer.valueOf(1));
			} else {
				seatCountToCabCountMap.put(e.getNumberOfSeats(), seatCountToCabCountMap.get(e.getNumberOfSeats()) + 1);
			}
		});
		return seatCountToCabCountMap;
	}

	@Override
	public GPSCoordinates getGPSCoordinatesFromAddress(String address) {
		// TODO Auto-generated method stub

		try {

			address = address + "Hyderabad, Telangana, India";

			String urlString = new String(
					"https://maps.googleapis.com/maps/api/geocode/json?address=" + URIUtil.encodeQuery(address));

			urlString = urlString + "&key=AIzaSyA51pzzOtxJHFm7q1HlsL0l3t7qRPCEC-0";

			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output = "";
			String full = "";
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				full += output;
			}

			GeoCodeData geoCodeData = new Gson().fromJson(full, GeoCodeData.class);

			conn.disconnect();

			return new GPSCoordinates(geoCodeData.getResults().get(0).getGeometry().getLocation().getLat(),
					geoCodeData.getResults().get(0).getGeometry().getLocation().getLng());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
