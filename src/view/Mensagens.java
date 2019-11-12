package view;

import javax.swing.JOptionPane;

public class Mensagens {
	public static void mensagem(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	public static boolean mensagemConfirmacao(String texto) {
		if(JOptionPane.showConfirmDialog(null, texto,"Alerta",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
			return true;
		}else {
			return false;
		}
	}
}
