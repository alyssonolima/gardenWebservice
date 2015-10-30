package br.com.gardenWebservice.resources;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import br.com.gardenWebservice.entity.Garden;
import br.com.gardenWebservice.repository.GardenRepository;

@Path(value = "/garden")
public class GardenResource {

	private GardenRepository dao = new GardenRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Garden> getGarden(@DefaultValue("") @QueryParam("email") String email, @DefaultValue("") @QueryParam("idGarden")String  idGarden) throws SQLException{
		String query1 = (!email.isEmpty()) ? (" AND us.EMAIL = " + email) : "";
		String query2 = (!idGarden.isEmpty()) ? (" AND garden.ID_GARDEN = " + idGarden) : "";
		
		return dao.findGarden(query1 , query2);
	}
	
		
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postGarden(Garden garden) throws SQLException{
		dao.insertGarden(garden);		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateGarden(Garden garden) throws SQLException{
		dao.updateGarden(garden);		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteGarden(String idGarden) throws SQLException{
		Integer idInteger = Integer.parseInt(idGarden);
		dao.deleteGarden(idInteger);		
	}
}
