package controle.exerciciosFinais;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int maior = 0;

		for (int i = 1; i < 11; i++) {
			System.out.printf("Informe um número %d/10: ", i);
			int num = scanner.nextInt();
			if (num > maior) {
				maior = num;
			}
		}

		System.out.println("O maior número é: " + maior);

		scanner.close();
	}

}
