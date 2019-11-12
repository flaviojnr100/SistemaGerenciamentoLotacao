package model.dao;

import java.util.ArrayList;

import model.vo.BaseDadosViagem;
import model.vo.Passageiro;
import model.vo.Viagem;


public class ViagemDao {

	public ViagemDao() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean cadastrar(Viagem viagem) {
		return BaseDadosViagem.getViagens().add(viagem);
	}
	
	/*public boolean editar(Viagem viagemAntiga, Viagem viagemNova) {
		for(Viagem atual : BaseDadosViagem.getViagens()) {
			if(atual.getData().equals(viagemAntiga.getData())
					&&
					atual.getDestino().equalsIgnoreCase(viagemAntiga.getDestino())
					&&
					atual.getLocalizacao().equalsIgnoreCase(viagemAntiga.getLocalizacao())
					&&
					atual.getPassageiro().equals(viagemNova.getPassageiro())
					) {
				BaseDadosViagem.getViagens().remove(atual);
				return BaseDadosViagem.getViagens().add(viagemNova);
			}
		}
		
		return false;
	}
	*/
/*	public boolean remover(Passageiro cliente) {
		Viagem viagem = consultar(cliente);
		if(viagem != null) {
			return BaseDadosViagem.getViagens().remove(viagem);
		}
		return false;
	}
	*/
/*	public Viagem consultar(Passageiro cliente) {
		for(Viagem atual : BaseDadosViagem.getViagens()) {
			if(atual.getPassageiro().getCpf().equals(cliente.getCpf())){
				return atual;
			}
		}
		return null;
	}
	*/
	public ArrayList<Viagem> consultarTodos(){
		return BaseDadosViagem.getViagens();
	}
	
}
