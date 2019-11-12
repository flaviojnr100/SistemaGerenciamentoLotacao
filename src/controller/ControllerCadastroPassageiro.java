package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exception.ExceptionPassageiro;
import model.bo.PassageiroBo;
import model.vo.FluxoDados;
import model.vo.Passageiro;
import view.CadastroPassageiro;
import view.Mensagens;

public class ControllerCadastroPassageiro {
	private CadastroPassageiro tela;
	private PassageiroBo passageiroBO;
	public ControllerCadastroPassageiro(CadastroPassageiro tela) {
		super();
		this.tela = tela;
		this.passageiroBO = new PassageiroBo();
		Control();
	}
	private void Control() {
		tela.getBtnCadastrar().addActionListener(new Botoes());
		tela.getBtnLimpar().addActionListener(new Botoes());
		tela.getBtnCancelar().addActionListener(new Botoes());
		
	}
	private class Botoes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == tela.getBtnCadastrar()) {
				
					if(tela.getSenhaTxt().getText().equals(tela.getConfirmarSenhaTxt().getText())) {
						if(passageiroBO.cadastrar(new Passageiro(tela.getNomeTxt().getText(), tela.getSobrenomeTxt().getText(), tela.getCpfTxt().getText(), tela.getEmailTxt().getText(), tela.getTelefoneTxt().getText(), tela.getLoginTxt().getText(), tela.getSenhaTxt().getText()))) {
							Mensagens.mensagem("Cadastro realizado com sucesso!");
							tela.getBtnLimpar().doClick();
							tela.getBtnCancelar().doClick();
							FluxoDados.SalvarPassageiro();
						}else {
							Mensagens.mensagem("Erro ao realizar o cadastro!");
						}
					}else {
						Mensagens.mensagem("Erro, as senhas não coincidem!");
					}
				 
				
			}
			if(e.getSource() == tela.getBtnLimpar()) {
				tela.getNomeTxt().setText("");
				tela.getSobrenomeTxt().setText("");
				tela.getCpfTxt().setText("");
				tela.getEmailTxt().setText("");
				tela.getTelefoneTxt().setText("");
				tela.getLoginTxt().setText("");
				tela.getSenhaTxt().setText("");
				
			}
			if(e.getSource() == tela.getBtnCancelar()) {
				tela.setVisible(false);
				
				
			}
			
		}
		
	}
	
}
