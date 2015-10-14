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

import br.com.gardenWebservice.entity.Garden;
import br.com.gardenWebservice.repository.GardenRepository;

@Path(value = "/garden")
public class GardenResource {

	private GardenRepository dao = new GardenRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Garden> getGarden(@QueryParam("idUser") String idUser) throws SQLException{
		Integer idUserInteger = Integer.parseInt(idUser);
		
		return dao.findGarden(idUserInteger , null);
	}
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public Garden getGarden(@QueryParam("idUser") String idUser, @QueryParam("idGarden") String idGarden) throws SQLException{
		Integer idUserInteger = Integer.parseInt(idUser);
		Integer idGardenInteger = Integer.parseInt(idGarden);		
		
		return (dao.findGarden(idUserInteger,idGardenInteger)).get(0);
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
