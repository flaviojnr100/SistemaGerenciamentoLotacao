package model.vo;

import sun.util.calendar.BaseCalendar.Date;

public class Viagem {

	private Date data;
	private Passageiro passageiro;
	private String localizacao;
	private String destino;
	
	public Viagem(Date data, Passageiro passageiro, String localizacao, String destino) {
		super();
		this.data = data;
		this.passageiro = passageiro;
		this.localizacao = localizacao;
		this.destino = destino;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
}
