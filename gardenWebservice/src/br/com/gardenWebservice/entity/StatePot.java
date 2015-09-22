package br.com.gardenWebservice.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatePot {

	@XmlElement
	private int id;
	
	@XmlElement
	private int idPot;
	
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
	
	@XmlElement
	private boolean irrigationAuto;
	
	@XmlElement
	private boolean irrigationActive;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPot() {
		return idPot;
	}

	public void setIdPot(int idPot) {
		this.idPot = idPot;
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

	public boolean isIrrigationAuto() {
		return irrigationAuto;
	}

	public void setIrrigationAuto(boolean irrigationAuto) {
		this.irrigationAuto = irrigationAuto;
	}

	public boolean isIrrigationActive() {
		return irrigationActive;
	}

	public void setIrrigationActive(boolean irrigationActive) {
		this.irrigationActive = irrigationActive;
	}
	
	
	
}
