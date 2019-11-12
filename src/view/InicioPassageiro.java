package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class InicioPassageiro extends JPanel {
	private JTable jTableViagens;
	private JPanel fundoP;
	private JScrollPane scroll;
	private JLabel lblNome;
	private JLabel lblNomeM;
	private JLabel lblSobrenome;
	private JLabel lblSobrenomeM;
	private JPopupMenu caixa;
	private JMenuItem verInformacoes;
	public InicioPassageiro() {
		
		
		setSize(540,560);
		setLayout(null);
		setLocation(10,120);
		setBackground(Color.WHITE);
		setBorder(javax.swing.border.LineBorder.createGrayLineBorder());
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Century Gothic", 0, 14));
		lblNome.setSize(100, 20);
		lblNome.setLocation(15, 20);
		add(lblNome);
		
		lblNomeM = new JLabel("nome");
		lblNomeM.setSize(100, 20);
		lblNomeM.setFont(new Font("Century Gothic", 0, 14));
		lblNomeM.setLocation(65, 20);
		add(lblNomeM);
		
		lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setSize(100, 20);
		lblSobrenome.setFont(new Font("Century Gothic", 0, 14));
		lblSobrenome.setLocation(300, 20);
		add(lblSobrenome);
		
		lblSobrenomeM = new JLabel("sobrenome");
		lblSobrenomeM.setSize(100, 20);
		lblSobrenomeM.setFont(new Font("Century Gothic", 0, 14));
		lblSobrenomeM.setLocation(385, 20);
		add(lblSobrenomeM);
		
		String [] colunas = {"Destino","Horario"};
		Object[][] modelo = new Object[100][7];
		
		jTableViagens = new JTable(modelo,colunas);
		jTableViagens.setSize(540, 560);
		scroll = new JScrollPane(jTableViagens);
		scroll.setSize(525, 449);
		scroll.setLocation(9, 100);
		add(scroll);
		
		caixa = new JPopupMenu();
		verInformacoes = new JMenuItem("Ver informações");
		caixa.add(verInformacoes);
		
	}
	public JLabel getLblNome() {
		return lblNome;
	}
	public void setLblNome(JLabel lblNome) {
		this.lblNome = lblNome;
	}
	public JLabel getLblNomeM() {
		return lblNomeM;
	}
	public void setLblNomeM(JLabel lblNomeM) {
		this.lblNomeM = lblNomeM;
	}
	public JLabel getLblSobrenome() {
		return lblSobrenome;
	}
	public void setLblSobrenome(JLabel lblSobrenome) {
		this.lblSobrenome = lblSobrenome;
	}
	public JLabel getLblSobrenomeM() {
		return lblSobrenomeM;
	}
	public void setLblSobrenomeM(JLabel lblSobrenomeM) {
		this.lblSobrenomeM = lblSobrenomeM;
	}
	public JTable getjTableViagens() {
		return jTableViagens;
	}
	public JPopupMenu getCaixa() {
		return caixa;
	}
	public JMenuItem getVerInformacoes() {
		return verInformacoes;
	}
	
	
}
