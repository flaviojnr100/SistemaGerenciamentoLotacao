package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CadastroPassageiro;

public class ControllerCadastroPassageiro {
	private CadastroPassageiro tela;

	public ControllerCadastroPassageiro(CadastroPassageiro tela) {
		super();
		this.tela = tela;
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
				
				
			}
			if(e.getSource() == tela.getBtnLimpar()) {
				
				
			}
			if(e.getSource() == tela.getBtnCancelar()) {
				System.exit(0);
				
				
			}
			
		}
		
	}
	
}
