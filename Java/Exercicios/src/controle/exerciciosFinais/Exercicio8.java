package controle.exerciciosFinais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe uma palavra: ");
		String word = scanner.nextLine();

		int limite = word.length();

		for (int i = 0; i < limite; i++) {
			System.out.println(word.charAt(i));
		}

		scanner.close();
	}

}
