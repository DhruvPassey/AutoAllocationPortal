package com.arcesium.autoallocation.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.arcesium.autoallocation.commons.CRMSRequest;

import autoallocation.Session;

public class CRMSRequestDAOImpl implements CRMSRequestDAO {

	private Session session = new Session();

	@Override
	public List<CRMSRequest> selectRequestsForDateAndTimeSlot(Date departureDate, String departureTime) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("departureDate", departureDate);
		paramMap.put("departureTime", departureTime);
		return session.openSqlSession().selectList("CRMSRequestMapper.selectRequests", paramMap);
	}

	@Override
	public Integer insertRequest(CRMSRequest request) {
		SqlSession sqlSession = session.openSqlSession();
		Integer result = sqlSession.insert("CRMSRequestMapper.insertCRMSRequest", request);
		sqlSession.commit();
		return result;
	}

}
