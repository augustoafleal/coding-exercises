package controle.exerciciosFinais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int soma = 0;
		int num;

		System.out.println("Informe um número: ");
		num = scanner.nextInt();

		while (num >= 0) {
			soma += num;
			System.out.println("A soma dos números inseridos é: " + soma);
			System.out.println("Informe um número: ");
			num = scanner.nextInt();
		}

		scanner.close();

	}

}
