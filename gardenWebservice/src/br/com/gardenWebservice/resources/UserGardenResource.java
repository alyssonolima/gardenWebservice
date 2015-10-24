package br.com.gardenWebservice.resources;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import br.com.gardenWebservice.entity.UserGarden;
import br.com.gardenWebservice.repository.UserGardenRepository;

@Path(value = "/userGarden")
public class UserGardenResource {

	private UserGardenRepository dao = new UserGardenRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public UserGarden getUserGarden(@QueryParam("login") String login) throws SQLException{
				
		return dao.findUserGarden(login);
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postUserGarden(UserGarden user) throws SQLException{
		
		dao.insertUserGarden(user);		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateUserGarden(UserGarden user) throws SQLException{
		
		dao.updateUserGarden(user);		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteUserGarden(String idUser) throws SQLException{
		Integer idUserInteger = Integer.parseInt(idUser);
		
		dao.deleteUserGarden(idUserInteger);		
	}
}
