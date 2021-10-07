package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//entrada soma geral das notas
		double totalNotas = 0;
		
		//entrada do número de alunos e de notas a ser calculado
		System.out.println("Informe o número de alunos a ser inserido: ");
		int numeroAlunos = scanner.nextInt();
		
		System.out.println("Informe o número de notas a ser inserido: ");
		int numeroNotas = scanner.nextInt();
		
		double[][] notas = new double[numeroAlunos][numeroNotas];
		
		//laço para inserir notas
		for(int i = 0; i < numeroAlunos; i++) {
			for(int y = 0; y < numeroNotas; y++) {
				System.out.printf("Informe a nota %d/%d: ", (y + 1), numeroNotas);
				notas[i][y] = scanner.nextDouble();
				//System.out.printf("Nota informada %.2f.\n", notas[y]);
				totalNotas += notas[i][y];
			}
		}
				
		System.out.printf("Foi informado um total de %d notas por aluno.\n", numeroNotas);
		System.out.printf("E o número geral de notas foi %d.\n", numeroNotas * numeroAlunos);
		System.out.printf("A média geral dos alunos é %.2f.", 
				(totalNotas / (numeroAlunos * numeroNotas)));
		
		
		scanner.close();

	}

}
