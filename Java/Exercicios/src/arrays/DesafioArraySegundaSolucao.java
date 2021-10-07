package arrays;

import java.util.Scanner;

public class DesafioArraySegundaSolucao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double soma = 0;
		
		System.out.println("Informe o número de notas: ");
		int numeroNotas = scanner.nextInt();
		double[] notas = new double[numeroNotas];
		
		for(int i = 0; i < numeroNotas; i++) { 
			System.out.println("Informe a nota: ");
			notas[i] = scanner.nextDouble();
			soma += notas[i];			
		}
		System.out.println(soma);
		System.out.println("O resultado da média é: " + (soma / numeroNotas));
		
		
		
		
		
		
		scanner.close();

	}

}
