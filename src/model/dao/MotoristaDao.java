package model.dao;

import model.vo.BaseDadosMotorista;
import model.vo.Motorista;

public class MotoristaDao {
    
    public boolean adicionarMotorista(Motorista motorista) {
        if (!isMotorista(motorista)) {
            return BaseDadosMotorista.getMotoristas().add(motorista);
        }
        return false;
    }
    
    public boolean removerMotorista(Motorista motorista) {
        Motorista motoristaAuxiliar = buscarMotorista(motorista);
        if (motoristaAuxiliar != null) {
            return BaseDadosMotorista.getMotoristas().remove(motoristaAuxiliar);
        }
        return false;
    }
    
    public Motorista buscarMotorista(Motorista motorista) {
        for (Motorista motoristaAtual : BaseDadosMotorista.getMotoristas()) {
            if (motoristaAtual.equals(motorista)) {
                return motoristaAtual;
            }
        }
        return null;
    }
    
    public boolean isMotorista(Motorista motorista) {
        return buscarMotorista(motorista) != null;
    }
    
    public String consultarInformacoesMotorista(Motorista motorista) {
        return buscarMotorista(motorista).toString();
    }
    
    public boolean editarMotorista(Motorista motoristaAntigo, Motorista motoristaNovo) {
        removerMotorista(motoristaAntigo);
        return adicionarMotorista(motoristaNovo);
    }
    
    public String detalhesTodosMotoristas() {
        String res = "";
        for (Motorista motorista : BaseDadosMotorista.getMotoristas()) {
            res += motorista.toString();
            res += "\n";
        }
        return res;
    }
 
}
