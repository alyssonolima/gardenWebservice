package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Pot;
import br.com.gardenWebservice.entity.StatePot;

public class StatePotRepository {

	
	private JdbcTemplate jt;
	
	public List<StatePot> findStatePot(int idPot) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" SELECT * " +
			" FROM connected_garden.state_pot " +
			" WHERE ID_POT = " + idPot
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());	
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<StatePot> states = new ArrayList<StatePot>();
		
		for(Map<String, Object> map: result){
			StatePot state = new StatePot();
			state.setId((int)map.get("ID_STATE_POT"));
			state.setIdPot((int)map.get("ID_POT"));
			state.setDescription((String)map.get("DESCRIPTION"));
			state.setTemp((int) map.get("TEMP"));
			state.setHumAir((int) map.get("HUM_AIR"));
			state.setHumSoil((int) map.get("HUM_SOIL"));
			state.setLight((int) map.get("LIGHT"));
			Boolean active = (Boolean) map.get("ACTIVE");
			state.setActive(active);
			Boolean auto = (Boolean) map.get("IRRIGATION_AUTO");
			state.setIrrigationAuto(auto);
			Boolean irriActive = (Boolean) map.get("IRRIGATION_ACTIVE");
			state.setIrrigationActive(irriActive);
			
			states.add(state);
		}
		
		return states;
	}
	
	public void insertStatePot(StatePot state) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" INSERT INTO `connected_garden`.`state_pot` " +
			" (`ID_POT`, `DESCRIPTION`, `TEMP`, `HUM_AIR`, `HUM_SOIL`, `LIGHT`, `ACTIVE`, `IRRIGATION_AUTO`, `IRRIGATION_ACTIVE`) " +
			" VALUES ('" + 
			state.getIdPot() + "', '" + 
			state.getDescription() + "', '" + 
			state.getTemp() + "', '" + 
			state.getHumAir() + "', '" + 
			state.getHumSoil() + "', '" + 
			state.getLight() + "', " + 
			state.isActive() + ", " + 
			state.isIrrigationAuto() + ", " + 
			state.isIrrigationActive() + ")"				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updateStatePot(StatePot state) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" UPDATE `connected_garden`.`state_pot` " +
			" SET " +
			"`ID_POT`=" + state.getIdPot() + ", " +
			"`DESCRIPTION`='" + state.getDescription() + "', " +
			"`TEMP`='" + state.getTemp() + "', " +
			"`HUM_AIR`='" + state.getHumAir() + "', " +
			"`HUM_SOIL`='" + state.getHumSoil() + "', " +
			"`ACTIVE`= " + state.isActive() + ", " +
			"`IRRIGATION_AUTO`= " + state.isIrrigationAuto() + ", " +
			"`IRRIGATION_ACTIVE`= " + state.isIrrigationActive() + " " +
			" WHERE `ID_STATE_POT`= " + state.getId()		
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void deleteStatePot(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" DELETE FROM `connected_garden`.`state_pot` " +
			" WHERE `ID_STATE_POT`= " + id
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();						
	}
}
