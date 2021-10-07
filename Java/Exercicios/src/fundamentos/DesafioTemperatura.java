package fundamentos;

import java.util.Scanner;

public class DesafioTemperatura {
	
	public static void main(String[] args) {
		
		// (oF variável - Constante 32) x Constante 5/9 = oC variável
		//variáveis e constantes
		final double AJUSTE = 32;
		final double DIVISAO = 5.0 / 9.0;
		double fahren;
		double celsius;
		
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o valor em ˚F a ser convertido: ");
		fahren = teclado.nextDouble();
		
		//processamento
		 celsius = (fahren - AJUSTE) * DIVISAO;
		
		//saída
		System.out.println("O valor em Celsius é: " + celsius + "˚C.");	
		
		teclado.close();
		
	}

}
