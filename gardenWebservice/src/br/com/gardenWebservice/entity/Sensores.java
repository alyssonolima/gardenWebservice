package br.com.gardenWebservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.gardenWebservice.entity.Sensor;

@XmlRootElement(name="sensores")
public class Sensores {

	@XmlElement(name="sensor")
	private List<Sensor> sensores = new ArrayList<Sensor>();

	public List<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(List<Sensor> sensores) {
		this.sensores = sensores;
	}
	
	public void addSensor(Sensor sensor){
		if(sensores == null)
			sensores = new ArrayList<Sensor>();
		
		sensores.add(sensor);		
	}
	
}
