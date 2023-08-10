package aula1;

import javax.swing.JOptionPane;

public class JOptionPanel {

	public static void main(String[] args) {
				
		String nome = JOptionPane.showInputDialog(null, "Infome seu nome",
				"Nome", JOptionPane.INFORMATION_MESSAGE);
		
		String idade = JOptionPane.showInputDialog(null, "Infome sua idade",
				"Idade", JOptionPane.INFORMATION_MESSAGE);
		
		String data = JOptionPane.showInputDialog(null, "Infome sua data de nascimento",
				"Nascimento", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " você tem "
				+ idade + " de idade e nasceu em " + data, "Importante",
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
