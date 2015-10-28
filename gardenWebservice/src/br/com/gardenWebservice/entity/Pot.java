package br.com.gardenWebservice.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pot {
	
	
	private int id;
	
	private int idGarden;	
	
	private String description;	
	
	private int temp;	
	
	private int humAir;	
	
	private int humSoil;	
	
	private int light;
	
	private String mac1;
	
	private String mac2;
	
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
	
	public String getMac1() {
		return mac1;
	}

	public void setMac1(String mac1) {
		this.mac1 = mac1;
		this.mac2 = mac1;
	}

	public String getMac2() {
		return mac2;
	}

	public void setMac2(String mac2) {
		this.mac2 = mac2;
	}

	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
