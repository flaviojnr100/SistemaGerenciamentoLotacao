package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

public class TelaLoginPassageiro extends JFrame {
	 private javax.swing.JButton btnCadastrar;
	    private javax.swing.JButton btnEntrar;
	    private javax.swing.JButton btnEsqueci;
	    private javax.swing.JButton btnSair;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JLabel lblLogin;
	    private javax.swing.JLabel lblTitulo;
	    private javax.swing.JLabel lblSenha;
	    private javax.swing.JTextField loginTxt;
	    private javax.swing.JPasswordField senhaTxt;
	public TelaLoginPassageiro() {
		super();
		jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel("Login:");
        lblSenha = new javax.swing.JLabel("Senha:");
        senhaTxt = new javax.swing.JPasswordField();
        loginTxt = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton("Entrar");
        btnSair = new javax.swing.JButton("Sair");
        btnEsqueci = new javax.swing.JButton("Esqueci minha senha");
        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel("Passageiro");
        btnCadastrar = new javax.swing.JButton("Efetuar cadastro");
        
        setSize(362, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setUndecorated(true);
        setLocationRelativeTo(null);
        
        jPanel1.setBackground(Color.WHITE);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLocation(0, 0);
        jPanel1.setSize(362, 350);
        jPanel1.setLayout(null);
        add(jPanel1);
        
        
        jPanel2.setSize(361, 110);
        jPanel2.setLocation(0, 70);
        jPanel2.setLayout(null);
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setBackground(Color.WHITE);
        jPanel1.add(jPanel2);
        
        lblLogin.setLocation(20, 25);
        lblLogin.setSize(40, 19);
        lblLogin.setFont(new Font("Century Gothic", 0, 14));
        jPanel2.add(lblLogin);
        
        loginTxt.setLocation(86, 26);
        loginTxt.setSize(261, 20);
        jPanel2.add(loginTxt);
        
        lblSenha.setLocation(20, 69);
        lblSenha.setSize(60, 19);
        lblSenha.setFont(new Font("Century Gothic", 0, 14));
        jPanel2.add(lblSenha);
        
        senhaTxt.setLocation(86, 70);
        senhaTxt.setSize(261, 20);
        jPanel2.add(senhaTxt);
        
        btnEntrar.setSize(96, 39);
        btnEntrar.setLocation(20, 200);
        btnEntrar.setFont(new Font("Century Gothic", 0, 14));
        btnEntrar.setBackground(new Color(102,102,102));
        jPanel1.add(btnEntrar);
        
        btnSair.setSize(96, 39);
        btnSair.setLocation(240, 200);
        btnSair.setFont(new Font("Century Gothic", 0, 14));
        btnSair.setBackground(new Color(102,102,102));
        jPanel1.add(btnSair);
        
        btnEsqueci.setSize(340, 40);
        btnEsqueci.setBorderPainted(false);
        btnEsqueci.setBackground(Color.WHITE);
        btnEsqueci.setFont(new Font("Century Gothic", 0, 14));
        btnEsqueci.setLocation(10, 250);
        jPanel1.add(btnEsqueci);
        
        btnCadastrar.setSize(340, 40);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setBackground(Color.WHITE);
        btnCadastrar.setFont(new Font("Century Gothic", 0, 14));
        btnCadastrar.setLocation(10, 290);
        jPanel1.add(btnCadastrar);
        
        
        jPanel3.setSize(361, 70);
        jPanel3.setLocation(0, 0);
        jPanel3.setBackground(new Color(102,102,102));
        jPanel1.add(jPanel3);
        
        lblTitulo.setLocation(90, 10);
        lblTitulo.setSize(191, 45);
        lblTitulo.setFont(new Font("Century Gothic",Font.BOLD,36));
        jPanel3.add(lblTitulo);
        
        
        
		
	}
	public javax.swing.JButton getBtnCadastrar() {
		return btnCadastrar;
	}
	public javax.swing.JButton getBtnEntrar() {
		return btnEntrar;
	}
	public javax.swing.JButton getBtnEsqueci() {
		return btnEsqueci;
	}
	public javax.swing.JButton getBtnSair() {
		return btnSair;
	}
	public javax.swing.JTextField getLoginTxt() {
		return loginTxt;
	}
	public javax.swing.JPasswordField getSenhaTxt() {
		return senhaTxt;
	}
	
}
