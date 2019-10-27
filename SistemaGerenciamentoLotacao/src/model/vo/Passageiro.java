package model.vo;

public class Passageiro extends Pessoa {

	public Passageiro(String nome, String sobrenome, String cpf, String email, String telefone, String login,
			String senha) {
		super(nome, sobrenome, cpf, email, telefone, login, senha);
		// TODO Auto-generated constructor stub
	}

	public Passageiro(String login, String senha) {
		super(login, senha);
		// TODO Auto-generated constructor stub
	}
	

}
