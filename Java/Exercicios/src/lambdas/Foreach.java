package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) { 
			System.out.println(nome);
		}

		System.out.println("\nLambda #01...");
		
		//forEach é uma função e a expressão LAMBDA é o que está dentro dos parênteses
		//A expressão LAMBDA vai dizer o que a função vai fazer com cada um dos elementos da 
		//List
		
		aprovados.forEach((nome) -> { System.out.println(nome + "!!!"); });
		
		//Épossível retirar o par de chaves e os parênteses em volta de nome como abaixo 
		//porque há apenas um parâmetro e uma única expressão após a: (->)
		//aprovados.forEach(nome -> System.out.println(nome + "!!!") );
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		//os :: indica a função que estou passando para o forEach
		
		//-------------------------------------------------------
		
		//AGORA UTILIZANDO O MÉTODO CRIADO AO FINAL
		
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir); //Foreach após os parênteses é o nome da 
		//classe atual. Assim a expressão "Foreach::meuImprimir" substitui a função
		//"System.out::println" mencionada no Method Reference #01
		
		
	}
	//Criação de um método próprio
	static void meuImprimir (String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
