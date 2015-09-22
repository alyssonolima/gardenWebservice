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

import br.com.gardenWebservice.entity.Alert;

@Path(value = "/alert")
public class AlertResource {

	@GET
	@Path(value = "/one")
	@Produces
	public List<Alert> getAlert(){
		
		return new ArrayList<Alert>();
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
