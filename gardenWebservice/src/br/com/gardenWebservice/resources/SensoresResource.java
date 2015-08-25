package br.com.gardenWebservice.resources;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.javafx.collections.MappingChange.Map;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Sensores;
import br.com.gardenWebservice.repository.SensoresRepository;

@Path(value = "/sensores")
public class SensoresResource {

	//@Autowired
	//SensoresRepository dao;
	
	//@Autowired
	//private JdbcTemplate jt;
	
	private static final String url = "";
	
	@GET
	@Path(value = "/lista/sensores")
	@Produces({"application/xml"})
	public String getSensores() throws SQLException{
				
			
		JdbcTemplate jt = new JdbcTemplate(Fabrica.getDataSource());		
		String sql;		
		//sql = "INSERT INTO `gardendimap`.`sensor` (`idsensor`, `valor`, `descricao`) VALUES ('2', '10', 'Teste 2');";
		/*sql = " SELECT s.idsensor, s.valor, s.descricao "
				+ " FROM gardendimap.sensor s "
				+ " where s.idsensor = 1 ";
		//jt.execute(sql);
		jt.queryForList(sql);
		*/
		return "<xml>Deu certoo!!</xml>";
	}
	
	@GET
	@Path(value = "/lista/sensores/{id}")
	@Produces({"application/xml", "application/json"})
	public Sensores getSensorId(@PathParam("id") String id){
		
		Integer idInteger = id != null? Integer.valueOf(id) : 0;
		
		//dao.buscaSensores(idInteger);
		return new Sensores();
	}
	
	@PUT
	@Path(value = "/inserir")
	public void inserirSensor(
			@PathParam("id") String id,
			@PathParam("Descricao") String descricao,
			@PathParam("valor") String valor){
		
		Integer idInteger = id != null? Integer.valueOf(id) : 0;
		Integer valorInteger = valor != null? Integer.valueOf(valor) : 0;
		//dao.insertDadosSensor(idInteger, descricao, valorInteger);
	}
}
