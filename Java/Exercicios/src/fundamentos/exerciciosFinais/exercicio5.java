package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o valor da base do triângulo: ");
		double b = entrada.nextDouble();
		
		System.out.println("Informe a altura do triângulo: ");
		double h = entrada.nextDouble();
		
		//processamento
		double area = (b * h) / 2.00;
		
		//saída
		System.out.println("A área do triângulo é: " + area);
		
			
		entrada.close();

	}

}
