package model.bo;

import exception.ExceptionMotorista;
import model.dao.MotoristaDao;
import model.vo.BaseDadosMotorista;
import model.vo.Motorista;

public class MotoristaBo {
    
    private MotoristaDao motoristaDao;
    
    public MotoristaBo(MotoristaDao motoristaDao) {
        this.motoristaDao = motoristaDao;
    }
    
    public boolean adicionarMotorista(Motorista motorista) throws ExceptionMotorista {
        if (validarRegistro(motorista)) {
            return motoristaDao.adicionarMotorista(motorista);
        }
        throw new ExceptionMotorista("cadastro");
    }
    
    public Motorista buscarMotorista(Motorista motorista) throws ExceptionMotorista {
        if (!motorista.getCpf().equals(11)) {
            return motoristaDao.buscarMotorista(motorista);
        }
        throw new ExceptionMotorista("consulta");
    }
    
    public boolean removerMotorista(Motorista motorista) throws ExceptionMotorista {
        if (buscarMotorista(motorista) != null) {
            return motoristaDao.removerMotorista(motorista);
        }
        throw new ExceptionMotorista("remover");
    }
    
    public boolean editarMotorista(Motorista motoristaAntigo, Motorista motoristaNovo) throws ExceptionMotorista {
        if (validarRegistro(motoristaAntigo)) {
            removerMotorista(motoristaAntigo);
            return adicionarMotorista(motoristaNovo);
        }
        throw new ExceptionMotorista("editar");
    }
    
    public boolean validarRegistro(Motorista motorista) {
        for (Motorista motoristaAtual : BaseDadosMotorista.getMotoristas()) {
            if (motoristaAtual.equals(motorista)) {
                return true;
            }
        }
        return false;
    }
    
}
