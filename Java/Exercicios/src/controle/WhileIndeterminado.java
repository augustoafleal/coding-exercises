package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String a = "";
		
		while(!a.equalsIgnoreCase("Sair")) {
			System.out.println("Digite: ");
			a = entrada.next();
			
		}
		
		entrada.close();
		
		
	}

}
