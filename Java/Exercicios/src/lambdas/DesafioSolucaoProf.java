package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioSolucaoProf {

	public static void main(String[] args) {
		

		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
				
		UnaryOperator<Double> impostoMunicipal = 
				x -> x >= 2500 ? x * 1.085 : x;
		
		UnaryOperator<Double> frete = 
				x -> x >= 3000 ? x + 100 : x + 50;
		
		UnaryOperator<Double> arredondar = 
				x -> Double.parseDouble(String.format("%.2f", x).replace(",", "."));
				//uso o replace aqui porque o "String.format" traz um resultado com vírgula
				//e esse resultado com VÍRGULA não pode ser transformado em DOUBLE com o eclipse
				//configurado em PORTUGUÊS
		
		Function<Double, String> formatar = 
				x -> ("O resultado é R$ " + x).toString().replace(".", ",");//eu posso colocar
		//o ponto e utilizar o .toString().replace logo depois da expressão entre parênteses
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(preco);
		
											
	}
	
}
