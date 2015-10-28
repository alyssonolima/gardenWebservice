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

import br.com.gardenWebservice.entity.AlertType;
import br.com.gardenWebservice.repository.AlertTypeRepository;

@Path(value = "/alertType")
public class AlertTypeResource {

	private AlertTypeRepository dao = new AlertTypeRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<AlertType> getAlertType() throws SQLException{		
		return dao.findAlertType();
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postAlertType(AlertType  alert) throws SQLException{
		
		dao.insertAlertType(alert);		
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateAlertType(AlertType  alert) throws SQLException{
		
		dao.updateAlertType(alert);		
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteAlertType(@QueryParam("idAlertType") String id) throws SQLException{
		Integer idInt = Integer.parseInt(id);
		
		dao.deleteAlertType(idInt);
	}
}
