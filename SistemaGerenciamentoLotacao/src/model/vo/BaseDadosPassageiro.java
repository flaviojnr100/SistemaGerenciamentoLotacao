package model.vo;

import java.util.ArrayList;
import java.util.List;

public class BaseDadosPassageiro {
	private static ArrayList<Passageiro> passageiros = new ArrayList<>();

	public static ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}
	
}
