package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		//%n é usado para quebrar a linha		
		
		System.out.printf("Salário: %.1f%n", 1234.5678);

		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		//A saída padrão é a tela e a entrada padrão é o teclado
		//new é uma expressão reservada da linguagem java
		//nextLine é para string
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();

	}

}
