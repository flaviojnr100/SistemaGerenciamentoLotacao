package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Observable;

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
import view.InformacoesViagem;
import view.Mensagens;
import view.TelaLoginPassageiro;

public class ControllerDashBoardPassageiro extends Observable {
	private DashBoardPassageiro tela;
	private ViagemBo viagemBO;
	private PassageiroBo passageiroBo;
	private TelaLoginPassageiro tLogin;
	private ArrayList<Viagem> viagemLike = BaseDadosViagem.getViagens();
	private InformacoesViagem informacoes;
	public ControllerDashBoardPassageiro(DashBoardPassageiro tela,TelaLoginPassageiro tLogin,InformacoesViagem informacoes) {
		super();
		this.tela = tela;
		this.viagemBO = new ViagemBo();
		this.passageiroBo = new PassageiroBo();
		this.tLogin = tLogin;
		this.informacoes = informacoes;
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
		
		tela.getTcViagem().getjMenuInformacoes().addActionListener(new Caixa());
		tela.getTcViagem().getjMenuReservarVaga().addActionListener(new Caixa());
		tela.getTcViagem().getjMenuSair().addActionListener(new Caixa());
		
		tela.getTcViagem().getFtfConsulta().addKeyListener(new BuscaTeclado());
		
		informacoes.getBtnOk().addActionListener(new Caixa());
		
		tela.getiPassageiro().getjTableViagens().addMouseListener(new CaixaInicio());
		tela.getiPassageiro().getVerInformacoes().addActionListener(new CaixaInicio());
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
				limparDadosPassageiroViagens();
				colocarPassageiroViagens();
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
					FluxoDados.SalvarPassageiro();
					tela.setVisible(false);
					tLogin.setVisible(true);
				}
			}
			
			if(e.getSource() == tela.getBtnSair()) {
				if(Mensagens.mensagemConfirmacao("Você deseja sair do sistema ?"))
					FluxoDados.SalvarPassageiro();
					System.exit(0);
				
				
				
			}
			
		}}
	
	private class BuscaTeclado implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if(tela.getTcViagem().getFtfConsulta().hasFocus()) {
				buscaLike();
				setChanged();
				notifyObservers("busca");
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}}
	
	private void colocarPassageiroViagens() {
		int i=0;
		for(Viagem v:BaseDadosPassageiro.getAutenticado().getViagens()) {
			tela.getiPassageiro().getjTableViagens().getModel().setValueAt(v.getDestino(), i, 0);
			tela.getiPassageiro().getjTableViagens().getModel().setValueAt(v.getHora(), i, 1);
			i++;
		}
	}
	private void limparDadosPassageiroViagens() {
		for(int i=0;i<BaseDadosPassageiro.getAutenticado().getViagens().size()+1;i++) {
			tela.getiPassageiro().getjTableViagens().getModel().setValueAt("", i, 0);
			tela.getiPassageiro().getjTableViagens().getModel().setValueAt("", i, 1);
		}
	}
	public void colocarDados() {
		
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
	public void limparDados() {
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
	public void colocarDadosLike() {
		
		
			int i=0;
			for(Viagem v:viagemLike) {
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
		
	} 
	public void buscaLike() {
		ArrayList<Viagem> viagens = new ArrayList<>();
		if(tela.getTcViagem().getRdbtnData().isSelected()) {
			for(Viagem v:BaseDadosViagem.getViagens()) {
				if(v.getData().contains(tela.getTcViagem().getFtfConsulta().getText())) {
					viagens.add(v);
				}
			}
			
		}else if(tela.getTcViagem().getRdbtnMotorista().isSelected()) {
			for(Viagem v:BaseDadosViagem.getViagens()) {
				if(v.getMotorista().getNome().contains(tela.getTcViagem().getFtfConsulta().getText())) {
					viagens.add(v);
				}
			}
			
			
		}else if(tela.getTcViagem().getRdbtnLocalDeSada().isSelected()) {
			for(Viagem v:BaseDadosViagem.getViagens()) {
				if(v.getLocal().contains(tela.getTcViagem().getFtfConsulta().getText())) {
					viagens.add(v);
				}
			}
		}
		viagemLike = viagens;
		
	}
	
	private class Caixa implements MouseListener,ActionListener{

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

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tela.getTcViagem().getjMenuInformacoes()) {
				informacoes.getLblMotoristaM().setText((String)tela.getTcViagem().getTable().getModel().getValueAt(tela.getTcViagem().getTable().getSelectedRow(), 0));
				informacoes.getLblDataM().setText((String)tela.getTcViagem().getTable().getModel().getValueAt(tela.getTcViagem().getTable().getSelectedRow(), 1));
				informacoes.getLblHorarioM().setText((String)tela.getTcViagem().getTable().getModel().getValueAt(tela.getTcViagem().getTable().getSelectedRow(), 2));
				informacoes.getLblLocalM().setText((String)tela.getTcViagem().getTable().getModel().getValueAt(tela.getTcViagem().getTable().getSelectedRow(), 3));
				informacoes.getLblDestinoM().setText((String)tela.getTcViagem().getTable().getModel().getValueAt(tela.getTcViagem().getTable().getSelectedRow(), 4));
				informacoes.getLblValorM().setText(tela.getTcViagem().getTable().getModel().getValueAt(tela.getTcViagem().getTable().getSelectedRow(), 6)+"");
				informacoes.setVisible(true);
				
			}
			if(e.getSource() == tela.getTcViagem().getjMenuReservarVaga()) {
				
					if(Mensagens.mensagemConfirmacao("Você deseja reservar uma vaga?")) {
						if(passageiroBo.reservarVaga(BaseDadosPassageiro.getAutenticado(), BaseDadosViagem.getViagens().get(tela.getTcViagem().getTable().getSelectedRow()))) {
							Mensagens.mensagem("Passagem reservado com sucesso!");
							setChanged();
							notifyObservers(tela.getTcViagem().getjMenuReservarVaga());
						}else {
							Mensagens.mensagem("Erro ao reservar uma vaga!");
						}
					}
				
			}
			if(e.getSource() == tela.getTcViagem().getjMenuSair()) {
				tela.getBtnInicio().doClick();
			}
			if(e.getSource() == informacoes.getBtnOk()) {
				informacoes.setVisible(false);
			}
			
			
		}
		
	}
	private class BotoesConsultar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == tela.getTcViagem().getBtnBuscar()) {
				if(!tela.getTcViagem().getTable().getModel().getValueAt(tela.getTcViagem().getTable().getSelectedRow(), 0).equals("")) {
					tela.getTcViagem().getjMenuInformacoes().doClick();
				}
			}
			if(e.getSource() == tela.getTcViagem().getBtnVoltar()) {
				tela.getBtnInicio().doClick();
			}
			
		}}
	
	private class BotoesEditar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tela.getePassageiro().getBtnEditar()) {
				if(tela.getePassageiro().getCpfTxt().getText().equals(BaseDadosPassageiro.getAutenticado().getCpf()) || passageiroBo.consultarCpf(tela.getePassageiro().getCpfTxt().getText())==null) {
				if(tela.getePassageiro().getSenhaTxt().getText().equals(tela.getePassageiro().getConfirmarSenhaTxt().getText())) {
						Passageiro p = new Passageiro(tela.getePassageiro().getNomeTxt().getText(), tela.getePassageiro().getSobrenomeTxt().getText(), tela.getePassageiro().getCpfTxt().getText(), tela.getePassageiro().getEmailTxt().getText(),
								tela.getePassageiro().getTelefoneTxt().getText(), tela.getePassageiro().getLoginTxt().getText(),
								tela.getePassageiro().getSenhaTxt().getText());
						passageiroBo.editar(BaseDadosPassageiro.getAutenticado(), p);
						Mensagens.mensagem("Registro alterado com sucesso!");
						FluxoDados.SalvarPassageiro();
						BaseDadosPassageiro.setAutenticado(p);
						tela.getLblUsuario().setText(BaseDadosPassageiro.getAutenticado().getLogin());
						tela.getiPassageiro().getLblNomeM().setText(BaseDadosPassageiro.getAutenticado().getNome());
						tela.getiPassageiro().getLblSobrenomeM().setText(BaseDadosPassageiro.getAutenticado().getSobrenome());
						p = null;
						tela.getePassageiro().getBtnCancelar().doClick();
						
					
				
			}else {
				Mensagens.mensagem("Erro, Senhas não coincidem!");
			}
				}else {
					Mensagens.mensagem("Erro, esse cpf ja foi utilizado!");
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
	public DashBoardPassageiro getTela() {
		return tela;
	}
	public void setTela(DashBoardPassageiro tela) {
		this.tela = tela;
	}
	
	private class CaixaInicio implements MouseListener,ActionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(SwingUtilities.isRightMouseButton(e)) {
				try {
				if(!tela.getiPassageiro().getjTableViagens().getModel().getValueAt(tela.getiPassageiro().getjTableViagens().getSelectedRow(), 0).equals("")) {
					tela.getiPassageiro().getCaixa().show(tela.getiPassageiro().getjTableViagens(), e.getX(), e.getY());
				}
			}catch(Exception er) {
				
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

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == tela.getiPassageiro().getVerInformacoes()) {
				informacoes.getLblMotoristaM().setText(BaseDadosPassageiro.getAutenticado().getViagens().get(tela.getiPassageiro().getjTableViagens().getSelectedRow()).getMotorista().getNome());
				informacoes.getLblDataM().setText(BaseDadosPassageiro.getAutenticado().getViagens().get(tela.getiPassageiro().getjTableViagens().getSelectedRow()).getData());
				informacoes.getLblHorarioM().setText(BaseDadosPassageiro.getAutenticado().getViagens().get(tela.getiPassageiro().getjTableViagens().getSelectedRow()).getHora());
				informacoes.getLblLocalM().setText(BaseDadosPassageiro.getAutenticado().getViagens().get(tela.getiPassageiro().getjTableViagens().getSelectedRow()).getLocal());
				informacoes.getLblDestinoM().setText(BaseDadosPassageiro.getAutenticado().getViagens().get(tela.getiPassageiro().getjTableViagens().getSelectedRow()).getDestino());
				informacoes.getLblValorM().setText(BaseDadosPassageiro.getAutenticado().getViagens().get(tela.getiPassageiro().getjTableViagens().getSelectedRow()).getValor()+"");
				informacoes.setVisible(true);
			}
			
		}}
	
}
	
