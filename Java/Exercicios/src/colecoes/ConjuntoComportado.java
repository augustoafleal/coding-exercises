package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); //HashSet não garante
		//a ordem de inserção
		
		SortedSet<String> listaAprovados = new TreeSet<>(); //o TreeSet garante a ordem 
		//de inserção
		//O TreeSet funciona tendo um SortedSet à esquerda. À esquerda poderia
		//ser também o termo TreeSet.
		//SortedSet: conjunto que aceita alguma forma de ordenação
		
		
		//O tipo String inserido dentro dos <> chama GENERICS e significa 
		//que será esse o único tipo a estar incluído no conjunto
		//Pouco antes do ponto e vírgula, basta colocar só o <>, sem o valor 
		//String dentro, pois já foi colocado na extrema-esquerda ao lado do Set
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		//CONJUNTO TOTALMENTE DE NÚMEROS INTEIROS
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
		
	}

}
