package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EditarPassageiro extends JFrame {
	private JLabel lblNome;
	private JLabel lblSobrenome;
	private JLabel lblCpf;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JLabel lblConfirmarSenha;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	
	private JTextField nomeTxt;
	private JTextField sobrenomeTxt;
	private JTextField cpfTxt;
	private JTextField loginTxt;
	private JPasswordField senhaTxt;
	private JPasswordField confirmarSenhaTxt;
	private JTextField emailTxt;
	private JTextField telefoneTxt;
	
	private JPanel dadosP;
	private JPanel autenticarP;
	private JPanel fundoP;
	
	private JButton btnEditar;
	private JButton btnLimpar;
	private JButton btnCancelar;
	
	
	
	public EditarPassageiro() {
		super("Tela de cadastro");
		setLocation(600,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setUndecorated(true);
		setSize(400,330);
		setLayout(null);
		
		fundoP = new JPanel();
		fundoP.setLayout(null);
		fundoP.setSize(400, 330);
		fundoP.setLocation(0, 0);
		fundoP.setBorder(javax.swing.border.LineBorder.createGrayLineBorder());
		fundoP.setBackground(Color.white);
		
		dadosP = new JPanel();
		dadosP.setLayout(null);
		dadosP.setSize(370, 160);
		dadosP.setLocation(15, 5);
		dadosP.setBackground(Color.white);
		dadosP.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados:"));
		
		lblNome = new JLabel("Nome:");
		lblNome.setSize(50, 10);
		lblNome.setLocation(10, 30);
		dadosP.add(lblNome);
		
		nomeTxt = new JTextField(20);
		nomeTxt.setSize(200, 20);
		nomeTxt.setLocation(120, 30);
		dadosP.add(nomeTxt);
		
		lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setSize(70, 10);
		lblSobrenome.setLocation(10, 55);
		dadosP.add(lblSobrenome);
		
		sobrenomeTxt = new JTextField(20);
		sobrenomeTxt.setSize(200, 20);
		sobrenomeTxt.setLocation(120, 55);
		dadosP.add(sobrenomeTxt);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setSize(70, 10);
		lblCpf.setLocation(10, 80);
		dadosP.add(lblCpf);
		
		cpfTxt = new JTextField(20);
		cpfTxt.setSize(200, 20);
		cpfTxt.setLocation(120, 80);
		dadosP.add(cpfTxt);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setSize(70, 10);
		lblEmail.setLocation(10, 105);
		dadosP.add(lblEmail);
		
		emailTxt = new JTextField(20);
		emailTxt.setSize(200, 20);
		emailTxt.setLocation(120, 105);
		dadosP.add(emailTxt);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setSize(70, 10);
		lblTelefone.setLocation(10, 130);
		dadosP.add(lblTelefone);
		
		telefoneTxt = new JTextField(20);
		telefoneTxt.setSize(200, 20);
		telefoneTxt.setLocation(120, 130);
		dadosP.add(telefoneTxt);
		
		autenticarP = new JPanel();
		autenticarP.setLayout(null);
		autenticarP.setSize(370, 120);
		autenticarP.setLocation(15, 165);
		autenticarP.setBackground(Color.white);
		autenticarP.setBorder(javax.swing.BorderFactory.createTitledBorder("Autenticação:"));
		
		
		lblLogin = new JLabel("Login:");
		lblLogin.setSize(60, 10);
		lblLogin.setLocation(10, 40);
		autenticarP.add(lblLogin);
		
		loginTxt = new JTextField(20);
		loginTxt.setSize(200, 20);
		loginTxt.setLocation(120, 40);
		autenticarP.add(loginTxt);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setSize(70, 12);
		lblSenha.setLocation(10, 65);
		autenticarP.add(lblSenha);
		
		senhaTxt = new JPasswordField(20);
		senhaTxt.setSize(200, 20);
		senhaTxt.setLocation(120, 65);
		autenticarP.add(senhaTxt);
		
		lblConfirmarSenha = new JLabel("Confirme a senha:");
		lblConfirmarSenha.setSize(110, 20);
		lblConfirmarSenha.setLocation(10, 87);
		autenticarP.add(lblConfirmarSenha);
		
		confirmarSenhaTxt = new JPasswordField(20);
		confirmarSenhaTxt.setSize(200, 20);
		confirmarSenhaTxt.setLocation(120, 90);
		autenticarP.add(confirmarSenhaTxt);
		
		btnEditar = new JButton("Editar");
		btnEditar.setSize(100, 35);
		btnEditar.setLocation(20, 288);
		fundoP.add(btnEditar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setSize(100, 35);
		btnLimpar.setLocation(150, 288);
		fundoP.add(btnLimpar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setSize(100, 35);
		btnCancelar.setLocation(280, 288);
		fundoP.add(btnCancelar);
		
		fundoP.add(dadosP);
		fundoP.add(autenticarP);
		add(fundoP);
		
		
		
	}
	
	
	public JTextField getNomeTxt() {
		return nomeTxt;
	}


	public void setNomeTxt(JTextField nomeTxt) {
		this.nomeTxt = nomeTxt;
	}


	public JTextField getSobrenomeTxt() {
		return sobrenomeTxt;
	}


	public void setSobrenomeTxt(JTextField sobrenomeTxt) {
		this.sobrenomeTxt = sobrenomeTxt;
	}


	public JTextField getCpfTxt() {
		return cpfTxt;
	}


	public void setCpfTxt(JTextField cpfTxt) {
		this.cpfTxt = cpfTxt;
	}


	public JTextField getLoginTxt() {
		return loginTxt;
	}


	public void setLoginTxt(JTextField loginTxt) {
		this.loginTxt = loginTxt;
	}


	public JPasswordField getSenhaTxt() {
		return senhaTxt;
	}


	public void setSenhaTxt(JPasswordField senhaTxt) {
		this.senhaTxt = senhaTxt;
	}


	public JPasswordField getConfirmarSenhaTxt() {
		return confirmarSenhaTxt;
	}


	public void setConfirmarSenhaTxt(JPasswordField confirmarSenhaTxt) {
		this.confirmarSenhaTxt = confirmarSenhaTxt;
	}


	public JTextField getEmailTxt() {
		return emailTxt;
	}


	public void setEmailTxt(JTextField emailTxt) {
		this.emailTxt = emailTxt;
	}


	public JTextField getTelefoneTxt() {
		return telefoneTxt;
	}


	public void setTelefoneTxt(JTextField telefoneTxt) {
		this.telefoneTxt = telefoneTxt;
	}


	public JButton getBtnEditar() {
		return btnEditar;
	}


	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}


	public JButton getBtnLimpar() {
		return btnLimpar;
	}


	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}


	public JButton getBtnCancelar() {
		return btnCancelar;
	}


	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

public static void main(String[] args) {
	new EditarPassageiro().setVisible(true);
}
	
}
