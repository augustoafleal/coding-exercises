package lambdas;

import java.util.function.Function;

public class Funcao { 

	public static void main(String[] args) {
		
		//FUNCTION aceita um argumento e produz um resultado
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado é: " + valor;
		//Aqui poderia ser também um operador binário, pois há entrada e saída 
		//de valores do mesmo tipo
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
		Function<String, String> duvida = 
					valor -> valor + "???";
				
		
		
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado).apply(32);
		//Foi possível concatenar as duas funções em resultadoFinal porque a função parOuImpar
		//possui uma saída String e a função "oResultadoE" possui uma String de entrada
		//o mesmo ocorre com a função "empolgado"
		
		System.out.println(resultadoFinal1);
		
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida).apply(33);
		

		System.out.println(resultadoFinal2);
		
		
		System.out.println(parOuImpar.apply(32));
	}

}
