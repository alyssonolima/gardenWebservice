package br.com.gardenWebservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import br.com.gardenWebservice.entity.Pot;
import br.com.gardenWebservice.repository.PotRepository;

@Path(value = "/pot")
public class PotResource {

	private PotRepository dao = new PotRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Pot> getPot(@QueryParam("idGarden") String idGarden){
		
		return dao.findPot();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postPot(Pot pot){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updatePot(Pot pot){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deletePot(String idPot){ 
		
	}
	
}