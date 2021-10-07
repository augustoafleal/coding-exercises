package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora2 {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Informe o primeiro número: ");
		double num1 = Double.parseDouble(valor1);
		
		String valor2 = JOptionPane.showInputDialog("Informe o segundo número: ");
		double num2 = Double.parseDouble(valor2);
		
		String operacao = JOptionPane.showInputDialog("Informe a operação entre + - * /: ");
	
			
		//processamento
		
		double resultado = "*".equals(operacao) ? num1 * num2 : 0;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "+".equals(operacao) ? num1 + num2 : resultado;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
				
					
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
				
					
	}

}

