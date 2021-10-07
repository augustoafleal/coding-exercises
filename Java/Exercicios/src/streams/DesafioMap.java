package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Consumer<Object> print = System.out::println;
		
		//Transformar em string binária
		Function<Integer, String> stringBinaria = n -> Integer.toBinaryString(n);
		
		//Inverter a string
		UnaryOperator<String> inversao = n -> new StringBuilder(n).reverse().toString();
		//é necessário usar o "toString" para converter novamente para String o que 
		//foi utilizado no StringBuilder
		
		//Converter String para inteiro
		Function<String, Integer> converterParaInteiro = n -> Integer.parseInt(n, 2);
		
		nums.stream()
			.map(stringBinaria) //se eu não tivesse criado uma função poderia usar um
			//method reference ".map(Integer::toBinaryString)"
			.map(inversao)
			.map(converterParaInteiro)
			.forEach(print);
		
	}
	
	
}
