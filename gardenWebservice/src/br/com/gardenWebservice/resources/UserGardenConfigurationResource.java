package br.com.gardenWebservice.resources;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import br.com.gardenWebservice.entity.UserGardenConfiguration;
import br.com.gardenWebservice.repository.UserGardenConfigurationRepository;

@Path(value = "/userGardenConfiguration")
public class UserGardenConfigurationResource {

	private UserGardenConfigurationRepository dao = new UserGardenConfigurationRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<UserGardenConfiguration> getUserGardenConfiguration() throws SQLException{
		
		return dao.findUserGardenConfiguration();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postUserGardenConfiguration(UserGardenConfiguration userc) throws SQLException{
		
		dao.insertUserGardenConfiguration(userc);		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateUserGardenConfiguration(UserGardenConfiguration userc) throws SQLException{
		
		dao.updateUserGardenConfiguration(userc);		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteUserGardenConfiguration(@QueryParam("id") String id) throws SQLException{
		Integer idInt = Integer.parseInt(id);
		
		dao.deleteUserGardenConfiguration(idInt);
	}
}
