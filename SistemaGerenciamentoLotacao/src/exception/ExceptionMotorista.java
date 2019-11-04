package exception;

public class ExceptionMotorista extends Exception {
    
    public ExceptionMotorista(String texto) {
    
        if(texto.equals("consulta")) {
            System.out.println("Erro, não há motoristas cadastrados no sistema!");
        }
        else if(texto.equals("cadastro")) {
            System.out.println("Erro ao cadastrar o motorista no sistema!");
        }
        else if(texto.equals("editar")) {
            System.out.println("Erro ao editar o registro!");
        }
        else if (texto.equals("remover")) {
            System.out.println("Erro ao remover o Motorista");
        }
        
    }
}
