package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Alert;


public class AlertRepository {

	private JdbcTemplate jt;
	
	public List<Alert> findAlert(){
		
	
		return new ArrayList<Alert>();
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
	
	public void updateAlert(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();
		
				
	}
	
	public void deleteAlert(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();				
	}
}
