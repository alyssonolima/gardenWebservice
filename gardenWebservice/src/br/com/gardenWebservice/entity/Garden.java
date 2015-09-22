package br.com.gardenWebservice.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Garden {

	@XmlElement
	private int id;
	
	@XmlElement
	private int idUser;
	
	@XmlElement
	private String description;
	
	@XmlElement
	private String obs;
	
	@XmlElement
	private String ipServer;
	
	@XmlElement
	private String ipConcentrator;
	
	@XmlElement
	private boolean active;
		
	@XmlElement
	private Date lastUpdate;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdUser() {
		return idUser;
	}
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getObs() {
		return obs;
	}
	
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public String getIpServer() {
		return ipServer;
	}
	
	public void setIpServer(String ipServer) {
		this.ipServer = ipServer;
	}
	
	public String getIpConcentrator() {
		return ipConcentrator;
	}
	
	public void setIpConcentrator(String ipConcentrator) {
		this.ipConcentrator = ipConcentrator;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Date getLastUpdate() {
		return lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}		
	
}
