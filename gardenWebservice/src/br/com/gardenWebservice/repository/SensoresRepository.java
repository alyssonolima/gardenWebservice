package br.com.gardenWebservice.repository;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Sensores;

@Repository
public class SensoresRepository {

	@Autowired
	private JdbcTemplate jt;
	
	public Sensores buscaSensores(Integer id) throws SQLException{
		
		jt.setDataSource(Fabrica.getDataSource());
		
		String sql;
		
		sql = "INSERT INTO `gardendimap`.`sensor` (`idsensor`, `valor`, `descricao`) VALUES ('1', '10', 'Teste 2');";
		
		jt.execute(sql);
		
		
				
		Sensores sensores = new Sensores();
		
		return sensores;
	}
	
	public void insertDadosSensor(Integer id, String descricao, Integer valor) throws SQLException{
		
		jt.setDataSource(Fabrica.getDataSource());
		String sql;
		
		sql = "INSERT INTO `gardendimap`.`sensor` (`idsensor`, `valor`, `descricao`) VALUES ('1', '10', 'Teste 2');";
		
		jt.update(sql);
		
		
	}
	
}

