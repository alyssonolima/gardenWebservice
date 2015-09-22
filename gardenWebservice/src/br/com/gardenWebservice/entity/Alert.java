package br.com.gardenWebservice.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alert {

	@XmlElement
	private int id;
	
	@XmlElement
	private int idPot;
	
	@XmlElement	
	private int idAlertType;
	
	@XmlElement
	private String description;
	
	@XmlElement
	private Date activationDate;
	
	@XmlElement
	private boolean active;
	
	
	
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
	public int getIdAlertType() {
		return idAlertType;
	}
	public void setIdAlertType(int idAlertType) {
		this.idAlertType = idAlertType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
