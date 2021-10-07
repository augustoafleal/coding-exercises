package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		
		//entrada
		String num1 = JOptionPane.showInputDialog("Informe o valor em Celsius para ser convertido:");
		
		double valorC = Double.parseDouble(num1);
		
		//processamento
		double valorF = (valorC * (9.00 / 5.00)) + 32;
		
		//saída
		System.out.printf("O valor em Farenheit é %.2f", valorF);
		

	}

}
