package com.main.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.main.model.User;

@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<User> getList(){
	    String sql = "SELECT id, name, password FROM test.user ";
	    return (List<User>) jdbcTemplate.query(sql, new RowMapper<User>(){
	      @Override
	      public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	        User user = new User();
	        user.setId(rs.getInt("id"));
	        user.setName(rs.getString("name"));
	        user.setPassword(rs.getString("password"));
	        return user;
	      }
	 
	    });
	  }

}
