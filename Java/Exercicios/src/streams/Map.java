package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		//operação de build inicia e vai até o stream() 
		//depois começo com o map
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		
		//FAZENDO COMPOSIÇÃO COM MAP
	//	UnaryOperator<String> maiscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";//concateno
		//com uma string vazia para gerar uma nova string com o caractere gerado
	
	// UnaryOperator<String> grito = n -> n + "!!! ";
 		
		//abaixo uso também funções criadas na classe Utilitarios.java (Utilitarios.maiuscula)
		//por exemplo, os quais que podem ser utilizadas por outras classes também
		System.out.println("\n\nUsando composição.");
		marcas.stream()
		.map(Utilitarios.maiscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
		
		
	}
	
}
