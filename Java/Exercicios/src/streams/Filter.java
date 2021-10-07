package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		//----------------- Predicate<Aluno> Aprovado = a -> a.nota >= 7; ----------------
		
		//No caso, ao invés de usar o lambda acima (Predicate), eu passei o lambda
		//diretamente no ".filter" abaixo
		
		alunos.stream()
		//é possível colocar as funções direto no Filter e Map como abaixo, ao invés
		//de criar elas anteriormente
		.filter(a -> a.nota >= 7)
		.map(a -> "Parabéns, " + a.nome + "! Você foi aprovado(a)!") 
		.forEach(System.out::println);
		
	
		
	}
	
	

}
