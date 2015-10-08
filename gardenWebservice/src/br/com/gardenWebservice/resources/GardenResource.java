package br.com.gardenWebservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.gardenWebservice.entity.Garden;
import br.com.gardenWebservice.repository.GardenRepository;

@Path(value = "/garden")
public class GardenResource {

	private GardenRepository dao = new GardenRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Garden> getGarden(String idUser){
		
		return dao.findGarden();
	}
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Garden> getGarden(String idUser, String idGarden){
		
		return dao.findGarden();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postGarden(Garden garden){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateGarden(Garden garden){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteGarden(String idGarden){
		
	}
}
