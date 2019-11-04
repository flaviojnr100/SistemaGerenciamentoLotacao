package model.bo;

import java.util.ArrayList;

import exception.ExceptionPassageiro;
import exception.ExceptionViagem;
import model.dao.ViagemDao;
import model.vo.BaseDadosPassageiro;
import model.vo.BaseDadosViagem;
import model.vo.Passageiro;
import model.vo.Viagem;

public class ViagemBo {

	private ViagemDao viagemDao;

	public ViagemBo() {
		super();
		this.viagemDao = new ViagemDao();
	}
	
	public boolean cadastrar(Viagem viagem) throws ExceptionViagem{
		if(validarViagem(viagem)){
			return viagemDao.cadastrar(viagem);
		}
		throw new ExceptionViagem("Erro ao cadastrar o passageiro no sistema!");
	}
	
	public boolean validarViagem(Viagem viagem) {
		
		if(viagem.getDestino().length() == 0
				&&
				viagem.getLocalizacao().length() == 0
				&&
				viagem.getPassageiro().getCpf().length() == 0
				) {
			return false;
		}
		
		return true;
	}
	
	public ArrayList<Viagem> consultarTodos() throws ExceptionViagem{
		if(BaseDadosViagem.getViagens().size()>0) {
			return viagemDao.consultarTodos();
		}
		throw new ExceptionViagem("Erro, não há viagem cadastrada no sistema!");
	}
	
}
