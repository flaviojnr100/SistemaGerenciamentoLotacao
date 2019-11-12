package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;

public class ReservandoVaga extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeDoPassageiro;
	private JTextField tfLocalSaida;
	private JTextField tfDestino;
	private JFormattedTextField ftfCpfPassageiro;
	private JFormattedTextField ftfData;
	private JButton btnLimpar;
	private JButton btnCadastrar;
	private JButton btnCancelar;
	private JLabel lblHorrio;
	private JFormattedTextField formattedTextField;
	private JLabel lblViagens;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservandoVaga frame = new ReservandoVaga();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReservandoVaga() {
		setTitle("Reservar Vaga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 428);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dados:", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 422, 326);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNomeDoPassageiro = new JLabel("Nome do Passageiro:");
		lblNomeDoPassageiro.setBounds(10, 32, 152, 22);
		panel.add(lblNomeDoPassageiro);
		
		tfNomeDoPassageiro = new JTextField();
		tfNomeDoPassageiro.setBounds(172, 33, 134, 20);
		panel.add(tfNomeDoPassageiro);
		tfNomeDoPassageiro.setColumns(10);
		
		JLabel lblCpfDoPassageiro = new JLabel("CPF do Passageiro:");
		lblCpfDoPassageiro.setBounds(10, 77, 152, 14);
		panel.add(lblCpfDoPassageiro);
		
		JLabel lblLocalSaida = new JLabel("Local de Sa\u00EDda:");
		lblLocalSaida.setBounds(10, 115, 152, 14);
		panel.add(lblLocalSaida);
		
		tfLocalSaida = new JTextField();
		tfLocalSaida.setBounds(172, 111, 134, 22);
		panel.add(tfLocalSaida);
		tfLocalSaida.setColumns(10);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setBounds(10, 158, 152, 14);
		panel.add(lblDestino);
		
		tfDestino = new JTextField();
		tfDestino.setBounds(172, 154, 134, 22);
		panel.add(tfDestino);
		tfDestino.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 203, 152, 14);
		panel.add(lblData);
		
		ftfCpfPassageiro = new JFormattedTextField();
		ftfCpfPassageiro.setBounds(172, 73, 134, 22);
		panel.add(ftfCpfPassageiro);
		
		ftfData = new JFormattedTextField();
		ftfData.setBounds(172, 199, 134, 22);
		panel.add(ftfData);
		
		lblHorrio = new JLabel("Hor\u00E1rio:");
		lblHorrio.setBounds(10, 250, 46, 14);
		panel.add(lblHorrio);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(172, 247, 134, 20);
		panel.add(formattedTextField);
		
		lblViagens = new JLabel("Viagens:");
		lblViagens.setBounds(10, 290, 95, 14);
		panel.add(lblViagens);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(172, 286, 134, 22);
		panel.add(comboBox);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.BLUE);
		btnLimpar.setBounds(163, 348, 115, 31);
		contentPane.add(btnLimpar);
		
		btnCadastrar = new JButton("Reservar");
		btnCadastrar.setBounds(10, 348, 115, 31);
		contentPane.add(btnCadastrar);
		btnCadastrar.setForeground(Color.BLUE);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.BLUE);
		btnCancelar.setBounds(308, 348, 115, 31);
		contentPane.add(btnCancelar);
		
		setVisible(true);
	}
	
}
