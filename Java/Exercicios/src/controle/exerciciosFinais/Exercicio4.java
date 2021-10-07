package controle.exerciciosFinais;

import java.util.Scanner;

public interface Exercicio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// entrada
		System.out.println("Informe um número: ");
		int num = scanner.nextInt();

		boolean a = false;

		while (num <= 1) {
			System.out.println("Número inválido.");
			System.out.println("Escolha um número maior que 1: ");
			num = scanner.nextInt();
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				a = true;
			}
		}

		if (a == true) {
			System.out.printf("O número escolhido %d não é primo.", num);
		} else {
			System.out.printf("O número escolhido %d é primo.", num);
		}

		scanner.close();

	}

}
