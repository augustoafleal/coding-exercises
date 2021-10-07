package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe um valor: ");
		double valor = entrada.nextDouble();
		
		//processamento
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		//saída
		System.out.printf("O quadrado do valor informado é %.2f e o cubo é %.2f", quadrado, cubo);
		
		entrada.close();
	}

}
