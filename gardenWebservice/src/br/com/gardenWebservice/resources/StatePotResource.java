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
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.gardenWebservice.entity.StatePot;
import br.com.gardenWebservice.repository.StatePotRepository;

@Path(value = "/statePot")
public class StatePotResource {

	private StatePotRepository dao = new StatePotRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<StatePot> getStatePot(@DefaultValue("") @QueryParam("email") String email, @DefaultValue("") @QueryParam("idGarden")String  idGarden) throws SQLException{
		String query1 = (!email.isEmpty()) ? (" AND us.EMAIL = " + email) : "";
		String query2 = (!idGarden.isEmpty()) ? (" AND garden.ID_GARDEN = " + idGarden) : "";		
		
		return dao.findStatePot(query1, query2);
	}
	
	@POST
	@Path(value = "/one")
	@Consumes(MediaType.APPLICATION_JSON)
	public void postStatePot(StatePot state) throws SQLException{
		
		dao.insertStatePot(state);		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateStatePot(StatePot state) throws SQLException{
		
		dao.updateStatePot(state);		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteStatePot(String idStatePot) throws SQLException{
		Integer id = Integer.parseInt(idStatePot);
		
		dao.deleteStatePot(id);		
	}
}
