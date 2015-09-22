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

import br.com.gardenWebservice.entity.Garden;

@Path(value = "/garden")
public class GardenResource {

	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Garden> getGarden(){
		
		return new ArrayList<Garden>();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postGarden(){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateGarden(){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteGarden(){
		
	}
}
