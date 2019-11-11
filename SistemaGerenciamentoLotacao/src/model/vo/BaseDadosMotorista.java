package model.vo;

import java.util.ArrayList;

public class BaseDadosMotorista {
    
    private static ArrayList<Motorista> motoristas = new ArrayList<Motorista>();

    public static ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

	public static void setMotoristas(ArrayList<Motorista> motoristas) {
		BaseDadosMotorista.motoristas = motoristas;
	}
    
    
}
