package br.com.gardenWebservice.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Fabrica {
	 JdbcTemplate jt = new JdbcTemplate();
	 
	 
	 	public static SimpleDriverDataSource getDataSource() throws SQLException{
	 		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
	 		dataSource.setDriver(new com.mysql.jdbc.Driver());
	        dataSource.setUrl("jdbc:mysql://localhost/gardenDimap");
	        dataSource.setUsername("root");
	        dataSource.setPassword("alysson1989");
	 		
	 		return dataSource;
	 	}
	}
