package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DashBoardPassageiro extends JFrame {
	private javax.swing.JButton btnEfetuarViagem;
    private javax.swing.JButton btnFazerLogoff;
    private javax.swing.JButton btnModificarViagem;
    private javax.swing.JButton btnProcurarViagem;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblUsuario;
    
	public DashBoardPassageiro() {
		jPanel1 = new javax.swing.JPanel();
        btnModificarViagem = new javax.swing.JButton("Modificar viagem");
        btnEfetuarViagem = new javax.swing.JButton("Efetuar viagem");
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel(new ImageIcon(getClass().getClassLoader().getResource("usuario_reduzido.png")));
        btnProcurarViagem = new javax.swing.JButton("Procurar viagem");
        btnFazerLogoff = new javax.swing.JButton("Fazer logoff");
        lblUsuario = new javax.swing.JLabel("Usuario");
        jLabel4 = new javax.swing.JLabel("Versão: 1.0.0");
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel("Sistema de lotação");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(841,690);
        setLayout(null);
        setLocationRelativeTo(null);
        
        
        jPanel1.setLayout(null);
        jPanel1.setSize(280,690);
        jPanel1.setLocation(0, 0);
        jPanel1.setBackground(Color.BLACK);
        add(jPanel1);
        
        jPanel5.setLayout(null);
        jPanel5.setLocation(17, 7);
        jPanel5.setBackground(Color.white);
        jPanel5.setSize(245, 200);
        jPanel1.add(jPanel5);
        
        jLabel2.setLocation(25, 0);
        jLabel2.setSize(200, 200);
        jPanel5.add(jLabel2);
        
        lblUsuario.setLocation(110, 210);
        lblUsuario.setSize(49, 19);
        lblUsuario.setFont(new Font("Century Gothic", 0, 14));
        lblUsuario.setForeground(Color.WHITE);
        jPanel1.add(lblUsuario);
        
        btnEfetuarViagem.setLocation(0, 240);
        btnEfetuarViagem.setSize(280, 100);
        btnEfetuarViagem.setBackground(new Color(51, 51, 51));
        btnEfetuarViagem.setFont(new Font("Century Gothic",Font.BOLD,14));
        btnEfetuarViagem.setBorderPainted(false);
        btnEfetuarViagem.setForeground(Color.WHITE);
        jPanel1.add(btnEfetuarViagem);
        
        btnProcurarViagem.setLocation(0, 345);
        btnProcurarViagem.setSize(280, 100);
        btnProcurarViagem.setBackground(new Color(51, 51, 51));
        btnProcurarViagem.setFont(new Font("Century Gothic",Font.BOLD,14));
        btnProcurarViagem.setBorderPainted(false);
        btnProcurarViagem.setForeground(Color.WHITE);
        jPanel1.add(btnProcurarViagem);
        
        btnModificarViagem.setLocation(0, 450);
        btnModificarViagem.setSize(280, 100);
        btnModificarViagem.setBackground(new Color(51, 51, 51));
        btnModificarViagem.setFont(new Font("Century Gothic",Font.BOLD,14));
        btnModificarViagem.setBorderPainted(false);
        btnModificarViagem.setForeground(Color.WHITE);
        jPanel1.add(btnModificarViagem);
        
        btnFazerLogoff.setLocation(0, 555);
        btnFazerLogoff.setSize(280, 100);
        btnFazerLogoff.setBackground(new Color(51, 51, 51));
        btnFazerLogoff.setFont(new Font("Century Gothic",Font.BOLD,14));
        btnFazerLogoff.setBorderPainted(false);
        btnFazerLogoff.setForeground(Color.WHITE);
        jPanel1.add(btnFazerLogoff);
        
        jLabel4.setLocation(95, 665);
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setSize(86, 19);
        jLabel4.setFont(new Font("Century Gothic",0, 14));
        jPanel1.add(jLabel4);
        
        jPanel4.setSize(560, 690);
        jPanel4.setLocation(280, 0);
        jPanel4.setLayout(null);
        jPanel4.setBackground(Color.WHITE);
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(2));
        add(jPanel4);
        
        
        
        jPanel2.setLayout(null);
        jPanel2.setLocation(0, 0);
        jPanel2.setSize(480, 70);
        jPanel2.setBackground(new Color(102, 102, 102));
        jPanel4.add(jPanel2);
        
        jLabel1.setLocation(70, 10);
        jLabel1.setSize(342, 45);
        jLabel1.setFont(new Font("Century Gothic", 0, 36));
        jLabel1.setForeground(Color.WHITE);
        jPanel2.add(jLabel1);
        
        /*jPanel3.setLocation(480, 0);
        jPanel3.setSize(80, 110);
        jPanel3.setBackground(new Color(255,51,51));
        jPanel4.add(jPanel3);*/
        
        btnSair.setLocation(480, 0);
        btnSair.setSize(80, 110);
        btnSair.setBackground(new Color(255,51,51));
        btnSair.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ligarDesligar_novo.png")));
        btnSair.setBorderPainted(false);
        jPanel4.add(btnSair);
        
        
        
        
	}
	public static void main(String[] args) {
		new DashBoardPassageiro().setVisible(true);
		
	}

}
