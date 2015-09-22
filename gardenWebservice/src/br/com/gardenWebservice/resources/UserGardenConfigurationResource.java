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

import br.com.gardenWebservice.entity.UserGardenConfiguration;

@Path(value = "/userGardenConfiguration")
public class UserGardenConfigurationResource {

	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<UserGardenConfiguration> getUserGardenConfiguration(){
		
		return new ArrayList<UserGardenConfiguration>();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postUserGardenConfiguration(){
		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateUserGardenConfiguration(){
		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteUserGardenConfiguration(){
		
	}
}
