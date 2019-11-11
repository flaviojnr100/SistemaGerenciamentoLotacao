package model.bo;

import java.util.ArrayList;

import exception.ExceptionPassageiro;
import model.dao.PassageiroDao;
import model.vo.BaseDadosPassageiro;
import model.vo.Passageiro;

public class PassageiroBo {
	private PassageiroDao passageiroDao;

	public PassageiroBo() {
		super();
		this.passageiroDao = new PassageiroDao();
	}
	public boolean cadastrar(Passageiro passageiro) throws ExceptionPassageiro {
		if(this.validarRegistro(passageiro)) {
			return passageiroDao.cadastrar(passageiro);
		}
		throw new ExceptionPassageiro("cadastro");
	}
	public Passageiro consultarCpf(String cpf) throws ExceptionPassageiro {
		if(!cpf.equals("") && cpf.length() == 14) {
			return passageiroDao.consultarCpf(cpf);
			
		}
		throw new ExceptionPassageiro("consulta");
		
	}
	public boolean removerCpf(String cpf) throws ExceptionPassageiro {
		if(this.consultarCpf(cpf)!=null) {
			return passageiroDao.removerCpf(cpf);
		}
		return false;
	}
	public ArrayList<Passageiro> consultarTodos() throws ExceptionPassageiro{
		if(BaseDadosPassageiro.getPassageiros().size()>0) {
			return passageiroDao.consultarTodos();
		}
		throw new ExceptionPassageiro("consulta");
	}
	
	public boolean editar(Passageiro passageiroAntigo,Passageiro passageiroNovo) throws ExceptionPassageiro {
		if(this.validarRegistro(passageiroAntigo)) {
			this.removerCpf(passageiroAntigo.getCpf());
			this.cadastrar(passageiroNovo);
			return true;
		}
		throw new ExceptionPassageiro("editar");
	}
	public boolean validarRegistro(Passageiro passageiro) {
		for(Passageiro p:BaseDadosPassageiro.getPassageiros()) {
			if(p.getCpf().equals(passageiro.getCpf()) && passageiro.getCpf().length()==14) {
				return false;
			}
		}
		return true;
	}
}
