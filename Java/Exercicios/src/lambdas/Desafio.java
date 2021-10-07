package lambdas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		//PREÇO COM O DESCONTO
		BinaryOperator<Double> precoComDesconto =
				(x, y) -> x * (1 - y);
				
		//IMPOSTO		
		Function<Double, Double> imposto =
				x -> x >= 2500 ? x * 1.085 : x;
			
		//FRETE
		Function<Double, Double> frete = 
				x -> x >= 3000 ? x + 100 : x + 50;
		
		double resultado = precoComDesconto.andThen(imposto).
				andThen(frete).apply(p.preco, p.desconto);
		
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.UP);
		
		System.out.println("O valor final é R$ " + df.format(resultado));
		
		
	}
}
