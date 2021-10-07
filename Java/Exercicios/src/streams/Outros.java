package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		//distinct serve para não pegar valores duplicados
		//que por padrão pega o endereço de memória, exceto se eu implementar o Equals
		System.out.println("Distinct: ");
		
		alunos.stream().distinct().forEach(System.out::println);
		
		
		
		//skip/limit fazem a paginação dentro de uma stream
		System.out.println("\nSkip/Limit");
		
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("\nCom o limit antes do skip");
		//observe-se que o limit limita o número daqueles que vão aparecer e o skip 
		//faz um pulo sobre esses valores que seriam limitados a aparecer
		//Quer dizer que o SKIP pula um daqueles que já foram anteriormente delimitados pelo LIMIT
		alunos.stream()
		.distinct()
		.limit(2)
		.skip(1)
		.forEach(System.out::println);
		
		
		System.out.println("\ntakeWhile");
		//pega elementos enquanto acontecer determinada condição
		//no caso abaixo, ele pega todos os alunos aprovados até que pegue
		//um aluno que não foi aprovado, caso em que ele interrompe o funcionamento
		//No caso abaixo ele vai parar na Ana porque a Luna logo após não foi aprovada
		alunos.stream()
		.distinct()
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
		
		
		
		
		
		
	}
}
