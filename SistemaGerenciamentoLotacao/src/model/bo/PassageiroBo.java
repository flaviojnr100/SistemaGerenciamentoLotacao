package model.bo;

import java.util.ArrayList;

import exception.ExceptionPassageiro;
import model.dao.PassageiroDao;
import model.vo.BaseDadosPassageiro;
import model.vo.Passageiro;
import model.vo.Viagem;

public class PassageiroBo {
	private PassageiroDao passageiroDao;

	public PassageiroBo() {
		super();
		this.passageiroDao = new PassageiroDao();
	}
	public boolean cadastrar(Passageiro passageiro){
		if(this.validarRegistro(passageiro)) {
			return passageiroDao.cadastrar(passageiro);
		}
		return false;
		
	}
	public Passageiro consultarCpf(String cpf){
		//if(!cpf.equals("") && cpf.length() == 14) {
			return passageiroDao.consultarCpf(cpf);
			
		//}
		//return null;
		
		
	}
	public boolean removerCpf(String cpf){
		if(this.consultarCpf(cpf)!=null) {
			return passageiroDao.removerCpf(cpf);
		}
		return false;
	}
	public ArrayList<Passageiro> consultarTodos(){
		if(BaseDadosPassageiro.getPassageiros().size()>0) {
			return passageiroDao.consultarTodos();
		}
		return null;
		
	}
	
	public boolean editar(Passageiro passageiroAntigo,Passageiro passageiroNovo){
		//if(this.validarRegistro(passageiroAntigo)) {
			this.removerCpf(passageiroAntigo.getCpf());
			this.cadastrar(passageiroNovo);
			return true;
		//}
		//return false;
		
	}
	public boolean validarRegistro(Passageiro passageiro) {
		for(Passageiro p:BaseDadosPassageiro.getPassageiros()) {
			if(passageiro.getCpf().length()==14) {
				return false;
			}
		}
		return true;
	}
	public boolean reservarVaga(Passageiro passageiro,Viagem viagem) {
		if(viagem.getVagas()>0) {
			return passageiroDao.reservarVaga(passageiro, viagem);
		}else {
			return false;
		}
	}
}
