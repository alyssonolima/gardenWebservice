package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Alert;


public class AlertRepository {

	private JdbcTemplate jt;
	
	public List<Alert> findAlert(String query1, String query2) throws SQLException{
		
		StringBuilder sql = new StringBuilder(
			" SELECT * " +
			" FROM connected_garden.alert alert " +
			" inner join connected_garden.pot pot on pot.ID_POT = alert.ID_POT " +
			" inner join connected_garden.garden garden on garden.ID_GARDEN = pot.ID_GARDEN " +
			" inner join connected_garden.user_garden us on us.ID_USER = garden.ID_USER " +
			" WHERE 1=1 "		
		);
		
		if(!query1.isEmpty())
			sql.append(query1);
	
		if(!query2.isEmpty())
			sql.append(query2);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<Alert> alerts = new ArrayList<Alert>();
		
		for(Map<String, Object> map: result){
			Alert a = new Alert();
			a.setId((int) map.get("ID_ALERT"));
			a.setIdPot((int) map.get("ID_POT"));
			a.setIdAlertType((int) map.get("ID_ALERT_TYPE"));
			a.setDescription((String) map.get("DESCRIPTION"));
			Date d = (Date)map.get("ACTIVATION_DATE");
			a.setActivationDate(d);
			Boolean active = (Boolean) map.get("active");
			a.setActive(active);
			
			alerts.add(a);
		}
		
		return alerts;
	}
	
	public void insertAlert(Alert alert) throws SQLException{
		
		StringBuilder sql = new StringBuilder(
				" INSERT INTO `connected_garden`.`alert` (`ID_POT`, `ID_ALERT_TYPE`, `DESCRIPTION`, `ACTIVATION_DATE`, `ACTIVE`) " +
				" VALUES (' "+ 
						alert.getIdPot() + "', '" + 
						alert.getIdAlertType() + "', '" + 
						alert.getDescription() + "', '" + 
						alert.getActivationDate() + "'," + 1 +")"				
				);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
		
	}
	
	public void updateAlert(Alert alert) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" UPDATE `connected_garden`.`alert` " +
			" SET " +
			"`ID_ALERT_TYPE`=" + alert.getIdAlertType() + ", " +
			"`DESCRIPTION`= " + alert.getDescription() + ", " +
			"`ACTIVATION_DATE`= " + new Timestamp(alert.getActivationDate().getTime()) + ", " +
			"`ACTIVE`= " + alert.isActive() +
			" WHERE `ID_ALERT`= " + alert.getId()				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();
		
				
	}
	
	public void deleteAlert(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" DELETE " +
			" FROM `connected_garden`.`alert` " +
			" WHERE `ID_ALERT`= " + id	
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();				
	}
}
