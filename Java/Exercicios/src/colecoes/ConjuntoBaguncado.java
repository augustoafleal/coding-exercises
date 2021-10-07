package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })//comando feito para retirar
	//advertências que eram fornecidas porque os conjuntos eram heterogêneos, o que
	//o Java não recomenda. 
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		/* Como as collections não aceitam tipos primitivos, no caso abaixo
		 * haverá uma conversão automática dos dados para classes com wrappers
		 */
		
		conjunto.add(1.2);//aqui será convertido automaticamento do double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String (não converte porque já é objeto)
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		/* No caso abaixo, como estou adicionando dados repetidos, eles NÃO serão
		 * incluídos.
		*/
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size());

		//Removendo elementos do conjunto:		
		System.out.println(conjunto.remove("Teste"));//mando imprimir porque o
		//conjunto.remove é uma expressão booleana e aí se dá certo ele imprime TRUE
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho é: " + conjunto.size());
		
		//Para veriricar se detemrinado conteúdo está no conjunto
		//aqui o resultado será false, porque já removi o char 'x'
		System.out.println(conjunto.contains('x'));

		//aqui o resultado será true, porque há o int o mesmo 
		//com o boolean true abaixo
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		
		//Aqui é usado somente um Set, para mostrar que é possível
		//Não há diferença no caso abaixo da utilizaçõ que seria feita do HashSet
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//ao imprimir, a collection já implementa a exibição como forma de String
		System.out.println(nums);
		System.out.println(conjunto);
		
		
		//UNIÃO ENTRE DOIS CONJUNTOS, ALTERANDO O CONTEÚDO DE "CONJUNTO"
		//QUE APARECE ANTES DO ".addAll"
	//	conjunto.addAll(nums);
		
	//	System.out.println(conjunto);

		//INTERSEÇÃO: MANTÉM APENAS O QUE É COMUM ENTRE OS DOIS CONJUNTOS
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);

		//LIMPEZA DO CONJUNTO: ESVAZIA TODO O CONJUNTO
		conjunto.clear();
		
		System.out.println(conjunto);
		
	}

}
