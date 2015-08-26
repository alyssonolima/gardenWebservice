package br.com.gardenWebservice.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vaso")
public class Vaso {

	
	private long id;
	
	private String descricao;
	
	private String MAC;
	
	private int temp;
	
	private int umidSolo;

	private int umidAr;
	
	private int luz;
	
	private int ativo;

	public Vaso(){}
	
	public Vaso(String descricao){		
		this.descricao = descricao;
		this.id = 0;
		this.MAC = "00:00:00:00:00:00";
		this.temp = 0;
		this.umidSolo = 0;
		this.umidAr = 0;
		this.luz = 0;
		this.ativo = 1;		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMAC() {
		return MAC;
	}
	public void setMAC(String mAC) {
		MAC = mAC;
	}
	public int getTemp() {
		return this.temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getUmidSolo() {
		return this.umidSolo;
	}
	public void setUmidSolo(int umidSolo) {
		this.umidSolo = umidSolo;
	}
	public int getUmidAr() {
		return this.umidAr;
	}
	public void setUmidAr(int umidAr) {
		this.umidAr = umidAr;
	}
	public int getLuz() {
		return luz;
	}
	public void setLuz(int luz) {
		this.luz = luz;
	}
	public int getAtivo() {
		return ativo;
	}
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

}




