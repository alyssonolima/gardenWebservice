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

import br.com.gardenWebservice.entity.StatePot;

@Path(value = "/statePot")
public class StatePotResource {

	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<StatePot> getStatePot(){
		
		return new ArrayList<StatePot>();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postStatePot(){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateStatePot(){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteStatePot(){
		
	}
}
