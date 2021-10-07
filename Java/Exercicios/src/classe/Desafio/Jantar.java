package classe.Desafio;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//objeto pessoa
		Pessoa p1 = new Pessoa();
		
		System.out.println("Informe o nome da pessoa: ");
		p1.nomePessoa = scanner.next();
		
		System.out.println("Informe o peso da pessoa: ");
		p1.pesoPessoa = scanner.nextDouble();
		
		//objetos comidas
		Comida c1 = new Comida();
		
		System.out.println("Informe o nome da primeira comida: ");
		c1.comida = scanner.next();
		c1.comida = c1.comida.toLowerCase();
		
		System.out.println("Informe o peso da primeira comida: ");
		c1.pesoComida = scanner.nextDouble();
		
		Comida c2 = new Comida();
		
		System.out.println("Informe o nome da segunda comida: ");
		c2.comida = scanner.next();
		c2.comida = c2.comida.toLowerCase();
		
		System.out.println("Informe o peso da segunda comida: ");
		c2.pesoComida = scanner.nextDouble();
		
		//janta
		p1.comer(c1);
		p1.comer(c2);
		
				//pesoFinal = p1.pesoPessoa + c1.pesoComida + c2.pesoComida;
		
		//saída
		System.out.printf("A pessoa se chama %s e pesa %.2fkg.\n", 
				p1.nomePessoa, p1.pesoPessoa);
		System.out.printf("A primeira comida escolhida foi %s e tinha o peso de %.2fkg.\n", 
				c1.comida, c1.pesoComida);
		System.out.printf("A segunda comida escolhida foi %s e tinha o peso de %.2fkg.\n", 
				c2.comida, c2.pesoComida);
		System.out.printf("O peso de %s após se alimentar é: %.2fkg\n", 
				p1.nomePessoa, p1.pesoPessoa);
		
		
		scanner.close();
	}

}
