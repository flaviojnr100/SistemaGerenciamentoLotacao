package app;

import exception.ExceptionPassageiro;
import model.bo.PassageiroBo;

public class App {
	public static void main(String[] args) {
		PassageiroBo bo = new PassageiroBo();
		try {
			bo.consultarTodos();
		} catch (ExceptionPassageiro e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
