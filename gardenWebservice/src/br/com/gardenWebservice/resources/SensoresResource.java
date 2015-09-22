package br.com.gardenWebservice.resources;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.gardenWebservice.entity.Sensores;

@Path(value = "/sensores")
public class SensoresResource {
	
	
	@GET
	@Path(value = "/lista/sensores")
	@Produces({"application/xml"})
	public String getSensores() throws SQLException{
				
		return "<xml>Deu certoo!!</xml>";
	}
	
	@GET
	@Path(value = "/lista/sensores/{id}")
	@Produces({"application/xml", "application/json"})
	public Sensores getSensorId(@PathParam("id") String id){
		
	
		return new Sensores();
	}
	
	@PUT
	@Path(value = "/inserir")
	public void inserirSensor(
			@PathParam("id") String id,
			@PathParam("Descricao") String descricao,
			@PathParam("valor") String valor){
		
		//Integer idInteger = id != null? Integer.valueOf(id) : 0;
	//	Integer valorInteger = valor != null? Integer.valueOf(valor) : 0;
		//dao.insertDadosSensor(idInteger, descricao, valorInteger);
	}
}
