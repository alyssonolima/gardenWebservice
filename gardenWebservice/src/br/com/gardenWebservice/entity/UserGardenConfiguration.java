package br.com.gardenWebservice.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserGardenConfiguration {
	
	@XmlElement
	private int id;	
	
	@XmlElement
	private String description;
	
	@XmlElement
	private String value;
	
	@XmlElement
	private String confg;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getConfg() {
		return confg;
	}
	public void setConfg(String confg) {
		this.confg = confg;
	}
	
}
