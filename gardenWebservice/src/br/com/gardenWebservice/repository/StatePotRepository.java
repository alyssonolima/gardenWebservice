package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.StatePot;

public class StatePotRepository {

	
	private JdbcTemplate jt;
	
	public List<StatePot> findStatePot(){
		
		List<StatePot> states = new ArrayList<StatePot>();
		return states;
	}
	
	public void insertStatePot() throws SQLException{
		StringBuilder sql = new StringBuilder(
				
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updateStatePot(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
		
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void deleteStatePot(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();						
	}
}
