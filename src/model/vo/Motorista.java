package model.vo;

public class Motorista extends Pessoa {
    
    private String credencial;
    
    public Motorista(String login, String senha, String credencial) {
        super(login, senha);
        this.credencial = credencial;
    }
    
    public Motorista(String nome, String sobrenome, String cpf, String email, String telefone, String login,
            String senha, String credencial) {
        super(nome, sobrenome, cpf, email, telefone, login, senha);
        this.credencial = credencial;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        Motorista other = (Motorista) obj;
        
        if (credencial == null) {
            if (other.credencial != null)
                return false;
        } 
        
        else if (!credencial.equals(other.credencial))
            return false;
        
        else if (getCpf() == null) {
            if (other.getCpf() != null) 
                return false;
        }
        
        else if (!getCpf().equals(other.getCpf())) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString() {
        return "Motorista [credencial=" + credencial + " cpf: " + getCpf() + "]";
    }

    public String getCredencial() {
        return credencial;
    }
    
}
