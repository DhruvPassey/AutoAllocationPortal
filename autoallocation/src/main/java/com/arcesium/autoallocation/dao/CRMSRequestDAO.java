package com.arcesium.autoallocation.dao;

import java.util.Date;
import java.util.List;

import com.arcesium.autoallocation.commons.CRMSRequest;

public interface CRMSRequestDAO {

	public List<CRMSRequest> selectRequestsForDateAndTimeSlot(Date departureDate, String departureTime);

	public Integer insertRequest(CRMSRequest request);

}
