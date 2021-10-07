package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		// 3 strings nextline salários de um funcionario e calcular a media dos ultimos tres salarios
		// o salario pode ser dividido por , ou por .
		//next line
		
		Scanner entrada = new Scanner(System.in);
		
		//entradas 
		System.out.println("Informe o primeiro salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe o segundo salário: ");
		String salario2 = entrada.nextLine().replace(",", "."); 
		
		System.out.println("Informe o segundo salário: ");
		String salario3 = entrada.nextLine().replace(",", "."); 
		
		//processamento
		Double salario1a = Double.parseDouble(salario1);
		Double salario2a = Double.parseDouble(salario2);
		Double salario3a = Double.parseDouble(salario3);
		
		//saída
		System.out.println("A média dos últimos três salários é: " + ((salario1a + salario2a + salario3a) / 3));
		
		
		
		entrada.close();
		
				
	}

}
