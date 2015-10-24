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
	//Para chamar os dois query param usa-se o & como separador. Ex.: ?idPot=1&idAlert=2
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Alert> getAlert(@QueryParam("idPot") String idPot, @QueryParam("idAlert") String idAlert) throws SQLException{
		Integer idPotInteger = Integer.parseInt(idPot);
		idAlert += "";
		
		Integer idAlertInteger;
		if(idAlert.isEmpty()){ 
			idAlertInteger = Integer.parseInt(idAlert);
		} else 
			idAlertInteger = 0;		
		
		return dao.findAlert(idPotInteger, idAlertInteger);
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
