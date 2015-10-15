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

import br.com.gardenWebservice.entity.Alert;
import br.com.gardenWebservice.repository.AlertRepository;

@Path(value = "/alert")
public class AlertResource {

	AlertRepository dao = new AlertRepository();
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Alert> getAlert(@QueryParam("idPot") String idPot) throws SQLException{
		Integer idPotInteger = Integer.parseInt(idPot);
		
		
		return dao.findAlert(idPotInteger, null);
	}
	
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public Alert getAlert(@QueryParam("idPot")String idPot, @QueryParam("idAlert") String idAlert) throws SQLException{
		Integer idPotInteger = Integer.parseInt(idPot);
		Integer idAlertInteger = Integer.parseInt(idAlert);
		
		return dao.findAlert(idPotInteger, idAlertInteger).get(0);
	}
	
	@POST
	@Path(value = "/one")
	@Consumes("application/json")
	public void postAlert(Alert alert) throws SQLException{
		
		dao.insertAlert(alert);
	}
	
	@PUT
	@Path(value = "/one")
	@Consumes("application/json")
	public void updateAlert(Alert alert) throws SQLException{
		dao.updateAlert(alert);
	}
	
	@DELETE
	@Path(value = "/one")
	@Consumes("application/json")
	public void deleteAlert(@QueryParam("idAlert") String idAlert) throws SQLException{
		Integer id = Integer.parseInt(idAlert);
		
		dao.deleteAlert(id);
	}
	
}
