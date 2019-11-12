package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ConsultarPassageiro extends JFrame {
	private JPanel fundoP;
	private JPanel buscaP;
	private JPanel passageiroP;
	
	private JTextField buscarTxt;
	private JButton btnBuscar;
	
	private JScrollPane scroll;
	private JTable jTablePassageiro;
	
	private ButtonGroup grupo;
	private JRadioButton jRadioNome;
	private JRadioButton jRadioCpf;
	private JRadioButton jRadioLogin;
	
	
	public ConsultarPassageiro() {
		super("Consultar");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(500,150);
		setSize(467, 509);
		setResizable(false);
		setLayout(null);
				
		fundoP = new JPanel();
		fundoP.setLayout(null);
		fundoP.setLocation(0, 0);
		fundoP.setSize(460, 480);
		fundoP.setBackground(Color.WHITE);
		
		buscaP = new JPanel();
		buscaP.setLayout(null);
		buscaP.setLocation(3, 10);
		buscaP.setSize(454, 90);
		buscaP.setBackground(Color.WHITE);
		buscaP.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca: "));
		
		passageiroP = new JPanel();
		passageiroP.setLayout(null);
		passageiroP.setLocation(3, 105);
		passageiroP.setSize(454, 372);
		passageiroP.setBackground(Color.WHITE);
		passageiroP.setBorder(javax.swing.BorderFactory.createTitledBorder("Passageiros: "));
		
		
		Object[][] modelo = new Object[100][7];
		Object[] colunas = {"Nome","Sobrenome","Cpf","Email","Telefone","Login"};
		jTablePassageiro = new JTable(modelo, colunas);
		scroll = new JScrollPane(jTablePassageiro);
		scroll.setSize(435, 345);
		scroll.setLocation(10, 20);
		passageiroP.add(scroll);
		
		buscarTxt = new JTextField(20);
		buscarTxt.setSize(310, 20);
		buscarTxt.setLocation(10, 50);
		buscaP.add(buscarTxt);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setSize(100, 30);
		btnBuscar.setLocation(340, 45);
		buscaP.add(btnBuscar);
		
		jRadioNome = new JRadioButton("Nome");
		jRadioNome.setSize(70, 30);
		jRadioNome.setLocation(30, 20);
		jRadioNome.setBackground(Color.white);
		jRadioNome.setSelected(true);
		buscaP.add(jRadioNome);
		
		jRadioCpf = new JRadioButton("Cpf");
		jRadioCpf.setSize(70, 30);
		jRadioCpf.setLocation(140, 20);
		jRadioCpf.setBackground(Color.white);
		buscaP.add(jRadioCpf);
		
		jRadioLogin = new JRadioButton("Login");
		jRadioLogin.setSize(70, 30);
		jRadioLogin.setLocation(220, 20);
		jRadioLogin.setBackground(Color.white);
		buscaP.add(jRadioLogin);
		
		grupo = new ButtonGroup();
		grupo.add(jRadioNome);
		grupo.add(jRadioCpf);
		grupo.add(jRadioLogin);
		fundoP.add(buscaP);
		fundoP.add(passageiroP);
		add(fundoP);
		
	}
	
	public JTextField getBuscarTxt() {
		return buscarTxt;
	}

	public void setBuscarTxt(JTextField buscarTxt) {
		this.buscarTxt = buscarTxt;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JTable getjTablePassageiro() {
		return jTablePassageiro;
	}

	public void setjTablePassageiro(JTable jTablePassageiro) {
		this.jTablePassageiro = jTablePassageiro;
	}

	public JRadioButton getjRadioNome() {
		return jRadioNome;
	}

	public void setjRadioNome(JRadioButton jRadioNome) {
		this.jRadioNome = jRadioNome;
	}

	public JRadioButton getjRadioCpf() {
		return jRadioCpf;
	}

	public void setjRadioCpf(JRadioButton jRadioCpf) {
		this.jRadioCpf = jRadioCpf;
	}

	public JRadioButton getjRadioLogin() {
		return jRadioLogin;
	}

	public void setjRadioLogin(JRadioButton jRadioLogin) {
		this.jRadioLogin = jRadioLogin;
	}

	
}
