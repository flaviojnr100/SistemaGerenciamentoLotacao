package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastroPassageiro extends JFrame {
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
	private JPanel tituloP;
	
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JButton btnCancelar;
	
	private JLabel lblTitulo;
	
	
	public CadastroPassageiro() {
		super("Tela de cadastro");
		setLocation(600,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setUndecorated(true);
		setSize(400,410);
		setLayout(null);
		
		fundoP = new JPanel();
		fundoP.setLayout(null);
		fundoP.setSize(400, 410);
		fundoP.setLocation(0, 0);
		fundoP.setBorder(javax.swing.border.LineBorder.createGrayLineBorder());
		fundoP.setBackground(Color.white);
		
		dadosP = new JPanel();
		dadosP.setLayout(null);
		dadosP.setSize(370, 160);
		dadosP.setLocation(15, 70);
		dadosP.setBackground(Color.white);
		dadosP.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados:"));
		
		lblNome = new JLabel("Nome:");
		lblNome.setSize(50, 15);
		lblNome.setFont(new Font("Century Gothic", 0, 14));
		lblNome.setLocation(10, 30);
		dadosP.add(lblNome);
		
		nomeTxt = new JTextField(20);
		nomeTxt.setSize(200, 20);
		nomeTxt.setLocation(140, 30);
		dadosP.add(nomeTxt);
		
		lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setSize(90, 15);
		lblSobrenome.setFont(new Font("Century Gothic", 0, 14));
		lblSobrenome.setLocation(10, 55);
		dadosP.add(lblSobrenome);
		
		sobrenomeTxt = new JTextField(20);
		sobrenomeTxt.setSize(200, 20);
		sobrenomeTxt.setLocation(140, 55);
		dadosP.add(sobrenomeTxt);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setSize(70, 15);
		lblCpf.setFont(new Font("Century Gothic", 0, 14));
		lblCpf.setLocation(10, 80);
		dadosP.add(lblCpf);
		
		cpfTxt = new JTextField(20);
		cpfTxt.setSize(200, 20);
		cpfTxt.setLocation(140, 80);
		dadosP.add(cpfTxt);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setSize(70, 15);
		lblEmail.setFont(new Font("Century Gothic", 0, 14));
		lblEmail.setLocation(10, 105);
		dadosP.add(lblEmail);
		
		emailTxt = new JTextField(20);
		emailTxt.setSize(200, 20);
		emailTxt.setLocation(140, 105);
		dadosP.add(emailTxt);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setSize(70, 15);
		lblTelefone.setFont(new Font("Century Gothic", 0, 14));
		lblTelefone.setLocation(10, 130);
		dadosP.add(lblTelefone);
		
		telefoneTxt = new JTextField(20);
		telefoneTxt.setSize(200, 20);
		telefoneTxt.setLocation(140, 130);
		dadosP.add(telefoneTxt);
		
		autenticarP = new JPanel();
		autenticarP.setLayout(null);
		autenticarP.setSize(370, 120);
		autenticarP.setLocation(15, 230);
		autenticarP.setBackground(Color.white);
		autenticarP.setBorder(javax.swing.BorderFactory.createTitledBorder("Autenticação:"));
		
		
		lblLogin = new JLabel("Login:");
		lblLogin.setSize(60, 15);
		lblLogin.setFont(new Font("Century Gothic", 0, 14));
		lblLogin.setLocation(10, 40);
		autenticarP.add(lblLogin);
		
		loginTxt = new JTextField(20);
		loginTxt.setSize(200, 20);
		loginTxt.setLocation(140, 40);
		autenticarP.add(loginTxt);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setSize(70, 15);
		lblSenha.setFont(new Font("Century Gothic", 0, 14));
		lblSenha.setLocation(10, 65);
		autenticarP.add(lblSenha);
		
		senhaTxt = new JPasswordField(20);
		senhaTxt.setSize(200, 20);
		senhaTxt.setLocation(140, 65);
		autenticarP.add(senhaTxt);
		
		lblConfirmarSenha = new JLabel("Confirme a senha:");
		lblConfirmarSenha.setSize(130, 25);
		lblConfirmarSenha.setFont(new Font("Century Gothic", 0, 14));
		lblConfirmarSenha.setLocation(10, 87);
		autenticarP.add(lblConfirmarSenha);
		
		confirmarSenhaTxt = new JPasswordField(20);
		confirmarSenhaTxt.setSize(200, 20);
		confirmarSenhaTxt.setLocation(140, 90);
		autenticarP.add(confirmarSenhaTxt);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setSize(110, 35);
		btnCadastrar.setFont(new Font("Century Gothic", 0, 14));
		btnCadastrar.setLocation(20, 360);
		btnCadastrar.setBackground(new Color(102, 102, 102));
		fundoP.add(btnCadastrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Century Gothic", 0, 14));
		btnLimpar.setSize(100, 35);
		btnLimpar.setLocation(155, 360);
		btnLimpar.setBackground(new Color(102,102,102));
		fundoP.add(btnLimpar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setSize(100, 35);
		btnCancelar.setFont(new Font("Century Gothic", 0, 14));
		btnCancelar.setLocation(280, 360);
		btnCancelar.setBackground(new Color(102,102,102));
		fundoP.add(btnCancelar);
		
		
		tituloP = new JPanel();
		tituloP.setLayout(null);
		tituloP.setSize(400, 70);
		tituloP.setBackground(new Color(102, 102, 102));
		tituloP.setLocation(0, 0);
		
		lblTitulo = new JLabel("Cadastro");
		lblTitulo.setLocation(120, 15);
		lblTitulo.setSize(200, 30);
		lblTitulo.setFont(new Font("Century Gothic",Font.BOLD,36));
		tituloP.add(lblTitulo);
		
		fundoP.add(tituloP);
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


	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}


	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
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


	
}
