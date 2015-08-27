package br.com.gardenWebservice.entity;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NovoVaso {
	
	private long id;
	private String descricao;
	private String MAC1;
	private String MAC2;
	private int temp;
	private int umidSolo;
	private int umidAr;
	private int luz;
	private int bomba;
	private int bombaAT;
	private int ativo;
	
	
	public NovoVaso(){}
	
	public NovoVaso(String descricao){
		
		this.descricao = descricao;
		this.id = 0;
		this.MAC1 = "00:00:00:00:00:00";
		this.temp = 0;
		this.umidSolo = 0;
		this.umidAr = 0;
		this.luz = 0;
		this.ativo = 1;
		this.bomba = 0;
		this.bombaAT = 0;
		
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
		return MAC1;
	}
	public void setMAC(String mAC) {
		MAC1 = mAC;
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

	public int getBombaAT() {
		return bombaAT;
	}

	public void setBombaAT(int bombaAT) {
		this.bombaAT = bombaAT;
	}

	public int getBomba() {
		return bomba;
	}

	public void setBomba(int bomba) {
		this.bomba = bomba;
	}

}
