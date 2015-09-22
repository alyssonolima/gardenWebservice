package br.com.gardenWebservice.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.gardenWebservice.entity.AlertType;

@Path(value = "/alertType")
public class AlertTypeResource {

	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<AlertType> getAlertType(){
		
		return new ArrayList<AlertType>();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postAlertType(){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateAlertType(){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteAlertType(){
		
	}
}
