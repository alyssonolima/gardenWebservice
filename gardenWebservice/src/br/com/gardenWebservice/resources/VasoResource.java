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
	@Path(value = "/lista/vasos")	
	@Produces("application/json")
	public List<Vaso> getVasos(@QueryParam("idUser") int idUser){
		
           

		return dao.buscaVasos(1, 0); 
	}
	
	@Path(value = "/lista/vaso")
	@GET
	@Produces("application/json")
	public Vaso getVaso(@QueryParam("idUser") int idUser,
						@QueryParam("iduser") int idvaso){

           
		return dao.buscaVasos(1, 0).get(0); 
	}


	@PUT
	@Path("/one")
	@Consumes("application/json")
	public void updateVaso(@QueryParam("idUser") int idUser,Vaso v){
				
		//recebe um vaso e atualiza pertencente a um usuario com id = idUser e atualiza as informações do banco
		
	}	

	@POST
	@Path("/one")
	@Consumes("application/json")
	public void postVaso(@QueryParam("idUser") int idUser,Vaso v){
				
		//recebe um vaso e atualiza pertencente a um usuario com id = idUser e cadastra esse novo vaso no banco.
			
	}

	@DELETE
	@Path("/one")
	@Consumes("application/json")
	public void deleteVaso(@QueryParam("idUser") int idUser,
						  @QueryParam("idVaso") int idVaso	){
					
		//deleta o vaso com id = idVaso que pertence ao cliente com id = idVaso
			
	}	
}
