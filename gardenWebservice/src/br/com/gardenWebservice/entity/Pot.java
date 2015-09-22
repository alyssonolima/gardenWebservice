package br.com.gardenWebservice.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pot {
	
	@XmlElement
	private int id;
	
	@XmlElement
	private int idGarden;
	
	@XmlElement
	private String description;
	
	@XmlElement
	private int temp;
	
	@XmlElement
	private int humAir;
	
	@XmlElement
	private int humSoil;
	
	@XmlElement
	private int light;
	
	@XmlElement
	private boolean active;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdGarden() {
		return idGarden;
	}
	
	public void setIdGarden(int idGarden) {
		this.idGarden = idGarden;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getTemp() {
		return temp;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public int getHumAir() {
		return humAir;
	}
	
	public void setHumAir(int humAir) {
		this.humAir = humAir;
	}
	
	public int getHumSoil() {
		return humSoil;
	}
	
	public void setHumSoil(int humSoil) {
		this.humSoil = humSoil;
	}
	
	public int getLight() {
		return light;
	}
	
	public void setLight(int light) {
		this.light = light;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
