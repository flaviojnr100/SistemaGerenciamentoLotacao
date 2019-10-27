package exception;

public class ExceptionPassageiro extends Exception {
	public ExceptionPassageiro(String texto) {
		if(texto.equals("consulta")) {
			System.out.println("Erro, não há passageiro cadastrados no sistema!");
		}else if(texto.equals("cadastro")) {
			System.out.println("Erro ao cadastrar o passageiro no sistema!");
		}else if(texto.equals("editar")) {
			System.out.println("Erro ao editar o registro!");
		}
	}
}
