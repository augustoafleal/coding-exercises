package controle.exerciciosFinais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = 11;

		System.out.println("Você tem dez tentativas para acertar o número.");

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Chance %d/10: ", i);
			int num2 = scanner.nextInt();

			if (num2 == num) {
				System.out.println("Parabéns, você acertou!");
				break;
			} else if (num2 > num) {
				System.out.println("O número é menor.");
			} else if (num2 < num) {
				System.out.println("O número é maior.");
			}
		}

		scanner.close();

	}
}
