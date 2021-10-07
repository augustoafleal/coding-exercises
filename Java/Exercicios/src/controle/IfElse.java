package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		//conversao da variável para número inteiro ABAIXO
		int numero = Integer.parseInt(valor);
		
		//como descobrir se o número é PAR ou ÍMPAR
		
		if(numero % 2 == 0) {
			System.out.println("Número par.");
		}
		
		if(numero % 2 == 1) {
			System.out.println("Número ímpar.");
		}
		

		if(numero % 2 == 0) {
			System.out.println("Número par.");
		} else { 
			System.out.println("Número ímpar.");
		}
		
	}

}
