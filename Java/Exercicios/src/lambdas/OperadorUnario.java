package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
	//NO UNÁRIO O TIPO DE ENTRADA É O MESMO TIPO DA SAÍDA
	//POR TER APENAS UM ÚNICO TRABALHO HABILITA O REUSO, COMO OCORRE TAMBÉM NA FUNCTION
		
		
		UnaryOperator<Integer> maisDois = n -> n + 2;

		UnaryOperator<Integer> vezesDois = n -> n * 2;
		
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1); //resultado será 16
		
		
		
		//Além do andThen tem o compose, só que ele faz ao contrário:		
		//Na leitura seria assim: antes de fazer o resultado aoQuadrado, faça vezes dois
		//e antesd e fazer vezesDois faça maisDois
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2); //resultado será igualmente 16
		
	
		
		
		
	}

}
