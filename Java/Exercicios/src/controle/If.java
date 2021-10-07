package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//entrada		
		System.out.println("Informe a média: ");		
		double media = entrada.nextDouble();
		
		//processamento
		if(media <= 10 && media >= 7.0){
			System.out.println("Aprovado.");
			System.out.println("Parabéns.");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação.");
		}
		
		
		//CASO SEJA USADO MAIS DE UMA VEZ VALE A PENA CRIAR UM VALOR BOOLEANO COMO ABAIXO
		
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if(criterioReprovacao) {
			System.out.println("Reprovado.");
		}
		
		entrada.close();

	}

}
