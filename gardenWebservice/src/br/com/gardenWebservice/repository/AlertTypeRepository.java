package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.AlertType;

public class AlertTypeRepository {

	private JdbcTemplate jt;
	
	public List<AlertType> findAlertType(){
		
	
		return new ArrayList<AlertType>();
	}
	
	public void insertAlertType() throws SQLException{
		StringBuilder sql = new StringBuilder(
				
						
		);
			
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updateAlertType(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();
	}
	
	public void deleteAlertType(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();						
	}
}
