package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import exception.ExceptionPassageiro;
import model.bo.PassageiroBo;
import model.vo.BaseDadosPassageiro;
import model.vo.FluxoDados;
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
		
		tela.getLoginTxt().addKeyListener(new EventoTeclado());
		tela.getSenhaTxt().addKeyListener(new EventoTeclado());
		tela.getBtnEntrar().addKeyListener(new EventoTeclado());
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
				String nome,sobrenome,cpf,senha,senha2;
				nome = JOptionPane.showInputDialog("Digite o seu nome: ");
				sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");
				cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
				Passageiro passageiro = passageiroBO.consultarCpf(cpf);
				if(passageiro!=null) {
					if(passageiro.getNome().equals(nome) && passageiro.getSobrenome().equals(sobrenome)) {
						while(true) {
							senha = JOptionPane.showInputDialog("Digite a sua nova senha: ");
							senha2 = JOptionPane.showInputDialog("Digite a sua senha novamente: ");
							if(senha.equals(senha2)) {
								passageiro.setSenha(senha);
								FluxoDados.SalvarPassageiro();
								Mensagens.mensagem("Senha alterado com sucesso!");
								break;
							}else {
								JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
							}
						}
					}else {
						JOptionPane.showMessageDialog(null, "Dados incorretos!");
					}
				}
				
			}
			if(e.getSource() == tela.getBtnEntrar()) {
				
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
				 
			}
			
		}}
	private class EventoTeclado implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			if(tela.getLoginTxt().hasFocus() || tela.getSenhaTxt().hasFocus() || tela.getBtnEntrar().hasFocus()) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tela.getBtnEntrar().doClick();
				}
				
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}}
}
