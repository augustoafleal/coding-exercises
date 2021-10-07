package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterProduto {
	
	public static void main(String[] args) {
		
		//Criando coleção e instanciando direto nela
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Notebook", 1099.99, false, false));
		produtos.add(new Produto("Calculadora", 399.99, true, false));
		produtos.add(new Produto("Monitor", 5049.00, true, true));
		produtos.add(new Produto("Mouse", 78.50, true, true));
		
		//Criando funções
		Predicate<Produto> desconto = d -> d.desconto;
		Predicate<Produto> freteGratis = f -> f.freteGratis;
		Function<Produto, String> anuncio = a -> "Aproveite a oferta: " + a.nome 
				+ ". Com desconto de 30%: " + String.format("%.2f", a.preco * (1 - 0.3)) + ". Com frete grátis!";
		
		//Utilizando a stream
				
		produtos.stream()
				.filter(desconto)
				.filter(freteGratis)
				.map(anuncio)
				.forEach(System.out::println);
				
		/* 	PARA ENVIAR PARA UMA NOVA COLLECTION O RESULTADO, PODE-SE USAR OS SEGUINTES COMANDOS:
		 * 	1.	.collect(Collectors.toCollection(() -> nomeDaNovaCollection));
		 * 	2.  .collect(Collectors.toList());
		 */
		
	}

}
