package model.vo;



public class Viagem {

	private String data;
	private Motorista motorista;
	private String destino;
	private String hora;
	private String local;
	private double valor;
	private int vagas;
	
	
	
	public Viagem(String data, Motorista motorista, String destino,String hora,String local, double valor, int vagas) {
		super();
		this.data = data;
		this.motorista = motorista;
		this.local = local;
		this.hora = hora;
		this.destino = destino;
		this.valor = valor;
		this.vagas = vagas;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	
	
}
