package controle.exerciciosFinais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int a = entrada.nextInt();

		if (a >= 0 && a <= 10 && a % 2 == 0) {

			System.out.println("O número informado está entre 0 e 10 e é um número par. ");

		} else {
			System.out.println("Valor incorreto.");
		}

		entrada.close();

	}

}
