package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//entradas		
		System.out.println("Informe o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Informe a sua altura: ");
		double altura = entrada.nextDouble();
		
		//processamento
		double imc = peso / (Math.pow(altura, 2));
		
		//saída
		System.out.printf("O peso informado é %.2f, a altura informada é %.2f e o IMC é %.2f.", peso, altura, imc);
		
		
		entrada.close();
	}

}
