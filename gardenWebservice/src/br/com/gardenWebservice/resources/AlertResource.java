package br.com.gardenWebservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.gardenWebservice.entity.Alert;
import br.com.gardenWebservice.repository.AlertRepository;

@Path(value = "/alert")
public class AlertResource {

	AlertRepository dao = new AlertRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Alert> getAlert(){
		
		return dao.findAlert();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postAlert(){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateAlert(){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteAlert(){
		
	}
	
}
