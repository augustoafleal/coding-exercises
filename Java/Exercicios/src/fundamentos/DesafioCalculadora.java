package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: \n");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: \n");
		double num2 = entrada.nextDouble();

		System.out.println("Qual a operação desejada: * / + - ");
		String operacao = entrada.next();
		
		//processamento
		
		double resultado = "*".equals(operacao) ? num1 * num2 : 0;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "+".equals(operacao) ? num1 + num2 : resultado;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		
			
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
				
		entrada.close();		
		
	}

}
