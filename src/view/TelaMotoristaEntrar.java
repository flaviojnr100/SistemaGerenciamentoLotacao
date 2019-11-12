package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaMotoristaEntrar extends JFrame {
  
  private JLabel senhaLabel;
  private JLabel loginLabel;
  private JLabel tornarMembroLabel;
  
  private JTextField senhaField;
  private JTextField loginField;
  
  private JButton entrarButton;
  private JButton esqueciSenhaButton;
  
  
  public TelaMotoristaEntrar() {
   
    getContentPane().setBackground(Color.WHITE);
    setBounds(100, 100, 474, 351);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);
     
    loginLabel = new JLabel("Login");
    loginLabel.setFont(new Font("Gisha", Font.BOLD, 15));
    loginLabel.setBounds(10, 191, 64, 39);
    getContentPane().add(loginLabel);
    
    senhaLabel = new JLabel("Senha");
    senhaLabel.setFont(new Font("Gisha", Font.BOLD, 15));
    senhaLabel.setBounds(13, 241, 61, 24);
    getContentPane().add(senhaLabel);
    
    loginField = new JTextField();
    loginField.setToolTipText("");
    loginField.setBackground(Color.WHITE);
    loginField.setBounds(77, 201, 86, 20);
    getContentPane().add(loginField);
    loginField.setColumns(14);
    
    senhaField = new JTextField();
    senhaField.setBounds(77, 244, 86, 20);
    getContentPane().add(senhaField);
    senhaField.setColumns(14);
    
    JLabel tornaMembroLabel = new JLabel("Desejo me tornar um motorista");
//    tornaMembroLabel.addMouseListener(new MouseAdapter() {
//    	@Override
//    	public void mouseClicked(MouseEvent e) {
//    		JOptionPane.showMessageDialog(null, "clicou");
//    	}
//    });
    tornaMembroLabel.setFont(new Font("Gisha", Font.PLAIN, 12));
    tornaMembroLabel.setBounds(122, 282, 226, 31);
    getContentPane().add(tornaMembroLabel);
    
    JLabel lblNewLabel_1 = new JLabel("");
    lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("van.png")));
    lblNewLabel_1.setBounds(380, 11, 65, 60);
    getContentPane().add(lblNewLabel_1);
    
    JLabel fazerLoginLabel = new JLabel("Fa\u00E7a seu Login");
    fazerLoginLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
    fazerLoginLabel.setBounds(10, 106, 139, 60);
    getContentPane().add(fazerLoginLabel);
    
    JButton entrarButton = new JButton("Entrar");
    entrarButton.setBounds(203, 200, 133, 23);
    getContentPane().add(entrarButton);
    
    JButton esqueciSenhaButton = new JButton("Esqueci a senha");
    esqueciSenhaButton.setBounds(203, 243, 133, 23);
    getContentPane().add(esqueciSenhaButton);
    
    JLabel logoLabel = new JLabel("Fazer um logo");
    logoLabel.setBounds(42, 42, 103, 39);
    getContentPane().add(logoLabel);
    
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new TelaMotoristaEntrar();
  }
  
  
  public JTextField getSenhaField() {
    return senhaField;
  }

  public JTextField getLoginField() {
    return loginField;
  }

  public JButton getEntrarButton() {
    return entrarButton;
  }

  public JButton getEsqueciSenhaButton() {
    return esqueciSenhaButton;
  }
  
  
}
