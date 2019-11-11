package model.vo;

import java.util.ArrayList;

public class BaseDadosViagem {

	private static ArrayList<Viagem> viagens = new ArrayList<>();

	public static ArrayList<Viagem> getViagens() {
		return viagens;
	}

	public static void setViagens(ArrayList<Viagem> viagens) {
		BaseDadosViagem.viagens = viagens;
	}
	
	
}
