package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//entrada soma geral das notas
		double totalNotas = 0;
		
		//entrada do número de notas a ser calculado
		System.out.println("Informe o número de notas a ser inserido: ");
		int numeroNotas = scanner.nextInt();
		double[] notas = new double[numeroNotas];
		
		//laço para inserir notas
		for(int i = 0; i < numeroNotas; i++) {
			System.out.printf("Informe a nota %d/%d: ", (i + 1), numeroNotas);
			notas[i] = scanner.nextDouble();
			System.out.printf("Nota informada %.2f.\n", notas[i]);
		}
		
		//laço para somar notas
		for(double notasSoma: notas) {
			totalNotas += notasSoma;
		}
		
		System.out.printf("Foi informado um total de %d notas.\n", numeroNotas);
		System.out.printf("A média do aluno é %.2f.", (totalNotas / numeroNotas));
		
		
		scanner.close();
		
		

	}

}
