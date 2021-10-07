package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {
	//com o extends eu especifico que a generic "C" sempre seja herdeira da 
	//classe Numbers

	
	//Abaixo (comentado) exemplo especificando o tipo específico
	//private final SortedSet<Par<String, Boolean>> itens = new TreeSet<>();
	
	//E agora, não comentado, utilizando tipos genéricos também no Set, em acordo
	//com os generics apontados ao lado do nome da classe Pares no início desta Classe
	
	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	//o LinkedHashSet garante a ordem de inserção, diferentemente do TreeSet que 
	//depende de um comparable, porque é a partir do comparable que ele define como
	//os dados serão incluídos
	
	public void adicionar(C chave, V valor) { 
		if (chave == null) return;
		//chamando o return desta forma e sendo a chave for nula, o return faz
		//com que se saia do método sem prosseguir com as outras funções
		
		
		//Logo abaixo eu uso um "if" para os dados que estão dentro do Set 
		//quanto ao tipo CHAVE, especificamente para introduzir os novos dados,
		//referentes ao tipo valor, porque posso querer atualizar dentro do par 
		//justamente o tipo VALOR 
		
		//Isso ocorre porque o EQUALS da classe Par somente verifica 
		//a semelhança de CHAVES e eu posso querer atualizar o VALOR passado
		//então eu REMOVO de SorteSet itens o valor de CHAVE que lá consta 
		//(em conjunto com o tipo VALOR) e posteriormente ADICIONO os novos valores
		//informados que vão conter uma MESMA CHAVE, mas possivelmente um VALOR DIVERSO
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		if(itens.contains(novoPar)) { 
			itens.remove(novoPar);
		}
			
		itens.add(novoPar);
	}
	
	public V getValor(C chave) { 
		if(chave == null) return null;
		//mesmo caso do método "adicionar" acima, mas aqui eu preciso retornar um valor 
		//porque o método possui um V como return, por isso uso um RETURN NULL
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
	
}
