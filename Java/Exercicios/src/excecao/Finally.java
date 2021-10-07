package excecao;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		try {
			
			System.out.println(7 / entrada.nextInt());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally  { 
			System.out.println("Finally #01...");
			//entrada.close();
			
			//O finally sempre será chamado, e serve para forçar o encerramento
			//do teclado, mesmo tendo ocorrido um problema
			//Mesmo o que seja uma exceção do tipo ERROR, por exemplo OutOfMemoryError
			//Aqui o fechamento do teclado está como comentário porque eu uso o teclado
			//no próximo exemplo 
		}
		
		//No exemplo abaixo eu não uso o catch para tratar o erro, apenas para 
		//demonstrar como SEMPRE o finally será chamado
		try {
			System.out.println(7 / entrada.nextInt());
			
		} finally  { 
			System.out.println("Finally #02...");
			entrada.close();
		}
		
		System.out.println("Fim.");
	}

}
