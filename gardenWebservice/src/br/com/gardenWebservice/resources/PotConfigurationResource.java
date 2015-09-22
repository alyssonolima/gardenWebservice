package br.com.gardenWebservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.gardenWebservice.entity.PotConfiguration;
import br.com.gardenWebservice.repository.PotConfigurationRepository;

@Path(value = "/potConfiguration")
public class PotConfigurationResource {

	private PotConfigurationRepository dao = new PotConfigurationRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<PotConfiguration> getPotConfiguration(){
		
		return dao.findPotConfiguration();
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
