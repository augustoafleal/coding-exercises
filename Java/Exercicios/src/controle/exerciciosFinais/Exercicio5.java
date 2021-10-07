package controle.exerciciosFinais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// entrada
		System.out.println("Informe um número: ");
		int a = scanner.nextInt();

		int b = 0;

		while (a <= 1) {
			System.out.println("Número inválido.");
			System.out.println("Escolha um número maior que 1: ");
			a = scanner.nextInt();
		}

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				b = 1;
			}
		}
		// processamento
		switch (b) {
		case 1:
			System.out.println("O número " + a + " não é primo.");
			break;
		default:
			System.out.println("O número " + a + " é primo.");
		}

		scanner.close();
	}

}
