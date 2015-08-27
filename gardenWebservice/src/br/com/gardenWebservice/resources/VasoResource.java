package br.com.gardenWebservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import br.com.gardenWebservice.entity.Vaso;
import br.com.gardenWebservice.repository.VasoRepository;

@Path(value = "/vasos")
public class VasoResource {
		
	VasoRepository dao = new VasoRepository();
	
	@GET
	@Path(value = "/one")	
	@Produces("application/json")
	public List<Vaso> getVasos(){
		return dao.buscaVasos(0, 0); 
	}
		
	@PUT
	@Path("/one")
	@Consumes("application/json")
	public void updateVaso(Vaso v){			
		dao.updateVaso(v);		
	}	

	@POST
	@Path("/one")
	@Consumes("application/json")
	public void postVaso(Vaso v ){		
		dao.inserirVaso(v);		
	}

	@DELETE
	@Path("/one")
	@Consumes({"application/xml", "application/json"})
	public void deleteVaso(@QueryParam("idVaso") String idVaso	){			
		Integer idVasoInteger = Integer.parseInt(idVaso);
		dao.deletVaso(idVasoInteger);		
	}	
}
