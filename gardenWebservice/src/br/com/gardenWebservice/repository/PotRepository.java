package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Pot;

public class PotRepository {

	
	private JdbcTemplate jt;
	
	public List<Pot> findPot(){
		
		List<Pot> pots = new ArrayList<Pot>();
		return pots;
	}
	
	public void insertPot() throws SQLException{
		StringBuilder sql = new StringBuilder(
				
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updatePot(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
		
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void deletePot(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();	
	}
}
