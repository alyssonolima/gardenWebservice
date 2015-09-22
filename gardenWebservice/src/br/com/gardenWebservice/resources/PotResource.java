package br.com.gardenWebservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.gardenWebservice.entity.Pot;
import br.com.gardenWebservice.repository.PotRepository;

@Path(value = "/pot")
public class PotResource {

	private PotRepository dao = new PotRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Pot> getPot(){
		
		return dao.findPot();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postPot(){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updatePot(){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deletePot(){
		
	}
	
}
