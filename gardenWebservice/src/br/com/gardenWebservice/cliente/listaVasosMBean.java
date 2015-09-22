package br.com.gardenWebservice.cliente;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import br.com.gardenWebservice.entity.Vaso;

public class listaVasosMBean {	

	
	public List<Vaso> getVasos(){
		RestTemplate cliente = new RestTemplate();
		cliente.getForObject("http://localhost:8080/gardenWebservice/rest/vasos/one", Vaso.class);
		
		return new ArrayList<Vaso>();
	}
	
		//private static int HTTP_COD_SUCESSO = 200;
/*
		public static void main(String[] args) throws JAXBException {

			try {

				URL url = new URL("http://localhost:8080/gardenWebservice/rest/vasos/one");
				HttpURLConnection con = (HttpURLConnection) url.openConnection();

				if (con.getResponseCode() != HTTP_COD_SUCESSO) {
					throw new RuntimeException("HTTP error code : "+ con.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
							
				JAXBContext jaxbContext = JAXBContext.newInstance(Vaso.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Vaso vaso = (Vaso) jaxbUnmarshaller.unmarshal(br);
				
				RestTemplate cliente = new RestTemplate();
				//cliente.getForObject(url, responseType);

				//con.disconnect();

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	*/
}
