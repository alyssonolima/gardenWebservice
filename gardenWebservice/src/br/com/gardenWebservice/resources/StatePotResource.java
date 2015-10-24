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

import br.com.gardenWebservice.entity.StatePot;
import br.com.gardenWebservice.repository.StatePotRepository;

@Path(value = "/statePot")
public class StatePotResource {

	private StatePotRepository dao = new StatePotRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<StatePot> getStatePot(@QueryParam("idPot") String idPot) throws SQLException{
		Integer id = Integer.parseInt(idPot);
		
		return dao.findStatePot(id);
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
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
