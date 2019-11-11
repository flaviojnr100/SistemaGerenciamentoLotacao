package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

import javax.swing.SwingUtilities;

import exception.ExceptionPassageiro;
import exception.ExceptionViagem;
import model.bo.PassageiroBo;
import model.bo.ViagemBo;
import model.vo.BaseDadosPassageiro;
import model.vo.BaseDadosViagem;
import model.vo.FluxoDados;
import model.vo.Passageiro;
import model.vo.Viagem;
import view.DashBoardPassageiro;
import view.EditarPassageiro;
import view.Mensagens;
import view.TelaLoginPassageiro;

public class ControllerDashBoardPassageiro {
	private DashBoardPassageiro tela;
	private ViagemBo viagemBO;
	private PassageiroBo passageiroBo;
	private TelaLoginPassageiro tLogin;

	public ControllerDashBoardPassageiro(DashBoardPassageiro tela,TelaLoginPassageiro tLogin) {
		super();
		this.tela = tela;
		this.viagemBO = new ViagemBo();
		this.passageiroBo = new PassageiroBo();
		this.tLogin = tLogin;
		
		Control();
	}
	private void Control() {
		tela.getBtnEfetuarViagem().addActionListener(new Botoes());
		tela.getBtnInicio().addActionListener(new Botoes());
		tela.getBtnFazerLogoff().addActionListener(new Botoes());
		tela.getBtnConfiguracao().addActionListener(new Botoes());
		tela.getBtnSair().addActionListener(new Botoes());
		tela.getTcViagem().getTable().addMouseListener(new Caixa());
		
		tela.getePassageiro().getBtnEditar().addActionListener(new BotoesEditar());
		tela.getePassageiro().getBtnLimpar().addActionListener(new BotoesEditar());
		tela.getePassageiro().getBtnCancelar().addActionListener(new BotoesEditar());
		
		tela.getTcViagem().getBtnBuscar().addActionListener(new BotoesConsultar());
		tela.getTcViagem().getBtnVoltar().addActionListener(new BotoesConsultar());
		
	}
	private class Botoes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tela.getBtnEfetuarViagem()) {
				limparDados();
				colocarDados();
				tela.getTcViagem().setVisible(true);
				tela.getiPassageiro().setVisible(false);
				tela.getePassageiro().setVisible(false);
			}
			if(e.getSource() == tela.getBtnInicio()) {
				tela.getiPassageiro().setVisible(true);
				tela.getePassageiro().setVisible(false);
				tela.getTcViagem().setVisible(false);
				
				
			}
			if(e.getSource() == tela.getBtnConfiguracao()) {
				tela.getePassageiro().getNomeTxt().setText(BaseDadosPassageiro.getAutenticado().getNome());
				tela.getePassageiro().getSobrenomeTxt().setText(BaseDadosPassageiro.getAutenticado().getSobrenome());
				tela.getePassageiro().getCpfTxt().setText(BaseDadosPassageiro.getAutenticado().getCpf());
				tela.getePassageiro().getEmailTxt().setText(BaseDadosPassageiro.getAutenticado().getEmail());
				tela.getePassageiro().getTelefoneTxt().setText(BaseDadosPassageiro.getAutenticado().getTelefone());
				tela.getePassageiro().getLoginTxt().setText(BaseDadosPassageiro.getAutenticado().getLogin());
				tela.getePassageiro().getSenhaTxt().setText(BaseDadosPassageiro.getAutenticado().getSenha());
				tela.getePassageiro().getConfirmarSenhaTxt().setText(BaseDadosPassageiro.getAutenticado().getSenha());
				tela.getePassageiro().setVisible(true);
				tela.getiPassageiro().setVisible(false);
				tela.getTcViagem().setVisible(false);
			}
			if(e.getSource() == tela.getBtnFazerLogoff()) {
				
				if(Mensagens.mensagemConfirmacao("Você deseja sair do sistema?")) {
					tela.setVisible(false);
					tLogin.setVisible(true);
				}
			}
			
			if(e.getSource() == tela.getBtnSair()) {
				if(Mensagens.mensagemConfirmacao("Você deseja sair do sistema ?"))
					System.exit(0);
				
				
				
			}
			
		}}
	
	private void colocarDados() {
		
		try {
			int i=0;
			for(Viagem v:viagemBO.consultarTodos()) {
				tela.getTcViagem().getTable().getModel().setValueAt(v.getMotorista().getNome(), i, 0);
				tela.getTcViagem().getTable().getModel().setValueAt(v.getData(), i, 1);
				tela.getTcViagem().getTable().getModel().setValueAt(v.getHora(), i, 2);
				tela.getTcViagem().getTable().getModel().setValueAt(v.getLocal(), i, 3);
				tela.getTcViagem().getTable().getModel().setValueAt(v.getDestino(), i, 4);
				tela.getTcViagem().getTable().getModel().setValueAt(v.getVagas(), i, 5);
				DecimalFormat df = new DecimalFormat("00.00");
				tela.getTcViagem().getTable().getModel().setValueAt("R$ "+df.format(v.getValor()), i, 6);
				i++;
			}
		} catch (ExceptionViagem e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void limparDados() {
		try {
			
			for(int i=0;i<viagemBO.consultarTodos().size()+1;i++) {
				for(int j=0;j<7;j++) {
					tela.getTcViagem().getTable().getModel().setValueAt("", i, j);
				}
				
			}
		} catch (ExceptionViagem e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private class Caixa implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(SwingUtilities.isRightMouseButton(e)) {
				try {
					if(!tela.getTcViagem().getTable().getModel().getValueAt(tela.getTcViagem().getTable().getSelectedRow(), 0).equals("")) {
						tela.getTcViagem().getCaixa().show(tela.getTcViagem().getTable(), e.getX(), e.getY());
					}
				}catch(Exception e1) {
					
				}
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private class BotoesConsultar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == tela.getTcViagem().getBtnBuscar()) {
				
			}
			if(e.getSource() == tela.getTcViagem().getBtnVoltar()) {
				tela.getBtnInicio().doClick();
			}
			
		}}
	
	private class BotoesEditar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tela.getePassageiro().getBtnEditar()) {
				try {
				if(tela.getePassageiro().getSenhaTxt().equals(tela.getePassageiro().getConfirmarSenhaTxt().getText())) {
					
						if(passageiroBo.editar(BaseDadosPassageiro.getAutenticado(), new Passageiro(tela.getePassageiro().getNomeTxt().getText(), tela.getePassageiro().getSobrenomeTxt().getText(), tela.getePassageiro().getCpfTxt().getText(), tela.getePassageiro().getEmailTxt().getText(),
								tela.getePassageiro().getTelefoneTxt().getText(), tela.getePassageiro().getLoginTxt().getText(),
								tela.getePassageiro().getSenhaTxt().getText()))){
						Mensagens.mensagem("Registro alterado com sucesso!");
						FluxoDados.SalvarPassageiro();
						

						}else {
						
						Mensagens.mensagem("Erro, as senhas não coincidem!");
						}
					
				
			}
				}catch(Exception e1) {
					
				}
				}
			if(e.getSource() == tela.getePassageiro().getBtnLimpar()) {
				tela.getePassageiro().getNomeTxt().setText("");
				tela.getePassageiro().getSobrenomeTxt().setText("");
				tela.getePassageiro().getCpfTxt().setText("");
				tela.getePassageiro().getEmailTxt().setText("");
				tela.getePassageiro().getTelefoneTxt().setText("");
				tela.getePassageiro().getLoginTxt().setText("");
				tela.getePassageiro().getSenhaTxt().setText("");
				tela.getePassageiro().getConfirmarSenhaTxt().setText("");
				
			}
			if(e.getSource() == tela.getePassageiro().getBtnCancelar()) {
				tela.getBtnInicio().doClick();
				
			}
			
		}}
}
	
