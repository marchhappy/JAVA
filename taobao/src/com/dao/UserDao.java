package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.domain.User;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getMatchCount(String account,String password)
	{
		String hql="select count(*) from Admin where account=? and password=?";
		return jdbcTemplate.queryForInt(hql,new Object[]{account,password});
	}
	
}
