package controle.exerciciosFinais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// entradas
		System.out.println("Informe a primeira nota: ");
		double nota1 = scanner.nextDouble();

		System.out.println("Informe a segunda nota: ");
		double nota2 = scanner.nextDouble();

		// processamento
		double nota3 = (nota1 + nota2) / 2;

		// saídas
		if (nota3 >= 7) {
			System.out.printf("Média: %.2f. Aprovado.", nota3);
		} else if (nota3 < 7 && nota3 > 4) {
			System.out.printf("Média: %.2f. Recuperação.", nota3);
		} else {
			System.out.printf("Média: %.2f. Reprovado", nota3);
		}

		scanner.close();

	}

}
