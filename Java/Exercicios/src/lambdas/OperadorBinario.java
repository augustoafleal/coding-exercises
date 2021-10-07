package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	//RECEBE DOIS VALORES E DÁ APENAS UM ÚNICO RESULTADO
	//POR RECEBER DOIS PARÂMETROS DE ENTRADA NÃO ADMITE REUTILIZAÇÃO
	//PORÉM, PODE SER ENCADEADO COM OUTRA INTERFACE FUNCTION QUE REQUER APENAS UM PARÂMETRO DE 
	//ENTRADA
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado: " + m : "Reprovado: " + m;
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));
		
		
		//O BIFUNCTION FARÁ SOZINHO AQUILO QUE EU PRECISEI DO BINARYOPERATOR E DA FUNCTION
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
				double notaFinal = (n1 + n2) / 2; 
				return notaFinal >= 7 ? "Aprovado: " + notaFinal: "Reprovado: " + notaFinal; };
				
		System.out.println(resultado.apply(9.7, 4.1));
				
				
				
		
		
		
		
		
		
		
		
		
	}

}
