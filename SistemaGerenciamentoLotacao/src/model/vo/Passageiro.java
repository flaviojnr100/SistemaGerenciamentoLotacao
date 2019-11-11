package model.vo;

import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Passageiro extends Pessoa {
	@XStreamAlias("viagens")
	private ArrayList<Viagem> viagens = new ArrayList<>();
	public Passageiro(String nome, String sobrenome, String cpf, String email, String telefone, String login,
			String senha) {
		super(nome, sobrenome, cpf, email, telefone, login, senha);
		// TODO Auto-generated constructor stub
	}

	public Passageiro(String login, String senha) {
		super(login, senha);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Viagem> getViagens() {
		return viagens;
	}
	
	

}
