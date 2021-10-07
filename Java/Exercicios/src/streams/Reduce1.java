package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total1 = nums.stream().reduce(soma).get(); //Integer evita erros para o caso de
		//ser null o resultado
		//o .get serve para pegar o resultado 
		System.out.println(total1);
		
		Integer total2 = nums.stream().reduce(100, soma);
		//Aqui não preciso passar o .get, porque sempre terá um valor inteiro
		System.out.println(total2);

		//Se eu passar um valor inicial, tenho que ter cuidado ao usar o parallelStream, pois não
		//assegura um resultado correto da soma
		
		//Resultado foi um Optional<Integer>
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println); //o ifPresent condiciona o valor entre os parênteses se
											//houver um resultado de fato na função anterior
		
	}

}
