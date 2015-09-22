package br.com.gardenWebservice.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserGarden {

	@XmlElement
	private int id;
	
	@XmlElement
	private int idUserConfig;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private String nickName;
	
	@XmlElement
	private String email;
	
	@XmlElement
	private String password;
	
	@XmlElement
	private boolean active;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUserConfig() {
		return idUserConfig;
	}
	public void setIdUserConfig(int idUserConfig) {
		this.idUserConfig = idUserConfig;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
		
}
