package br.com.gardenWebservice.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Path(value = "ola-mundo")
@Component
public class RecursoOla {  
  
   @GET
   @Path(value="/teste")
   public String digaOla() {  
      return "Olá Mundo!";  
   }  
}  