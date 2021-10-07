package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
		
		//entrada
		String num1 = JOptionPane.showInputDialog("Informe o valor em Farenheit:");
		
		double valorF = Double.parseDouble(num1);
		
		//processamento
		double valorC = (valorF - 32) * (5.00 / 9.00);
		
		//saída
		System.out.printf("O resultado em Celsius é %.2f", valorC);
		

	}

}
