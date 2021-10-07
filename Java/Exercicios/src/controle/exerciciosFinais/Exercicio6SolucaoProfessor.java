package controle.exerciciosFinais;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6SolucaoProfessor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int continuar, numeroSorteado, tentativas, numero;

		do {
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativa %d/10: ", tentativas);
				numero = scanner.nextInt();

				if (numero > numeroSorteado) {
					System.out.println("O número sorteado é menor.");
				} else if (numero < numeroSorteado) {
					System.out.println("O número sorteado é maior.");
				} else {
					System.out.printf("Parabéns, você acertou em %d tentativas.", tentativas);
				}

			} while (numero != numeroSorteado && tentativas < 10);

			System.out.println("Digite 0 para sair ou outro número para continuar.");
			continuar = scanner.nextInt();

		} while (continuar != 0);

		scanner.close();

	}

}
