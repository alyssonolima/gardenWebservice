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
	public List<Vaso> getVasos(){
		
		//Integer idUserInteger = Integer.getInteger(idUser);            

		return dao.buscaVasos(0, 0); 
	}
	
	@Path(value = "/lista/vaso")
	@GET
	@Produces("application/json")
	public Vaso getVaso(@QueryParam("idUser") String idUser,
						@QueryParam("iduser") String idVaso){

		Integer idUserInteger = Integer.getInteger(idUser); 
		Integer idVasoInteger = Integer.getInteger(idVaso); 
		return dao.buscaVasos(idUserInteger, idVasoInteger).get(0); 
	}


	@PUT
	@Path("/update")
	@Consumes("application/json")
	public void updateVaso(Vaso v){
				
		//recebe um vaso e atualiza pertencente a um usuario com id = idUser e atualiza as informações do banco
		
	}	

	@POST
	@Path("/post")
	@Consumes("application/json")
	public void postVaso(){
		Vaso v = new Vaso();
		
		v.setId(2);
		v.setDescricao("teste2");
		v.setMAC("444444");
		v.setTemp(23);
		v.setUmidSolo(25);
		v.setUmidAr(30);
		v.setLuz(45);
		v.setAtivo(1);	
		
		dao.inserirVaso(v);			
	}

	@DELETE
	@Path("/delete")
	@Consumes("application/json")
	public void deleteVaso(@QueryParam("idVaso") int idVaso	){
					
		dao.deletVaso(idVaso);
			
	}	
}
