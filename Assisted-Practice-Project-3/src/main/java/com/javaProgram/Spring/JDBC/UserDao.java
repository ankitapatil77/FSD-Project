package com.javaProgram.Spring.JDBC;

import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javaProgram.Spring.JDBC.User;

@Repository
public class UserDao {
	

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<User> getProducts() {
	
		return jdbcTemplate.query("select * from user", new RowMapper<User> () {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User ep = new User();
				
				ep.setId(rs.getInt(1));
				ep.setName(rs.getString(2));
				ep.setLocation(rs.getString(3));
				return ep;
			}
			
		});



	}

}
