package generics;

import java.util.List;

public class ListaUtil {
	
	//Ao trabalhar com coleções, posso pré-definir um MÉTODO sem o GENERICS
	
	
	//Ao lado de List eu posso colocar o segunite símbolo <?> que significa "qualquer
	//coisa", posso também colocar <Object>, que retornará um Object em geral, o que 
	//necessitará um Cast
	
	public static Object getUltimo1(List<?> lista) { 
		return lista.get(lista.size() -1);
		//o -1 é para retornar o último da lista, uma vez que a lista começa 
		//com o índice 0
	}
	
	
	//VERSÃO 2 DA FUNÇÃO COM UM TIPO GENERICS, RETORNANDO UM OBJETO DO TIPO "T"
	//APÓS O <T>, DE MODO QUE EU NÃO PRECISO MAIS ME PREOCUPAR COM O CAST
	public static <T> T getUltimo2(List<T> lista) { 
		return lista.get(lista.size() -1);
	}
	
	
	//POSSO TER MAIS DE UM PARÂMETRO GENÉRICO
	public static <A, B, C> C teste(A paramA, B paramB) { 
		C teste = null; 
		return teste;
	}
	
	 
	
}
