package model.vo;

import java.util.ArrayList;
import java.util.List;

public class BaseDadosPassageiro {
	private static ArrayList<Passageiro> passageiros = new ArrayList<>();
	private static Passageiro autenticado = new Passageiro("usuario", "usuario", "usuario", "usuario", "43645645", "usuario", "usuario");
	
	public static ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}
	public static Passageiro getAutenticado() {
		return autenticado;
	}
	public static void setAutenticado(Passageiro autenticado) {
		BaseDadosPassageiro.autenticado = autenticado;
	}
	public static void setPassageiros(ArrayList<Passageiro> passageiros) {
		BaseDadosPassageiro.passageiros = passageiros;
	}
	
	
	
	
}
