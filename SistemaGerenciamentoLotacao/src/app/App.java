package app;

import controller.ControllerCadastroPassageiro;
import controller.ControllerDashBoardPassageiro;
import controller.ControllerTelaLoginPassageiro;
import exception.ExceptionPassageiro;
import model.bo.PassageiroBo;
import model.dao.ViagemDao;
import model.vo.BaseDadosViagem;
import model.vo.FluxoDados;
import model.vo.Motorista;
import model.vo.Viagem;
import view.CadastroPassageiro;
import view.ConsultarPassageiro;
import view.DashBoardPassageiro;
import view.EditarPassageiro;
import view.InformacoesViagem;
import view.TelaLoginPassageiro;

public class App {
	public static void main(String[] args) {
		ViagemDao dao = new ViagemDao();
		dao.cadastrar(new Viagem("12/03/2019", new Motorista("flavio", "cordeiro", "111.111.111-11", "asfdasf", "5456465456", "flaviojr", "123", "4569874"),"14:00","Rodoviaria","Tabira", 10.00, 15));
		dao.cadastrar(new Viagem("12/03/2019", new Motorista("Rodrigo", "Santos", "222.222.222-22", "dfsgdfgfd", "34534534", "rojr", "123", "4569874"),"14:00","Praça","Patos", 15.00, 25));
		
		
		FluxoDados.LerDadosMotorista();
		FluxoDados.LerDadosPassageiro();
		//FluxoDados.LerDadosViagem();
		
		DashBoardPassageiro dashPassageiro = new DashBoardPassageiro();
		CadastroPassageiro cPassageiro = new CadastroPassageiro();
		TelaLoginPassageiro loginPassageiro = new TelaLoginPassageiro();
		InformacoesViagem informacoes = new InformacoesViagem();
		
		ControllerDashBoardPassageiro cDash = new ControllerDashBoardPassageiro(dashPassageiro,loginPassageiro,informacoes);
		new ControllerCadastroPassageiro(cPassageiro);
		new ControllerTelaLoginPassageiro(loginPassageiro,cPassageiro,dashPassageiro);
		loginPassageiro.setVisible(true);
		cDash.addObserver(cDash.getTela().getTcViagem());
		

	}
}
