package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

public class InformacoesViagem extends JFrame {
	 private javax.swing.JButton btnOk;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel12;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JLabel lblData;
	    private javax.swing.JLabel lblDataM;
	    private javax.swing.JLabel lblDestino;
	    private javax.swing.JLabel lblDestinoM;
	    private javax.swing.JLabel lblHorario;
	    private javax.swing.JLabel lblHorarioM;
	    private javax.swing.JLabel lblLocal;
	    private javax.swing.JLabel lblLocalM;
	    private javax.swing.JLabel lblMotorista;
	    private javax.swing.JLabel lblMotoristaM;
	    private javax.swing.JLabel lblValor;
	    private javax.swing.JLabel lblValorM;
	    public InformacoesViagem() {
	    	super();
	    	jLabel5 = new javax.swing.JLabel();
	        jLabel12 = new javax.swing.JLabel();
	        jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel("Informações");
	        lblMotorista = new javax.swing.JLabel("Motorista:");
	        lblMotoristaM = new javax.swing.JLabel("motorista");
	        lblData = new javax.swing.JLabel("Data:");
	        lblHorario = new javax.swing.JLabel("Horario de saída:");
	        lblLocal = new javax.swing.JLabel("Local de saída:");
	        lblDestino = new javax.swing.JLabel("Destino:");
	        lblValor = new javax.swing.JLabel("Valor:");
	        lblDataM = new javax.swing.JLabel("data");
	        lblHorarioM = new javax.swing.JLabel("horario");
	        lblLocalM = new javax.swing.JLabel("local");
	        lblDestinoM = new javax.swing.JLabel("destino");
	        lblValorM = new javax.swing.JLabel("valor");
	        btnOk = new javax.swing.JButton("Ok");
	        setLocation(400,200);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setSize(504, 250);
	        setResizable(false);
	        setLayout(null);
	        setUndecorated(true);
	        
	        jPanel1.setSize(504, 250);
	        jPanel1.setBackground(Color.WHITE);
	        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	        jPanel1.setLayout(null);
	        jPanel1.setLocation(0, 0);
	        add(jPanel1);
	        
	        jPanel2.setSize(510, 90);
	        jPanel2.setLocation(0, 0);
	        jPanel2.setBackground(new Color(102, 102, 102));
	        jPanel1.add(jPanel2);
	        
	        jLabel1.setLocation(140, 25);
	        jLabel1.setSize(220, 45);
	        jLabel1.setFont(new Font("Century Gothic",Font.BOLD,40));
	        jPanel2.add(jLabel1);
	        
	        lblMotorista.setLocation(30, 120);
	        lblMotorista.setFont(new Font("Century Gothic", 0, 14));
	        lblMotorista.setSize(100, 14);
	        jPanel1.add(lblMotorista);
	        
	        lblMotoristaM.setLocation(120, 120);
	        lblMotoristaM.setSize(100, 14);
	        jPanel1.add(lblMotoristaM);
	        
	        lblData.setLocation(30, 150);
	        lblData.setSize(100, 14);
	        lblData.setFont(new Font("Century Gothic", 0, 14));
	        jPanel1.add(lblData);
	        
	        lblDataM.setLocation(120, 150);
	        lblDataM.setSize(100, 14);
	        jPanel1.add(lblDataM);
	        
	        lblDestino.setLocation(30, 180);
	        lblDestino.setSize(100, 14);
	        lblDestino.setFont(new Font("Century Gothic", 0, 14));
	        jPanel1.add(lblDestino);
	        
	        lblDestinoM.setLocation(120, 180);
	        lblDestinoM.setSize(100, 14);
	        jPanel1.add(lblDestinoM);
	        
	        lblHorario.setLocation(270, 120);
	        lblHorario.setSize(150, 14);
	        lblHorario.setFont(new Font("Century Gothic", 0, 14));
	        jPanel1.add(lblHorario);
	        
	        lblHorarioM.setLocation(410, 120);
	        lblHorarioM.setSize(100, 14);
	        jPanel1.add(lblHorarioM);
	        
	        lblLocal.setLocation(270, 150);
	        lblLocal.setSize(150, 14);
	        lblLocal.setFont(new Font("Century Gothic", 0, 14));
	        jPanel1.add(lblLocal);
	        
	        lblLocalM.setLocation(410, 150);
	        lblLocalM.setSize(100, 14);
	        jPanel1.add(lblLocalM);
	        
	        lblValor.setLocation(270, 180);
	        lblValor.setSize(150, 14);
	        lblValor.setFont(new Font("Century Gothic", 0, 14));
	        jPanel1.add(lblValor);
	        
	        lblValorM.setLocation(410, 180);
	        lblValorM.setSize(100, 14);
	        jPanel1.add(lblValorM);
	        
	        btnOk.setLocation(200, 210);
	        btnOk.setSize(70, 30);
	        btnOk.setFont(new Font("Century Gothic", 0, 14));
	        btnOk.setBackground(new Color(102,102,102));
	        jPanel1.add(btnOk);
		}
		public javax.swing.JButton getBtnOk() {
			return btnOk;
		}
		public javax.swing.JLabel getLblDataM() {
			return lblDataM;
		}
		public javax.swing.JLabel getLblDestinoM() {
			return lblDestinoM;
		}
		public javax.swing.JLabel getLblHorarioM() {
			return lblHorarioM;
		}
		public javax.swing.JLabel getLblLocalM() {
			return lblLocalM;
		}
		public javax.swing.JLabel getLblMotoristaM() {
			return lblMotoristaM;
		}
		public javax.swing.JLabel getLblValorM() {
			return lblValorM;
		}
	    
}
