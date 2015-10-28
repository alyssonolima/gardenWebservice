package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.AlertType;

public class AlertTypeRepository {

	private JdbcTemplate jt;
	
	public List<AlertType> findAlertType() throws SQLException{
		StringBuilder sql = new StringBuilder(
			" SELECT * " +
			" FROM connected_garden.alert_type "
		);		
		jt = new JdbcTemplate(Fabrica.getDataSource());		
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<AlertType> alerts = new ArrayList<AlertType>();
		
		for(Map<String, Object> map: result){
			AlertType a = new AlertType();
			a.setId((int) map.get("ID_ALERT_TYPE"));
			a.setDescription((String) map.get("DESCRIPTION"));
			
			alerts.add(a);
		}
		
		return alerts;
	}
	
	public void insertAlertType(AlertType alert) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" INSERT INTO `connected_garden`.`alert_type` (`DESCRIPTION`) " +
			" VALUES ('" + alert.getDescription() + "')"						
		);
			
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updateAlertType(AlertType alert) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" UPDATE `connected_garden`.`alert_type` SET " +
			"`DESCRIPTION`='" + alert.getDescription() + "' " +
			" WHERE `ID_ALERT_TYPE`= " + alert.getId()				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();
	}
	
	public void deleteAlertType(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" DELETE " +
			" FROM `connected_garden`.`alert_type` " +
			" WHERE `ID_ALERT_TYPE`= " + id
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();						
	}
}
