package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.UserGardenConfiguration;

public class UserGardenConfigurationRepository {

	
	private JdbcTemplate jt;
	
	public List<UserGardenConfiguration> findUserGardenConfiguration() throws SQLException{
		StringBuilder sql = new StringBuilder(
			" SELECT * " +
			" FROM connected_garden.user_config "
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());		
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<UserGardenConfiguration> usersConfig = new ArrayList<UserGardenConfiguration>();
		for(Map<String, Object> map: result){
			UserGardenConfiguration userC = new UserGardenConfiguration();
			userC.setId((int)map.get("ID_USER_CONFIG"));
			userC.setIdUserGarden((int)map.get("ID_USER"));
			userC.setDescription((String) map.get("DESCRIPTION"));
			userC.setValue((String) map.get("VALUE"));
			userC.setConfg((String) map.get("CONFIG"));
			
			usersConfig.add(userC);
		}
		
		return usersConfig;
	}
	
	public void insertUserGardenConfiguration(UserGardenConfiguration userC) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" INSERT INTO `connected_garden`.`user_config` (`ID_USER`, `DESCRIPTION`, `VALUE`, `CONFIG`) " +
			" VALUES ('" + 
						userC.getIdUserGarden() + "', " + 
						userC.getDescription() + ", " + 
						userC.getValue() + ", " + 
						userC.getConfg() + ")"				
		); 
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updateUserGardenConfiguration(UserGardenConfiguration userC) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" UPDATE `connected_garden`.`user_config` " +
			" SET `" +
			"ID_USER`=" + userC.getIdUserGarden() + ", `" +
			"DESCRIPTION`=" + userC.getDescription() + ", `" +
			"VALUE`= " + userC.getValue() + ", `" +
			"CONFIG`= " + userC.getConfg() + " " +
			" WHERE `ID_USER_CONFIG`= " + userC.getId()			
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void deleteUserGardenConfiguration(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" DELETE " +
			" FROM `connected_garden`.`user_config` " +
			" WHERE `ID_USER_CONFIG`= " + id
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();						
	}
}
