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

import br.com.gardenWebservice.entity.Alert;
import br.com.gardenWebservice.repository.AlertRepository;

@Path(value = "/alert")
public class AlertResource {

	AlertRepository dao = new AlertRepository();
	//Para chamar os dois query param usa-se o & como separador. Ex.: ?idPot=1&idAlert=2
	@GET
	@Path(value = "/one")
	@Produces("application/json")
	public List<Alert> getAlert(@DefaultValue("") @QueryParam("email") String email, @DefaultValue("") @QueryParam("idAlert") String idAlert) throws SQLException{
		String query1 = (!email.isEmpty()) ? (" AND us.EMAIL = " + email) : "";
		String query2 = (!idAlert.isEmpty()) ? (" AND garden.ID_GARDEN = " + idAlert) : "";
		
		return dao.findAlert(query1, query2);
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
