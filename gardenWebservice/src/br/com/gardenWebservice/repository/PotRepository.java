package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Garden;
import br.com.gardenWebservice.entity.Pot;

public class PotRepository {

	
	private JdbcTemplate jt;
	
	public List<Pot> findPot(int idUser) throws SQLException{
		
		StringBuilder sql = new StringBuilder(
			" SELECT * " +
			" FROM connected_garden.pot pot " +
			" INNER JOIN connected_garden.garden garden ON garden.ID_GARDEN = pot.ID_GARDEN " +
			" INNER JOIN connected_garden.user_garden user ON user.ID_USER = garden.ID_USER " +
			" where garden.ID_USER = " + idUser
		);			
						
		jt = new JdbcTemplate(Fabrica.getDataSource());		
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<Pot> pots = new ArrayList<Pot>();
		
		for(Map<String, Object> map: result){
			Pot pot = new Pot();
			pot.setId((int)map.get("ID_POT"));
			pot.setIdGarden((int) map.get("ID_GARDEN"));
			pot.setDescription((String)map.get("DESCRIPTION"));
			pot.setTemp((int) map.get("TEMP"));
			pot.setHumAir((int) map.get("HUM_AIR"));
			pot.setHumSoil((int) map.get("HUM_SOIL"));
			pot.setLight((int) map.get("LIGHT"));
			Boolean active = (Boolean) map.get("ACTIVE");
			pot.setActive(active);
			
			pots.add(pot);
		}
		
		
		return pots;
	}
	
	public void insertPot(Pot pot) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" INSERT INTO `connected_garden`.`pot` " +
			" (`ID_GARDEN`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`) " +
			" VALUES (" + 
			pot.getIdGarden() + ", '" + 
			pot.getDescription() + "', " + 
			pot.getTemp() + ", " + 
			pot.getHumAir() + ", " + 
			pot.getHumSoil() + ", " + 
			pot.getLight() + ", " + 
			pot.isActive() + ")"				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updatePot(Pot pot) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" UPDATE `connected_garden`.`pot` SET " +
			" `DESCRIPTION`='" + pot.getDescription() + "', " +
			" `TEMP`='" + pot.getTemp() + "', " +
			" `HUM_AIR`='" + pot.getHumAir() + "', " +
			" `HUM_SOIL`='" + pot.getHumSoil() + "', " +
			" `LIGHT`='" + pot.getLight() + "', " +
			" `ACTIVE`=  " + pot.isActive() + " " +
			" WHERE `ID_POT`= " + pot.getId()	
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void deletePot(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" DELETE " +
			" FROM `connected_garden`.`pot` " +
			" WHERE `ID_POT`= " + id
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();	
	}
}
