package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.UserGardenConfiguration;

public class UserGardenConfigurationRepository {

	
	private JdbcTemplate jt;
	
	public List<UserGardenConfiguration> findUserGardenConfiguration(){
		
		
		List<UserGardenConfiguration> usersConfig = new ArrayList<UserGardenConfiguration>();
		
		
		return usersConfig;
	}
	
	public void insertUserGardenConfiguration() throws SQLException{
		StringBuilder sql = new StringBuilder(
				
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updateUserGardenConfiguration(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
			
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void deleteUserGardenConfiguration(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();						
	}
}
