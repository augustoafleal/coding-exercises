package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizProfessor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		//entradas
		System.out.println("Quantos alunos? ");
		int qtdeAlunos = scanner.nextInt();
		
		System.out.println("Quantas notas? ");
		int qtdeNotas = scanner.nextInt();
		
		//criação da matriz
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		//processamento
		double total = 0;
		for(int a = 0; a < notasDaTurma.length; a++) {
			for(int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", 
						(n + 1), (a + 1));
				notasDaTurma[a][n] = scanner.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é " + media);
		
		
		for (double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		/*
		 * Note que notasDaTurma é um array que 
		 * possui outros arrays dentro. O for(double[] notasDoAluno : notasDaTurma) 
		 * quer dizer "para cada array de doubles "(double[]) "
		 * que existem dentro de notasDaTurma...".
		 */
		
		System.out.print(Arrays.deepToString(notasDaTurma));

		scanner.close();

	}

}
