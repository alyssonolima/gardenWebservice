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

import br.com.gardenWebservice.entity.PotConfiguration;

@Path(value = "/potConfiguration")
public class PotConfigurationResource {

	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<PotConfiguration> getPotConfiguration(){
		
		return new ArrayList<PotConfiguration>();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postPotConfiguration(){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updatePotConfiguration(){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deletePotConfiguration(){
		
	}
}
