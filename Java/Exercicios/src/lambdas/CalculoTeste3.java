package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		//utilização de uma interface funcional pré-definida pelo Java, sem a necessidade
		//de eu criar uma interface
		
		//Como eu tenho que usar o Double (wrapper), eu não posso converter o número int
		//direto para o wrapper Double, somente o double para um Double,
		//por isso os valores abaixo informados tem os números com o algarismo depois da vírgula
		//2.0 e 3.0
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(2.0, 3.0));
		
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		

		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(2, 3));
		
		
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
		
	}
	
}