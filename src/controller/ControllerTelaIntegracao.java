package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaIntegracao;
import view.TelaLoginPassageiro;

public class ControllerTelaIntegracao {
	private TelaIntegracao tela;
	private TelaLoginPassageiro lPassageiro;
	public ControllerTelaIntegracao(TelaIntegracao tela, TelaLoginPassageiro lPassageiro) {
		super();
		this.tela = tela;
		this.lPassageiro = lPassageiro;
		Control();
	}
	
	private void Control() {
		tela.getBtnLoginAdm().addActionListener(new Botoes());
		tela.getBtnLoginPassageiro().addActionListener(new Botoes());
		tela.getBtnLoginMotorista().addActionListener(new Botoes());
	}
	
	private class Botoes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tela.getBtnLoginAdm()) {
				
			}
			if(e.getSource() == tela.getBtnLoginMotorista()) {
				
			}
			if(e.getSource() == tela.getBtnLoginPassageiro()) {
				lPassageiro.setVisible(true);
			}
			
		}}
}
