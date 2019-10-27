package model.dao;

import java.util.ArrayList;

import model.vo.BaseDadosPassageiro;
import model.vo.Passageiro;

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
		this.removerCpf(passageiroAntigo.getCpf());
		this.cadastrar(passageiroNovo);
		return true;
	}
}
