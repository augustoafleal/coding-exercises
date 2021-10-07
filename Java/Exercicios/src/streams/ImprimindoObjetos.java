package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando um laço for comum.");
		//usando um laço for
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println();
		System.out.println("Usando o forEach.");
		//usando o forEach
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println();
		System.out.println("Usando o Iterator.");
		//interface com o iterator é como se perguntasse "tem próximo? 
		//Se tiver, dê o próximo elemento), caso em que utilizo o while 
		//para trabalhar conjuntamente
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		System.out.println();
		//utilizando STREAM (STREAM É UMA SEQUÊNCIA DE DADOS)
		//o tipo é definido a partir do generics, que fica dentro do <> 
		//pode ser até algo bem genérico como "object"
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //laço interno!!!
		
		
	}

}

