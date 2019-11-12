package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class LoginAdm extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JLabel labelEntrar;
	private JPasswordField tfSenha;
	
	
	public LoginAdm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 394, 318);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 378, 127);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icon.png")));
		label.setBounds(147, 0, 106, 96);
		panel.add(label);
		
		JLabel lblreaDeAcesso = new JLabel("\u00C1rea de Acesso");
		lblreaDeAcesso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblreaDeAcesso.setForeground(Color.WHITE);
		lblreaDeAcesso.setBackground(Color.WHITE);
		lblreaDeAcesso.setBounds(147, 91, 106, 25);
		panel.add(lblreaDeAcesso);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(107, 138, 60, 20);
		contentPane.add(lblLogin);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(107, 157, 182, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(107, 177, 60, 20);
		contentPane.add(lblSenha);
		
		labelEntrar = new JLabel("");
		labelEntrar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icons8-enter-40.png")));
		labelEntrar.setBounds(249, 222, 40, 47);
		contentPane.add(labelEntrar);
		
		tfSenha = new JPasswordField();
		tfSenha.setBounds(107, 196, 182, 20);
		contentPane.add(tfSenha);
		
		setVisible(true);
	}

	public JTextField getTfLogin() {
		return tfLogin;
	}
	
	public JLabel getLabelEntrar() {
		return labelEntrar;
	}

	public JPasswordField getTfSenha() {
		return tfSenha;
	}
	public static void main(String[] args) {
		new LoginAdm();
	}
}
