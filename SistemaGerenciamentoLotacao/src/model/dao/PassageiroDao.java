package model.dao;

import java.util.ArrayList;

import model.vo.BaseDadosPassageiro;
import model.vo.Passageiro;
import model.vo.Viagem;

public class PassageiroDao {
	public PassageiroDao() {
		// TODO Auto-generated constructor stub
	}
	public boolean cadastrar(Passageiro passageiro) {
		BaseDadosPassageiro.getPassageiros().add(passageiro);
		return true;
	}
	public Passageiro consultarCpf(String cpf) {
		for(Passageiro p:BaseDadosPassageiro.getPassageiros()) {
			if(p.getCpf().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	public boolean removerCpf(String cpf) {
		int i=0;
		for(Passageiro p:BaseDadosPassageiro.getPassageiros()) {
			if(p.getCpf().equals(cpf)) {
				BaseDadosPassageiro.getPassageiros().remove(i);
				return true;
			}
			i++;
		}
		
		return false;
	}
	public ArrayList<Passageiro> consultarTodos(){
		return BaseDadosPassageiro.getPassageiros();
	}
	public boolean editar(Passageiro passageiroAntigo,Passageiro passageiroNovo) {
		passageiroAntigo.setNome(passageiroNovo.getNome());
		passageiroAntigo.setSobrenome(passageiroNovo.getSobrenome());
		passageiroAntigo.setCpf(passageiroNovo.getCpf());
		passageiroAntigo.setEmail(passageiroNovo.getEmail());
		passageiroAntigo.setTelefone(passageiroNovo.getTelefone());
		passageiroAntigo.setLogin(passageiroNovo.getLogin());
		passageiroAntigo.setSenha(passageiroNovo.getSenha());
		
		return true;
	}
	
	public boolean reservarVaga(Passageiro passageiro,Viagem viagem) {
		passageiro.getViagens().add(viagem);
		viagem.setVagas(viagem.getVagas()-1);
		return true;
	}
	
	
}
