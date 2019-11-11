package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class TelaConsultaViagemPassageiro extends JPanel{

	private JPanel contentPane;
	private JPanel panel;
	private JPanel fundoP;
	
	private JTable table;
	private ButtonGroup grupo;

	private JRadioButton rdbtnData;
	private JRadioButton rdbtnMotorista;
	private JRadioButton rdbtnLocalDeSada;
	
	private JFormattedTextField ftfConsulta;
	
	private JButton btnBuscar;
	private JButton btnVoltar;
	
	private JPopupMenu caixa;
	private JMenuItem jMenuReservarVaga;
	private JMenuItem jMenuInformacoes;
	private JMenuItem jMenuSair;
	
	public TelaConsultaViagemPassageiro() {
		
		fundoP = new JPanel();
		fundoP.setLayout(null);
		fundoP.setBackground(Color.WHITE);
		fundoP.setSize(540, 560);
		fundoP.setBorder(javax.swing.border.LineBorder.createGrayLineBorder());
		
		setLocation(10, 120);
		setSize(540,560);
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Consulta", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(10, 11, 520, 82);
		//contentPane.add(panel);
		fundoP.add(panel);
		panel.setLayout(null);
		
		rdbtnData = new JRadioButton("Data");
		rdbtnData.setFont(new Font("Century Gothic",Font.BOLD,14));
		rdbtnData.setBackground(Color.WHITE);
		rdbtnData.setBounds(10, 21, 109, 23);
		panel.add(rdbtnData);
		rdbtnData.setSelected(true);
		
		rdbtnMotorista = new JRadioButton("Motorista");
		rdbtnMotorista.setFont(new Font("Century Gothic",Font.BOLD,14));
		rdbtnMotorista.setBackground(Color.WHITE);
		rdbtnMotorista.setBounds(120, 21, 109, 23);
		panel.add(rdbtnMotorista);
		
		rdbtnLocalDeSada = new JRadioButton("Local de Sa\u00EDda");
		rdbtnLocalDeSada.setFont(new Font("Century Gothic",Font.BOLD,14));
		rdbtnLocalDeSada.setBackground(Color.WHITE);
		rdbtnLocalDeSada.setBounds(260, 21, 140, 23);
		panel.add(rdbtnLocalDeSada);
		
		grupo = new ButtonGroup();
		grupo.add(rdbtnData);
		grupo.add(rdbtnLocalDeSada);
		grupo.add(rdbtnMotorista);
		
		ftfConsulta = new JFormattedTextField();
		ftfConsulta.setBounds(10, 51, 392, 20);
		panel.add(ftfConsulta);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setBounds(420, 40, 89, 35);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBackground(new Color(51, 51, 51));
		btnBuscar.setFont(new Font("Century Gothic",Font.BOLD,14));
		panel.add(btnBuscar);
		
		Object[][] modelo = new Object[100][7];
		Object[] colunas = {"Motorista","Data","Horário de Saída","Local de Saída","Destino","Vagas Disponíveis","Valor"};
		table = new JTable(modelo, colunas);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setSize(520, 400);
		scroll.setLocation(10, 98);
		fundoP.add(scroll);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBounds(10, 500, 89, 35);
		btnVoltar.setBackground(new Color(51, 51, 51));
		btnVoltar.setFont(new Font("Century Gothic",Font.BOLD,14));
		
		fundoP.add(btnVoltar);
		
		caixa = new JPopupMenu();
		jMenuReservarVaga = new JMenuItem("Reservar vaga");
		jMenuInformacoes = new JMenuItem("Ver informações");
		jMenuSair = new JMenuItem("Sair");
		caixa.add(jMenuInformacoes);
		caixa.add(jMenuReservarVaga);
		caixa.add(jMenuSair);
		
		
		
		add(fundoP);
		
		//setVisible(true);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JTable getTable() {
		return table;
	}

	public ButtonGroup getGrupo() {
		return grupo;
	}

	public JRadioButton getRdbtnData() {
		return rdbtnData;
	}

	public JRadioButton getRdbtnMotorista() {
		return rdbtnMotorista;
	}

	public JRadioButton getRdbtnLocalDeSada() {
		return rdbtnLocalDeSada;
	}

	public JFormattedTextField getFtfConsulta() {
		return ftfConsulta;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public JPopupMenu getCaixa() {
		return caixa;
	}

	public JMenuItem getjMenuReservarVaga() {
		return jMenuReservarVaga;
	}

	public JMenuItem getjMenuInformacoes() {
		return jMenuInformacoes;
	}

	public JMenuItem getjMenuSair() {
		return jMenuSair;
	}
	
	
}
