package br.com.gardenWebservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.gardenWebservice.entity.UserGarden;
import br.com.gardenWebservice.repository.UserGardenRepository;

@Path(value = "/userGarden")
public class UserGardenResource {

	private UserGardenRepository dao = new UserGardenRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<UserGarden> getUserGarden(){
		
		return dao.findUserGarden();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postUserGarden(){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateUserGarden(){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteUserGarden(){
		
	}
}
