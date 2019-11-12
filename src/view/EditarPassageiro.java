package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EditarPassageiro extends JPanel {
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
		
		setLocation(10,120);
		
		
		setSize(540,560);
		setLayout(null);
		
		fundoP = new JPanel();
		fundoP.setLayout(null);
		fundoP.setSize(540, 560);
		fundoP.setLocation(0, 0);
		fundoP.setBorder(javax.swing.border.LineBorder.createGrayLineBorder());
		fundoP.setBackground(Color.white);
		
		dadosP = new JPanel();
		dadosP.setLayout(null);
		dadosP.setSize(480, 220);
		dadosP.setLocation(30, 20);
		dadosP.setBackground(Color.white);
		
		dadosP.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados:"));
		
		lblNome = new JLabel("Nome:");
		lblNome.setSize(50, 14);
		lblNome.setFont(new Font("Century Gothic",Font.BOLD,14));
		lblNome.setLocation(20, 30);
		dadosP.add(lblNome);
		
		nomeTxt = new JTextField(20);
		nomeTxt.setSize(200, 20);
		nomeTxt.setLocation(145, 30);
		dadosP.add(nomeTxt);
		
		lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setSize(98, 14);
		lblSobrenome.setFont(new Font("Century Gothic",Font.BOLD,14));
		lblSobrenome.setLocation(20, 60);
		dadosP.add(lblSobrenome);
		
		sobrenomeTxt = new JTextField(20);
		sobrenomeTxt.setSize(200, 20);
		sobrenomeTxt.setLocation(145, 60);
		dadosP.add(sobrenomeTxt);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setSize(50, 14);
		lblCpf.setFont(new Font("Century Gothic",Font.BOLD,14));
		lblCpf.setLocation(20, 90);
		dadosP.add(lblCpf);
		
		cpfTxt = new JTextField(20);
		cpfTxt.setSize(200, 20);
		cpfTxt.setLocation(145, 90);
		dadosP.add(cpfTxt);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setSize(50, 14);
		lblEmail.setFont(new Font("Century Gothic",Font.BOLD,14));
		lblEmail.setLocation(20, 120);
		dadosP.add(lblEmail);
		
		emailTxt = new JTextField(20);
		emailTxt.setSize(200, 20);
		emailTxt.setLocation(145, 120);
		dadosP.add(emailTxt);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setSize(70, 14);
		lblTelefone.setFont(new Font("Century Gothic",Font.BOLD,14));
		lblTelefone.setLocation(20, 150);
		dadosP.add(lblTelefone);
		
		telefoneTxt = new JTextField(20);
		telefoneTxt.setSize(200, 20);
		telefoneTxt.setLocation(145, 150);
		dadosP.add(telefoneTxt);
		
		autenticarP = new JPanel();
		autenticarP.setLayout(null);
		autenticarP.setSize(480, 160);
		autenticarP.setLocation(30, 280);
		autenticarP.setBackground(Color.white);
		autenticarP.setBorder(javax.swing.BorderFactory.createTitledBorder("Autenticação:"));
		
		
		lblLogin = new JLabel("Login:");
		lblLogin.setSize(50, 14);
		lblLogin.setFont(new Font("Century Gothic",Font.BOLD,14));
		lblLogin.setLocation(20, 40);
		autenticarP.add(lblLogin);
		
		loginTxt = new JTextField(20);
		loginTxt.setSize(200, 20);
		loginTxt.setLocation(145, 40);
		autenticarP.add(loginTxt);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setSize(50, 14);
		lblSenha.setFont(new Font("Century Gothic",Font.BOLD,14));
		lblSenha.setLocation(20, 70);
		autenticarP.add(lblSenha);
		
		senhaTxt = new JPasswordField(20);
		senhaTxt.setSize(200, 20);
		senhaTxt.setLocation(145, 70);
		autenticarP.add(senhaTxt);
		
		lblConfirmarSenha = new JLabel("Confirme a senha:");
		lblConfirmarSenha.setSize(130, 14);
		lblConfirmarSenha.setFont(new Font("Century Gothic",Font.BOLD,14));
		lblConfirmarSenha.setLocation(20, 100);
		autenticarP.add(lblConfirmarSenha);
		
		confirmarSenhaTxt = new JPasswordField(20);
		confirmarSenhaTxt.setSize(200, 20);
		confirmarSenhaTxt.setLocation(145, 100);
		autenticarP.add(confirmarSenhaTxt);
		
		btnEditar = new JButton("Salvar");
		btnEditar.setSize(100, 40);
		btnEditar.setLocation(60, 480);
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setFont(new Font("Century Gothic",Font.BOLD,14));
		btnEditar.setBackground(new Color(51, 51, 51));
		fundoP.add(btnEditar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setSize(100, 40);
		btnLimpar.setLocation(220, 480);
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(new Font("Century Gothic",Font.BOLD,14));
		btnLimpar.setBackground(new Color(51, 51, 51));
		fundoP.add(btnLimpar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setSize(100, 40);
		btnCancelar.setLocation(370, 480);
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Century Gothic",Font.BOLD,14));
		btnCancelar.setBackground(new Color(51, 51, 51));
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
