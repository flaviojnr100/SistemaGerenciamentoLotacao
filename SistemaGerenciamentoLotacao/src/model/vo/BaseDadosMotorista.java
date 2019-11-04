package model.vo;

import java.util.ArrayList;

public class BaseDadosMotorista {
    
    private static ArrayList<Motorista> motoristas = new ArrayList<Motorista>();

    public static ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }
    
}
