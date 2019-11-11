package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exception.ExceptionPassageiro;
import model.bo.PassageiroBo;
import model.vo.BaseDadosPassageiro;
import model.vo.Passageiro;
import view.CadastroPassageiro;
import view.DashBoardPassageiro;
import view.Mensagens;
import view.TelaLoginPassageiro;

public class ControllerTelaLoginPassageiro {
	private TelaLoginPassageiro tela;
	private CadastroPassageiro cPassageiro;
	private PassageiroBo passageiroBO;
	private DashBoardPassageiro dash;
	public ControllerTelaLoginPassageiro(TelaLoginPassageiro tela,CadastroPassageiro cPassageiro,DashBoardPassageiro dash) {
		super();
		this.tela = tela;
		this.cPassageiro = cPassageiro;
		this.passageiroBO = new PassageiroBo();
		this.dash=dash;
		Control();
	}
	private void Control() {
		tela.getBtnCadastrar().addActionListener(new Botoes());
		tela.getBtnSair().addActionListener(new Botoes());
		tela.getBtnEsqueci().addActionListener(new Botoes());
		tela.getBtnEntrar().addActionListener(new Botoes());
		
	}
	
	private class Botoes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tela.getBtnCadastrar()) {
				cPassageiro.setVisible(true);
			}
			if(e.getSource() == tela.getBtnSair()) {
				if(Mensagens.mensagemConfirmacao("Deseja sair do sistema?")) {
					System.exit(0);
				}
			}
			if(e.getSource() == tela.getBtnEsqueci()) {
				
			}
			if(e.getSource() == tela.getBtnEntrar()) {
				try {
					for(Passageiro p:passageiroBO.consultarTodos()) {
						if(p.getLogin().equals(tela.getLoginTxt().getText()) && p.getSenha().equals(tela.getSenhaTxt().getText())) {
							BaseDadosPassageiro.setAutenticado(p);
							dash.getLblUsuario().setText(p.getLogin());
							dash.getiPassageiro().getLblNomeM().setText(p.getNome());
							dash.getiPassageiro().getLblSobrenomeM().setText(p.getSobrenome());
							tela.getLoginTxt().setText("");
							tela.getSenhaTxt().setText("");
							dash.setVisible(true);
							tela.setVisible(false);
							dash.getBtnInicio().doClick();
						}else {
							Mensagens.mensagem("Login ou senha incorreto!");
						}
					}
				} catch (ExceptionPassageiro e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}}
}
