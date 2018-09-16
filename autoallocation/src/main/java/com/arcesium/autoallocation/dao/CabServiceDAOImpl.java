package com.arcesium.autoallocation.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.arcesium.autoallocation.commons.Cab;

import autoallocation.Session;

public class CabServiceDAOImpl implements CabServiceDAO {

	private Session session = new Session();

	public List<Cab> getListOfCabs() {
		return session.openSqlSession().selectList("CabMapper.selectCabs");
	}

	public Integer addCab(Cab cab) {
		SqlSession sqlSession = session.openSqlSession();
		Integer result = sqlSession.insert("CabMapper.insertCab", cab);
		sqlSession.commit();
		return result;
	}
}
