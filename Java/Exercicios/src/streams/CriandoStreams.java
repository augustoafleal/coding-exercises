package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		//vamos usar bastante o method reference nesses exemplos
		//Exemplo de referência de método
		//O genérico como Object permite imprimir strings, números inteiros 
		//e quaisquer outros valores
		
		Consumer<Object> print = System.out::print;
		
		
		//PRIMEIRA FORMA - CRIANDO STREAM
		//Com o Stream.of eu crio uma Stream. O Stream.of é um método estático, que está sendo
		//acessado diretamente da interface
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		
		//SEGUNDA FORMA - PASSANDO UM ARRAY
		//No exemplo abaixo eu crio um array e com ele posteriormente 
		//eu crio direto a Stream sem criar uma nova Stream como no exemplo acima
		//porque eu já tenho os dados
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" } ;
		Stream.of(maisLangs).forEach(print);
		
		
		//TERCEIRA FORMA = A PARTIR DE ARRAYS.STREAM PASSANDO O ARRAY INTEIRO
		Arrays.stream(maisLangs).forEach(print);
		
		
		//QUARTA FORMA - USANDO ARRAYS.STREAM TAMBÉM
		//Porém, nesse caso eu seleciono quais eu quero imprimir, por conta do número aos lados
		//que representam o índice. No exemplo abaixo, o 1 representa o índice a ser impresso
		//e o 2 o elemento que já não mais será impresso
		//lembrando que o primeiro índice é 0
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
		//QUINTA FORMA - POR MEIO DE COLLECTIONS
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin \n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print); //no STREAM paralelo não são executados 
		//na mesma ordem
		
		//SEXTA FORMA - MÉTODO GENERATE que gera uma Stream potencialmente infinita,
		// sem uma ordem
		//dentro do generate pode ser passado um Lambda supplier que não recebe parâmetro e 
		//retorna algo
		//Stream.generate(() -> "a").forEach(print);
		
		//SÉTIMA FORMA - STREAM.ITERATE
		//TAMBÉM É POTENCIALMENTE INFINITA, mas nesse caso existe uma ordenação
		Stream.iterate(0, n -> n + 1).forEach(print);
		
		//(depois da vírgula fiz uma sequência, para ir gerando sucessivamente os números
	}
}
