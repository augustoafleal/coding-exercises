package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		//notas de aluno
		double[] notasAlunoA = new double[4];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		
		//como imprimir
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); //caso em que 
		//é acessada a última nota do array. Usa-se o -1 porque o array parte do
		//0

		
		
		
	
		//Forma para pecorrer os arrays (usa-se o nomedavariável.length para 
		//percorrer até o último índice
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) { 
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		//Forma de inicializar o Array
		//O par de chaves define os valores do Array
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
