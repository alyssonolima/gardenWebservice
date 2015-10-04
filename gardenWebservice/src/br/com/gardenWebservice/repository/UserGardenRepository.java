package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.UserGarden;

public class UserGardenRepository {

	
	private JdbcTemplate jt;
	
	public List<UserGarden> findUserGarden(int id) throws SQLException{
		
		StringBuilder sql = new StringBuilder(
			
			" SELECT * " +
			" FROM connected_garden.user_garden user " +
			" WHERE user.id_user = " + id
			);
	
		jt = new JdbcTemplate(Fabrica.getDataSource());		
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		ArrayList<UserGarden> users = new ArrayList<UserGarden>();
		
		for(Map<String, Object> map: result){
			UserGarden user = new UserGarden();
			user.setId((int)map.get("ID_USER"));
			user.setName((String) map.get("name"));
			user.setEmail((String) map.get("email"));
			user.setNickName((String) map.get("nickName"));
			user.setPassword((String) map.get("password"));
			Boolean active = (Boolean) map.get("active");
			user.setActive( active.booleanValue());
			
			users.add(user);
		}
		
		return users;
	}
	
	public void insertUserGarden(UserGarden user) throws SQLException{
		
		StringBuilder sql = new StringBuilder(
				
			" INSERT INTO `connected_garden`.`user_garden` " +
			" (`NAME`, `EMAIL`, `NICKNAME`, `PASSWORD`, `ACTIVE`) " +
			" VALUES ('" + 
			user.getName() + "', '" + 
			user.getEmail() + "', '" + 
			user.getNickName() + "', '" + 
			user.getPassword() + "', " + 
			1 + ")"			
			);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();
				
	}
	
	public void updateUserGarden(UserGarden user) throws SQLException{
		
		StringBuilder sql = new StringBuilder(
				
			" UPDATE `connected_garden`.`user_garden` SET " +
			"`NAME`='" + user.getName() + "', " +
			"`EMAIL`='" + user.getEmail() + "', " +
			"`NICKNAME`='" + user.getNickName() + "', " +
			"`PASSWORD`='" + user.getPassword() + "', " +
			"`ACTIVE`= " + user.isActive() + " " +
			" WHERE `ID_USER`='" + user.getId() + "'"
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();
	}
	
	public void deleteUserGarden(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" DELETE FROM `connected_garden`.`user_garden` " +
			" WHERE `ID_USER`='" + id + "'"
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();
		
	}
}
