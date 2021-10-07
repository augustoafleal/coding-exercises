package controle;

import java.util.Scanner;

public class DesafioWhileIndeterminado {

	public static void main(String[] args) {
		
		/*
		 * EXISTE UMA FORMA MAIS SIMPLES UTILIZANDO A NEGAÇÃO DO EQUALS, 
		 * COMO NO EXEMPLO DO ARQUIVO: WhileIndeterminado.java
		 */
		
		
		Scanner entrada = new Scanner(System.in);		
		
//		System.out.println("Digite algo: ");
//		String a = entrada.next();
//
		boolean b = false;
		
		while(b == false) { 
			System.out.println("Resposta");
			
			System.out.println("Digite algo: ");
			String a = entrada.next();

			b = "Sair".equalsIgnoreCase(a);
			
		}

		entrada.close();
		
	}

}
