package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaIntegracao extends JFrame {
	private JButton btnLoginAdm;
	private JButton btnLoginPassageiro;
	private JButton btnLoginMotorista;
	private JPanel fundo;
	private JPanel titulo;
	private JLabel lblTitulo;
	
	public TelaIntegracao() {
		super();
		setSize(200,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		fundo = new JPanel();
		fundo.setLayout(null);
		fundo.setSize(200, 220);
		fundo.setBackground(Color.WHITE);
		add(fundo);
		
		titulo = new JPanel();
		titulo.setLayout(null);
		titulo.setSize(200, 30);
		titulo.setBackground(new Color(239,3,50));
		titulo.setLocation(0, 0);
		fundo.add(titulo);
		
		lblTitulo = new JLabel("Telas");
		lblTitulo.setSize(100, 30);
		lblTitulo.setLocation(75, 0);
		lblTitulo.setFont(new Font("Century Gothic",0,20));
		titulo.add(lblTitulo);
		
		btnLoginAdm = new JButton("Adm");
		btnLoginAdm.setFont(new Font("Century Gothic",0,20));
		btnLoginAdm.setBackground(new Color(102,102,102));
		btnLoginAdm.setLocation(0, 40);
		btnLoginAdm.setSize(200, 40);
		fundo.add(btnLoginAdm);
		
		btnLoginMotorista = new JButton("Motorista");
		btnLoginMotorista.setLocation(0, 82);
		btnLoginMotorista.setFont(new Font("Century Gothic",0,20));
		btnLoginMotorista.setBackground(new Color(102,102,102));
		btnLoginMotorista.setSize(200, 40);
		fundo.add(btnLoginMotorista);
		
		btnLoginPassageiro = new JButton("Passageiro");
		btnLoginPassageiro.setLocation(0, 124);
		btnLoginPassageiro.setFont(new Font("Century Gothic",0,20));
		btnLoginPassageiro.setBackground(new Color(102,102,102));
		btnLoginPassageiro.setSize(200, 40);
		fundo.add(btnLoginPassageiro);
	}

	public JButton getBtnLoginAdm() {
		return btnLoginAdm;
	}

	public JButton getBtnLoginPassageiro() {
		return btnLoginPassageiro;
	}

	public JButton getBtnLoginMotorista() {
		return btnLoginMotorista;
	}
	
	
}
