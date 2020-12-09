package com.thxy.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.thxy.datasource.DataConnection;

import sqlmap.UserMapper;

public class MyBatisTest {
	
	public DataConnection dataConn=new DataConnection();
	
	@Test
	public void Select() throws IOException {
		SqlSession sqlSession=dataConn.getSqlSession();
		
		UserMapper mapper=sqlSession.getMapper(UserMapper.class);
		int count=mapper.count();
		
		System.out.println(count);
		
		sqlSession.close();
	}
}
